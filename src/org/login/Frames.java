package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) throws InterruptedException {
	// To configure the browser
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("main Page");
			WebElement f1 = driver.findElement(By.id("f1"));
			driver.switchTo().frame(f1);
			WebElement java = driver.findElement(By.name("Java"));
			java.click();
			WebElement f2 = driver.findElement(By.id("f2"));
			driver.switchTo().frame(f2);
			WebElement selenium = driver.findElement(By.name("Selenium"));
			selenium.click();
			WebElement f3 = driver.findElement(By.id("f3"));
			driver.switchTo().frame(f3);
			WebElement python = driver.findElement(By.name("Python"));
			python.click();
			WebElement f4 = driver.findElement(By.id("f4"));
			driver.switchTo().frame(f4);
			WebElement sql = driver.findElement(By.name("SQL"));
			sql.click();             
			WebElement f5 = driver.findElement(By.id("f5"));
			driver.switchTo().frame(f5);
			WebElement user = driver.findElement(By.name("user"));
			user.sendKeys("Hi jack");
			Thread.sleep(2000);
			driver.switchTo().parentFrame();
			
			
}
}
