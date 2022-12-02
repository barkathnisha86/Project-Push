package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To Launch the browser
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		// To maximize the window

		driver.manage().window().maximize();

		// To inspect the bank
		WebElement source = driver.findElement(By.id("credit2"));

		WebElement target = driver.findElement(By.id("bank"));

		Actions act = new Actions(driver);

		// to perform drag and drop actions

		act.dragAndDrop(source, target).perform();

		WebElement source1 = driver.findElement(By.id("fourth"));

		WebElement target1 = driver.findElement(By.id("amt7"));

		act.dragAndDrop(source1, target1).perform();
		
		WebElement source2 = driver.findElement(By.id("credit1"));

		WebElement target2 = driver.findElement(By.id("loan"));
		
		act.dragAndDrop(source2, target2).perform();
		
		WebElement source3 = driver.findElement(By.id("fourth"));

		WebElement target3 = driver.findElement(By.id("amt8"));
		
		act.dragAndDrop(source3, target3).perform();
		
		

	}

}
