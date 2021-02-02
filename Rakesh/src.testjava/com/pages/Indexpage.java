package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Indexpage 
{
	
	{
		@FindBy(xpath="//a[@class='login']")
		public static WebElement signinButton;
		
		
		@FindBy(xpath="//input[@id='search_query_top']")
		public static WebElement searchBox;

	}

}
