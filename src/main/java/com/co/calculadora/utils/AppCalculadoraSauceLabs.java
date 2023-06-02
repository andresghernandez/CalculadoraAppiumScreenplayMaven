package com.co.calculadora.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppCalculadoraSauceLabs {

    public WebDriver myDriver;
    public static AppCalculadoraSauceLabs onThePhone(){
        return new AppCalculadoraSauceLabs();
    }

    public WebDriver getMyDriver() {
    	
    	MutableCapabilities caps = new MutableCapabilities();
    	caps.setCapability("platformName","Android");
    	caps.setCapability("appium:deviceName","Android GoogleAPI Emulator");
    	caps.setCapability("appium:deviceOrientation", "portrait");
    	caps.setCapability("appium:platformVersion","12.0");
    	caps.setCapability("appium:automationName", "UiAutomator2");
    	caps.setCapability("appium:app", "storage:filename=calculator-7-8-271241277.apk");
    	MutableCapabilities sauceOptions = new MutableCapabilities();
    	sauceOptions.setCapability("build", "Calculadora");
    	sauceOptions.setCapability("name", "Test calculadora");
    	caps.setCapability("sauce:options", sauceOptions);
    	
        try {
            myDriver = new AppiumDriver<>(new URL("https://andreshernandezautomatizacion:bc21f023-3aa7-4805-81eb-a58bdbf57577@ondemand.us-west-1.saucelabs.com:443/wd/hub"),caps);
        }catch (MalformedURLException e) {} return myDriver;
        
    }
}
