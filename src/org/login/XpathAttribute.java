package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribute {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
		
	driver.get("https://www.flipkart.com/");
	
	//To Maximize window
	driver.manage().window().maximize();
	
	//To inspect user Name
	
	WebElement txtUser = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
	txtUser.sendKeys("bashamec2k8@gmail.com");


	
	//To print the attribute values
	
	String attribute = txtUser.getAttribute("class");
	System.out.println(attribute);
	
	//To print the attribute values(send keys information)
	String attribute2 = txtUser.getAttribute("value");
	System.out.println(attribute2);
	
	//To inspect password
	
	WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
	password.sendKeys("bashanisha");
	
	// To print the attribute values
	
	String attribute3 = password.getAttribute("type");
	System.out.println(attribute3);
	 
	//To print Attribute Values
	String attribute4 = password.getAttribute("value");
	System.out.println(attribute4);
	
	
	
}
	}
