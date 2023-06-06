package com.co.calculadora.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppCalculadoraPerfectoMobile {

    public WebDriver myDriver;
    public static AppCalculadoraPerfectoMobile onThePhone(){
        return new AppCalculadoraPerfectoMobile();
    }

    public WebDriver getMyDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
		String cloudName = "trial";

		// 2. Replace <<security token>> with your Perfecto security token.
		String securityToken = "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE2ODU3MzYzODUsImp0aSI6IjVkZjdhMjI4LWI2ODMtNDg1Ny1hNDU1LTcyYjVlNDI3MjM0YSIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6IjBhMWJlMGI2LTRmZWUtNGFmNy04ZTIyLTY3NDdhOGNhNTZkNyIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiZWNlODZjNTAtZDliZC00YWRhLThkMjQtMjMyMDU0ZjZkYzUyIiwic2Vzc2lvbl9zdGF0ZSI6ImUwOGY3MGJiLWZmMmUtNDI2YS04ZjQzLWIxZjgyNmExMzgwYyIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwifQ.v4YGbI_WTEEutsPzncpbvh_0piuCCBDNEfwqIi_woZw";
        
        
        capabilities.setCapability("securityToken", securityToken);

		// 3. Set the device capabilities.
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("platformBuild", "QP1A.190711.020.G960FXXSBETH1");
        capabilities.setCapability("location", "EU-DE-FRA");
        capabilities.setCapability("resolution", "1440x2960");
        capabilities.setCapability("deviceStatus", "CONNECTED");
        capabilities.setCapability("manufacturer", "Samsung");
        capabilities.setCapability("model", "Galaxy S9");

		// 4. Set the Perfecto media repository path of the app under test.
		capabilities.setCapability("app", "PRIVATE:1685735563009_calculator-7-8-271241277.apk");

		// 5. Set the unique identifier of your app - this is highly recommended
		//capabilities.setCapability("appPackage", "YOUR.APP.APPPACKAGE");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		// 6. Set other capabilities.
		capabilities.setCapability("enableAppiumBehavior", true); // Enable the new Appium Architecture.
		capabilities.setCapability("autoLaunch", true); // Whether to install and launch the app automatically.
		capabilities.setCapability("autoInstrument", true); // To work with hybrid applications, install the iOS/Android application as instrumented.
		capabilities.setCapability("takesScreenshot", true);
		capabilities.setCapability("screenshotOnError", true);
		// capabilities.setCapability("fullReset", false); // Reset the app state by uninstalling the app.

		
		
		
        try {
            myDriver = new AppiumDriver<>(new URL("https://" + cloudName.replace(".perfectomobile.com", "")
			+ ".perfectomobile.com/nexperience/perfectomobile/wd/hub"),capabilities);
        }catch (MalformedURLException e) {} return myDriver;
    }
}
