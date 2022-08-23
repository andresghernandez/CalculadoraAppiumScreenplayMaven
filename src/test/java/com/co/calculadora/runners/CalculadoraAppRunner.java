package com.co.calculadora.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.co.calculadora.stepdefinitions",
        tags = {"@operacionesCalculadora"}
)
public class CalculadoraAppRunner {
}
