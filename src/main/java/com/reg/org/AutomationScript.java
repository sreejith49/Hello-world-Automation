package com.reg.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
		driver.manage().window().maximize();
		
	}

	@Test
	public void testStaticRegister() {
		
		
		
		driver.findElement(By.id("name")).sendKeys("Sreejith");
		driver.findElement(By.id("mail")).sendKeys("sreejith49@live.com");
		driver.findElement(By.id("password")).sendKeys("Sreejith");
		driver.findElement(By.id("over_13")).click();
		driver.findElement(By.id("bio")).sendKeys("This is an automation test created for test execution in CI-CD mode");
		Select selectRole = new Select(driver.findElement(By.id("job")));
		selectRole.selectByVisibleText("Business Owner");
		driver.findElement(By.id("business")).click();
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		


	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
