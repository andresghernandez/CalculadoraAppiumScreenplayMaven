package com.co.calculadora.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class CalculadoraAppUserInterfaces extends PageObject {

    
	public static final Target LISTA_BOTONES_CALCULADORA= Target.the("Botones Calculadora").located(By.xpath("//*[@class=\"android.view.ViewGroup\"]"));
	public static final Target NUMERO_9 = Target.the("NUMERO 9").located(By.id("com.google.android.calculator:id/digit_9"));
	public static final Target NUMERO_6 = Target.the("NUMERO 6").located(By.id("com.google.android.calculator:id/digit_6"));
	public static final Target NUMERO_7 = Target.the("NUMERO 7").located(By.id("com.google.android.calculator:id/digit_7"));
	public static final Target NUMERO_0 = Target.the("NUMERO 0").located(By.id("com.google.android.calculator:id/digit_0"));
	public static final Target OPERADOR_MAS = Target.the("OPERADOR_MAS").located(By.id("com.google.android.calculator:id/op_add"));
	public static final Target OPERADOR_MENOS = Target.the("OPERADOR_MENOS").located(By.id("com.google.android.calculator:id/op_sub"));
	public static final Target OPERADOR_MULTIPLICAR = Target.the("OPERADOR_MULTIPLICAR").located(By.id("com.google.android.calculator:id/op_mul"));
	public static final Target OPERADOR_IGUAL = Target.the("OPERADOR_IGUAL").located(By.id("com.google.android.calculator:id/eq"));
}
