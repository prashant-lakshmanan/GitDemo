package com.dws.listener;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)
public class TestScript extends BaseClass{
	@Test
	public void launch() {
		
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertEquals(driver.getTitle(), "Demo Web Shopp","Not welcome page");
		Reporter.log("DWS welcome page");
		System.out.println("Git Text");
		System.out.println("New Line");
		System.out.println("Another line");
		System.out.println("In develop branch");
	}

}
