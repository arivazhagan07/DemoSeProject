package com.automationA.DemoSeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestClass1 {
	
	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser( ) {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();

	}

	@Test
	public void Test1( ) {

	driver.navigate().to("https://www.google.com/?safe=active&ssui=on");
	System.out.println("Test1 Title is : "+driver.getTitle());
	}

	@Test
	public void Test2( ) {
	driver.navigate().to("https://www.google.com/?safe=active&ssui=on");
	System.out.println("Test2 Title is : "+driver.getTitle());

	}


	@Test
	public void Test3( ) {
	driver.navigate().to("https://www.google.com/?safe=active&ssui=on");
	
	try {
		
		   System.out.println("Test3 Title is : "+driver.getTitle());
		   driver.findElement(By.id("Tesrtuy"));
	}catch (Exception e) {
		e.printStackTrace();
	}
	

	}

	@AfterMethod
	public void afterMethod( ) {

	driver.quit();

	}

}
