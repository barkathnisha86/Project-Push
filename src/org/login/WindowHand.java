package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHand {

	public static void main(String[] args) throws InterruptedException {
		// To configure the browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				 //To launch the browser
					driver.get("https://www.flipkart.com/");
					WebElement search = driver.findElement(By.name("q"));
					search.sendKeys("redmi mobile",Keys.ENTER);


				

	}

}
