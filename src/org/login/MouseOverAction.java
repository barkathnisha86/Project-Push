package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
		
	driver.get("https://www.flipkart.com/");
	
	//To Maximize window
	driver.manage().window().maximize();
	WebElement mouseOver = driver.findElement(By.xpath("//div[text()='Electronics']"));
	Actions moa=new Actions(driver);
	//To perform mouse over action
	moa.moveToElement(mouseOver).perform();



}
	}
