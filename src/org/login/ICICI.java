package org.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICI
{
	public static void main(String[] args) {
		
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To launch the browser
				driver.get("https://adactinhotelapp.com/");
				
				//To maximize window
				driver.manage().window().maximize();
				
				WebElement userName = driver.findElement(By.id("username"));
						userName.sendKeys("bashamec2k8@gmail.com");
					WebElement password = driver.findElement(By.name("password"));
					password.sendKeys("3456788uu");
					WebElement login = driver.findElement(By.name("login"));
					login.click();
				
				
				
}
}