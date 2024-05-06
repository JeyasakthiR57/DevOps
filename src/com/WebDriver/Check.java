package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Check {
	    

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		String expTitle = "Google";
		
		String title= driver.getTitle();
		
		System.out.println("Title is " +title);
		if (title.equals(expTitle))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL is "+url);
		
		WebElement box=driver.findElement(By.name("q"));
		box.sendKeys("world");
		box.click();
		
		//driver.close();
		
		
	}

}
