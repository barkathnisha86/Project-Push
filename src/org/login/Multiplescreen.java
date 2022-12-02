package org.login;

import java.awt.AWTException;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplescreen {
public static WebDriver driver;
private static void screenshot(String name) {
	try {
	 TakesScreenshot tk=(TakesScreenshot) driver;
	 File source=tk.getScreenshotAs(OutputType.FILE);
	 File target=new File("D:\\\\Selenium Test papers\\\\\"+name+\".jpeg");
	 FileUtils.copyFile(source, target);
	} catch (Exception e) {
		
	}
}
public static void main(String[] args) throws InterruptedException {


		// To configure the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To Launch the browser
		driver.get("http://www.facebook.com/");

		// To maximize the window

		driver.manage().window().maximize();
		
		screenshot("home");
		 WebElement username = driver.findElement(By.id("email"));
		 username.sendKeys("bashamec2k8@gmail.com");
		 screenshot("user");
		 
		 WebElement pass = driver.findElement(By.id("pass"));
		 pass.sendKeys("bashanisha");
		 screenshot("password");
		 
		 WebElement login = driver.findElement(By.name("login"));
		 login.click();
		 screenshot("login");
		 
		 Thread.sleep(3000);
		 
		 driver.close();
}
}
