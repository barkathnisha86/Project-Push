package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Software {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
		
	
		driver.get("https://www.sitesforkids.org/");
		// To maximize the window
		
		driver.manage().window().maximize();
		
		//To inspect Heading
		WebElement heading = driver.findElement(By.xpath("//strong[text()='Welcome']"));
		
		//To print the text value
		String text = heading.getText();
		System.out.println(text);
		
		//To inspect the paragraph
		WebElement paragraph = driver.findElement(By.xpath("//font[contains(text(),'guardian')]"));
		
		//To print the paaragraph
		String text2 = paragraph.getText();
		System.out.println(text2);
}
}
