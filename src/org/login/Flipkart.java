package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	// To configure the browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	//To Launch the browser
	driver.get("https://www.flipkart.com/");
	
	//To Maximize the window
	driver.manage().window().maximize();
	
	 //To inspect the UserName
	WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	
	//To send values to user Name
	email.sendKeys("bashamec2k8@gmail.com");
	
	//To inspect password
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	
	//To send values to password
	password.sendKeys("bashanisha");
	
	//To inspect login Button
	WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	
	login.click();
}
}
