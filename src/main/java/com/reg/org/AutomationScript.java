package com.reg.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationScript {

	@Test
	public void testStaticRegister() {
		
		System.setProperty("webdriver.chrome.driver", "./resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://192.168.0.3:8083/webapp");
		
		driver.findElement(By.id("userid")).sendKeys("Sreejith");
		driver.findElement(By.id("password")).sendKeys("Sreejith");
	}
	
}
