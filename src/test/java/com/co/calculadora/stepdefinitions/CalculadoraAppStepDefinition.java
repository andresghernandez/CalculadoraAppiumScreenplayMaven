package com.co.calculadora.stepdefinitions;

import com.co.calculadora.tasks.CalculadoraAppTask;
import com.co.calculadora.utils.AppCalculadora;
import com.co.calculadora.utils.AppCalculadoraSauceLabs;
import com.co.calculadora.utils.DataDrivenExcel;
import com.co.calculadora.utils.Excel;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.co.calculadora.utils.Constantes.NICOLAS;

public class CalculadoraAppStepDefinition {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();
    @Before
    public void serTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Nicolas");
    }

    @Given("^que Nicolas ingresa a la aplicacion de la calculadora (\\d+)$")
    public void que_Nicolas_ingresa_a_la_aplicacion_de_la_calculadora(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        NICOLAS.can(BrowseTheWeb.with(AppCalculadora.onThePhone().getMyDriver()));
        //NICOLAS.can(BrowseTheWeb.with(AppCalculadoraSauceLabs.onThePhone().getMyDriver()));
    }

    @When("^realiza operaciones matematicas$")
    public void realiza_operaciones_matematicas() {
        NICOLAS.wasAbleTo(CalculadoraAppTask.enLaApp(data.get("Numero1"), data.get("Operador"), data.get("Numero2")));
    }

    @Then("^puede validar el resultado obtenido$")
    public void puede_validar_el_resultado_obtenido() {

    }
}