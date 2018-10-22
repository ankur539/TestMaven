package com.learn.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoMaven {
	
	@Test
	public void testMaven() throws InterruptedException
	{
		System.out.println("-----------Hello Maven - Learning Maven World-------------");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getTitle().contains("Gmail"));
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("-----------Ending Script-------------");
	}

}
