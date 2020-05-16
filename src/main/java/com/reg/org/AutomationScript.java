package com.reg.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationScript {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("http://192.168.0.4:8083/webapp");
		
	}

	@Test
	public void testStaticRegister() {
		
		
		
		driver.findElement(By.id("userid")).sendKeys("Sreejith");
		driver.findElement(By.id("password")).sendKeys("Sreejith");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
