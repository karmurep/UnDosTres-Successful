package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.HomePage;

//import com.qa.pageLayer.LogInPage;

import com.qa.utility.UtilClasses;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public HomePage h;
	public UtilClasses util;
	public static Logger logger;
	
	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("UnDosTres framework");
		PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void stop()
	{
		
	}
	@BeforeMethod
	public void setup() {
		String br ="chrome"; 
		if (br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("Chrome browser Launched");
		}
		else if (br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			logger.info("edge browser Launched");
			
		}
		else
		{
			System.out.println("Please enter valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sanbox.undostres.com.mx");
		logger.info("url get launced");
		
		h=new HomePage();

		util= new UtilClasses();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		logger.info("browser closed");
	}
}
