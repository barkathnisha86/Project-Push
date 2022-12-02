package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) {
	
	// to Configure the Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	//To Launch the Browser
	driver.get("https://www.amazon.in/");
	
	//To maximize window
	driver.manage().window().maximize();
	
	//To get the title of the webpage
	String title = driver.getTitle();

System.out.println(title);

// To get the current Url webpage

String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

driver.close();

driver.quit();
}
}
