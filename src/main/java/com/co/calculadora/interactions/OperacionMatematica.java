package com.co.calculadora.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class OperacionMatematica implements Interaction {

    private String idNumero1;
    private String idOperador;
    private String idNumero2;
    private Target campoListaNumeros;

    public OperacionMatematica(String idNumero1, String idOperador, String idNumero2, Target campoListaNumeros) {
        this.idNumero1 = idNumero1;
        this.idOperador = idOperador;
        this.idNumero2 = idNumero2;
        this.campoListaNumeros = campoListaNumeros;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        realizarOperacion(idNumero1, idOperador, idNumero2, campoListaNumeros,actor);
    }

    public void realizarOperacion(String idNumero1, String idOperador, String idNumero2,
                                  Target campoListaNumeros, Actor actor){
        List<WebElementFacade> listaNumeros = campoListaNumeros.resolveAllFor(actor);
        for (int f = 0; f < listaNumeros.size(); f++) {
            if (listaNumeros.get(f).getText().equals(idNumero1)) {
                listaNumeros.get(f).click();
            }
        }
    }

    public static OperacionMatematica enLaApp(String idNumero1, String idOperador, String idNumero2,
                                              Target campoListaNumeros){
        return new OperacionMatematica(idNumero1, idOperador, idNumero2, campoListaNumeros);
    }
}