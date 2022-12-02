package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
	driver.get("https://www.amazon.in/");
	
	//TO maximize window
	driver.manage().window().maximize();
	
	//To inspect course
	
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	Actions moa=new Actions(driver);

	//To perform mouse over action
	
	moa.moveToElement(mobile).perform();
	mobile.click();
	
	//to inspect rate
	
	WebElement rate = driver.findElement(By.xpath("//span[text()='Starting ₹6,999']"));
	moa.moveToElement(rate).perform();
	rate.click();
	}
}
