package com.automationA.DemoSeProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestClass1 {
	
	String browserType= "chrome";
	
	public static WebDriver driver;

	@BeforeMethod
	public void launchBrowser( ) throws MalformedURLException {

	/*DesiredCapabilities dr = null;
	dr=DesiredCapabilities.chrome();
	dr.setBrowserName("chrome");
	dr.setPlatform(Platform.WIN10);
	//dr.setVersion("86.0.4240.198");
	//WebDriverManager.chromedriver().setup();
	//driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
	driver = new RemoteWebDriver(new URL("http://192.168.134.2:4444/wd/hub"), dr);*/
	
	
	DesiredCapabilities dr=null;
	
    if(browserType.equals("chrome")){
    dr=DesiredCapabilities.chrome();
    dr.setBrowserName("chrome");
    dr.setPlatform(Platform.WINDOWS);
 
    }else{
        dr=DesiredCapabilities.internetExplorer();
        dr.setBrowserName("iexplore");
        dr.setPlatform(Platform.WINDOWS);
    }
	
    System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
    //driver=new RemoteWebDriver(new    URL("http://localhost:4444/wd/hub"), dr);
    
    driver=new RemoteWebDriver(new    URL("http://192.168.134.2:4444/wd/hub"), dr);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();

	}

	@Test
	public void firstTest( ) {

	driver.navigate().to("https://www.google.com/?safe=active&ssui=on");
	System.out.println("Test1 Title is : "+driver.getTitle());
	}

	@Test
	public void secondTest( ) {
	driver.navigate().to("https://www.google.com/?safe=active&ssui=on");
	System.out.println("Test2 Title is : "+driver.getTitle());

	}
	
	@Test
	public void thirdTest( ) {
	driver.navigate().to("https://www.google.com/?safe=active&ssui=on");
	System.out.println("Test2_1 Title is : "+driver.getTitle());

	}


	@Test
	public void forthTest( ) {
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
