package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazinInterview {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mainmenu = driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
		mainmenu.click();
		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles, Computers']"));
		Actions act=new Actions(driver);
		act.moveToElement(mobiles).perform();
		
	}
}
