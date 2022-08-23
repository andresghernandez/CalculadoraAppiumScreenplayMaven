package com.co.calculadora.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppCalculadora {

    public WebDriver myDriver;
    public static AppCalculadora onThePhone(){
        return new AppCalculadora();
    }

    public WebDriver getMyDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability("nonSet", "false");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        try {
            myDriver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        }catch (MalformedURLException e) {} return myDriver;
    }
}
