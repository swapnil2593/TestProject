package com.testproject.io;

import org.openqa.selenium.WebDriver;

import utility.OpenBrowser;

public class SignUp extends OpenBrowser
{
	public void brwsr(String bb)
	{
	  WebDriver driver = super.selectBrowser(bb);
	  driver.get("http://www.google.com");
	}
}
