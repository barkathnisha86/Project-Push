package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
		driver.get("https://www.india.gov.in/topics/education");

		
		//To Maximize window
		driver.manage().window().maximize();
		
		
		//To inspect Heading
		
		WebElement heading = driver.findElement(By.xpath("//span[text()='Education']"));
		
		String text2 = heading.getText();
		System.out.println(text2);
		//To inspect Paragraph
		
		WebElement containsText = driver.findElement(By.xpath("//p[contains(text(),'essence')]"));
		String text = containsText.getText();
		System.out.println(text);
		


	}

}
