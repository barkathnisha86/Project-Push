package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
	driver.get("http://www.greenstechnologys.com/");
	
	//TO maximize window
	driver.manage().window().maximize();
	
	//To inspect course
	
	WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
	Actions moa=new Actions(driver);

	//To perform mouse over action
	
	moa.moveToElement(course).perform();
	
	WebElement swtest = driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
	moa.moveToElement(swtest).perform();
	}
	
}
