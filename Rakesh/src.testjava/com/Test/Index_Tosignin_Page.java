package com.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Myconnect.Base.generic.CommonFunctions;
import com.Myconnect.Pages.indexpage;

public class Index_Tosignin_Page extends CommonFunctions
{
	
@Test	
public void Tosigninpage() throws IOException
{
	LoadProperties();
	launchbrowser();
	indexpage.signinButton.click();	
}


}
