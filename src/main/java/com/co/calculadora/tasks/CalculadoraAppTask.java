package com.co.calculadora.tasks;

import com.co.calculadora.interactions.OperacionMatematica;
import com.co.calculadora.userinterfaces.CalculadoraAppUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.calculadora.userinterfaces.CalculadoraAppUserInterfaces.*;

public class CalculadoraAppTask implements Task {

	private String idNumero1;
	private String idOperador;
	private String idNumero2;

	public CalculadoraAppTask(String idNumero1, String idOperador, String idNumero2) {
		this.idNumero1 = idNumero1;
		this.idOperador = idOperador;
		this.idNumero2 = idNumero2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(NUMERO_9), Click.on(NUMERO_7), Click.on(OPERADOR_MAS), Click.on(NUMERO_6),
				Click.on(NUMERO_0), Click.on(OPERADOR_IGUAL));

		// actor.attemptsTo(OperacionMatematica.enLaApp(idNumero1, idOperador,
		// idNumero2, LISTA_BOTONES_CALCULADORA));
	}

	public static CalculadoraAppTask enLaApp(String idNumero1, String idOperador, String idNumero2) {
		return Tasks.instrumented(CalculadoraAppTask.class, idNumero1, idOperador, idNumero2);
	}
}
