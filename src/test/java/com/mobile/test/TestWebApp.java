package com.mobile.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

public class TestWebApp {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		UiAutomator2Options option = new UiAutomator2Options();
			option.setUdid("R5CR41FXW5T");
			option.withBrowserName("Chrome");
			
			AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),option);
			driver.get("http://google.com");
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Hello Appium!!!");
			Thread.sleep(4000);
			driver.quit();
		
	}
}
