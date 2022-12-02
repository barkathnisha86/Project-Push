package org.login;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException, IOException {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// To launch the browser
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 13", Keys.ENTER);
		WebElement iphone13 = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']"));
		iphone13.click();

		Thread.sleep(4000);
		// To get parent window id
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window ID:" + parentWindow);

		// To find all window id
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		for (String x : allWindow) {
			if (!parentWindow.equals(x)) {
				System.out.println("First child window:" + x);
				driver.switchTo().window(x);

			}

		}
		WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
		addcart.click();
		Thread.sleep(3000);
		// To come back to parent window again
		driver.switchTo().window(parentWindow);
		WebElement iphone14 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		iphone14.click();
		Thread.sleep(3000);
		// To collect all window Id
		Set<String> allWindow2 = driver.getWindowHandles();
		System.out.println(allWindow2);
		for (String y : allWindow2) {
			if (!allWindow.equals(y)) {
				driver.switchTo().window(y);
			}
		}
		WebElement preorder = driver.findElement(By.id("buy-now-button"));
		preorder.click();
		driver.switchTo().window(parentWindow);
		WebElement iphone13Blue = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		iphone13Blue.click();
		// To get all window id
		Set<String> allWindow3 = driver.getWindowHandles();
		System.out.println(allWindow3);
		for (String thirdChildWindow : allWindow3) {
			if (!allWindow2.equals(thirdChildWindow)) {
				driver.switchTo().window(thirdChildWindow);
			}

		}
		WebElement addcart1 = driver.findElement(By.id("add-to-cart-button"));
		addcart1.click();

	}
}
