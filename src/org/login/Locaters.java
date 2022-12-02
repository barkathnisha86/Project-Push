package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	public static void main(String[] args) {
		
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
		driver.get("https://www.facebook.com/");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		// To inspect the User Name WebElement
		WebElement userName = driver.findElement(By.id("email"));
		
		//To inspect some values to username
		userName.sendKeys("barkathnisha86@gmail.com");
		
		//To inspect the password webelement
		WebElement password = driver.findElement(By.id("pass"));
		
		//To send some values to password
		password.sendKeys("barkath11@");
		
		//To inspect login button
		WebElement login = driver.findElement(By.name("login"));
		
		//To click login button
		login.click();
		
		
		
		
	}

}
