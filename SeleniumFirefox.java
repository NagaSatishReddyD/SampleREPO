package com.seleniumFirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {

	public static void main(String[] args) {
		String currentPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", currentPath+"//lib//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9492481498");
	}

}
