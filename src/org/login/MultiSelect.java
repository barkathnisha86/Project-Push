package org.login;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To Launch the browser
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		// To maximize the window

		driver.manage().window().maximize();
		
		WebElement multiSelect = driver.findElement(By.name("country"));
		Select ms=new Select(multiSelect);
		
		//To select based on index
		
				ms.selectByIndex(18);
				//To select based on value
				ms.selectByValue("ANTARCTICA");
				//ms.selectByValue("AUSTRALIA");
				
				//To select by visible text
				ms.selectByVisibleText("INDIA");
				
				ms.selectByVisibleText("ITALY");
				//ms.selectByVisibleText("JAPAN");
				
		//To get all the option present in dropdown
		
		List<WebElement> options = ms.getOptions();
	
		
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
		//To get all selected options from the dropdown
		
		System.out.println("");
		List<WebElement> allSelectedOptions = ms.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			
			WebElement webElement = allSelectedOptions.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		WebElement firstSelectedOption = ms.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		//driver.close();
		//driver.quit();
}
}
