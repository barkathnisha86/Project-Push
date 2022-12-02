package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElectBill {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
		
	driver.get("https://www.tnebnet.org/awp/login");
	
	//To Maximize window
	driver.manage().window().maximize();
	
	//To inspect user Name
	
	WebElement txtUser = driver.findElement(By.xpath("//input[contains(@id,'userName')]"));
	txtUser.sendKeys("barkathnisha86@gmail.com");


	
	//To print the attribute values
	
	String attribute = txtUser.getAttribute("id");
	System.out.println(attribute);
	
	//To print the attribute values(send keys information)
	String attribute2 = txtUser.getAttribute("value");
	System.out.println(attribute2);
	
	//To inspect password
	
	WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
	password.sendKeys("Farhan12@");
	
	// To print the attribute values
	
	String attribute3 = password.getAttribute("type");
	System.out.println(attribute3);
	 
	//To print Attribute Values
	String attribute4 = password.getAttribute("value");
	System.out.println(attribute4);
	
	
	
}

}
