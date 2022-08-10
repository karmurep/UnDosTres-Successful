package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class UtilClasses extends TestBase{
	public UtilClasses()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void takeSS(String Name)
	{
		try
		{
			TakesScreenshot ss =((TakesScreenshot)driver);
			File src= ss.getScreenshotAs(OutputType.FILE);
			
			String Path = "C:\\Users\\karmu\\eclipse-workspace\\UnDosTres\\Screenshot\\";
			
			File des= new File(Path+Name+System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);	
		}
		catch (IOException e) 
		{
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
