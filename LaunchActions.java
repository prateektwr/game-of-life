package com.example.launchactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchActions {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		
		/*driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("babaparle.g");
		driver.findElement(By.id("next")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Passwd")).sendKeys("ladygaga123",Keys.ENTER);*/
		//driver.findElement(By.id("signIn")).sendKeys(Keys.ENTER);
		
		driver.get("file:///C:/Users/pranjal/Desktop/SeleniumTest/home.html");
		driver.findElement(By.id("username")).sendKeys("bob");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("sub")).sendKeys(Keys.ENTER);
		
		//By ref=By.tagName("p");
		//WebElement wel=driver.findElement(ref);
		//WebElement wel=driver.findElement(By.id("username"));
		//System.out.println(wel);
		//driver.close();
	}
}
