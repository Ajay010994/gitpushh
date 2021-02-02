package com.Test;

public class IndesToSignin extends CommonClass
{
	
		
	@Test	
	public void Tosigninpage() throws IOException
	{
		LoadProperties();
		launchbrowser();
		indexpage.signinButton.click();	
	}


	}

 
