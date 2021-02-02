package com.Myconnect.Base.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonFunctions 
{
	static Properties Properties=null;
	WebDriver driver;
	public Properties LoadProperties() throws IOException 
	{
		FileInputStream FileInputStream =new FileInputStream("config.properties");
		Properties=new Properties();
		Properties.load(FileInputStream);
		return Properties;
	}

	public void launchbrowser() throws IOException 
	{
		LoadProperties();
		String browser=Properties.getProperty("browser");
		String driverpath=Properties.getProperty("chromepath");
		String link=Properties.getProperty("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverpath);
			WebDriver driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", Properties.getProperty("firepath"));
			WebDriver driver=new FirefoxDriver();	
		}	
		driver.get(link);
	}
	public void teardown()
	{
		driver.close();
	}
}
