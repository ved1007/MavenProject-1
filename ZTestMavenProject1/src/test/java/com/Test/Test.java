package com.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\vedant.jagani\\Desktop\\SELENIUM\\SeleniumDrivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		Thread.sleep(4000);
		
		driver.close();
	
		
	}
}
