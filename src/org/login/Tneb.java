package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tneb {
public static void main(String[] args) {
	// To configure the browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			// TO Launch the browser
			
			driver.get("https://www.tnebnet.org/awp/login");
			
			// To Maximize the window
			
			driver.manage().window().maximize();
			
			//To inspect the user Name
			WebElement userName = driver.findElement(By.id("userName"));
			
			//To send values to UserName
			userName.sendKeys("bashamec2k8@gmail.com");
			
			//To inspect the password
			WebElement password = driver.findElement(By.id("password"));
			 
			
			//To send values to password 
			password.sendKeys("54672226");
			
			//To inspect submit button
			 WebElement login = driver.findElement(By.name("submit"));
			 login.click();
}
}