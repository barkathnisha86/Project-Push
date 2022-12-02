package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&dsh=S-1559809691%3A1661776438491196&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//To Maximize the window
		
		driver.manage().window().maximize();
		
		// To inspect the FirstName
		
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstName']"));
		
		//TO send Values to First Name
		
		fName.sendKeys("Barkath");
		
		// To inspect LastName
		
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastName']"));
		
		//To send values to Last Name
		lName.sendKeys("Allabaksh");
		
		
		//TO inspect userName
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		
		//To send values to user name
		userName.sendKeys("barkathnisha86");
		
		//To inspect password
		
		WebElement password = driver.findElement(By.xpath("//input[@name='Passwd']"));
		password.sendKeys("bashanisha");
		
		//To send values to password
		password.sendKeys("bashanisha");
		
		//To inspect confirm
		
		WebElement confirm = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		
		
		//To send values to confirm
		confirm.sendKeys("bashanisha");
		
		
		
	
	}
}
