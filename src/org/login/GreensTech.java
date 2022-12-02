package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To Launch the browser
		
	
		driver.get("http://www.greenstechnologys.com/");
		// To maximize the window
		
		driver.manage().window().maximize();
		
		//To inspect Heading
		
		WebElement greens = driver.findElement(By.xpath("//h1[text()='No 1 Software Training Institutes in Chennai with Placements']"));
		
		//To print the text value based on Get text
		String text = greens.getText();
		System.out.println("*****Heading*****"+'\n'+text);
		
		//To inspect the paragraph using contains
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'leading')]"));
		
		//To print the paragraph Using GetText
		String text2 = para.getText();
		System.out.println();
		System.out.println("*********Printing Paragraph**********"+'\n'+text2);
		
		
		
}

}
