package org.login;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To Launch the browser
		driver.get("https://www.facebook.com/");

		// To maximize the window

		driver.manage().window().maximize();
		
		//To click create Account Button
		
		WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAccount.click();
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Barkath");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("A");
		
		WebElement phnum = driver.findElement(By.name("reg_email__"));
		phnum.sendKeys("9894585958");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("farhan@12");
		WebElement date = driver.findElement(By.id("day"));
		Select s= new Select(date);
		
		//To select date based on Index
		
		s.selectByIndex(6);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		
		//To select month based on visible text
		s1.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		
		//To select year based on value
		
		s2.selectByValue("2019");
		
		//To select All the options available in dropdown boxes
		
		List<WebElement> options = s2.getOptions();

		//To find the size of list
		
		int size = options.size();
		System.out.println("Size of drop down :"+size);

				System.out.println("All the options from drop down box");
		
		for (int i = 0; i < size; i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
		
		System.out.println("************************************");
		System.out.println(" Display the first five values from drop down box");
		//To print the first five values from drop down box
	   for (int i = 0; i < 5; i++) {
		   WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
	}
	   System.out.println("************************************");
		System.out.println(" Display the last five values from drop down box");
		//To print the last five values from drop down box
		
			for (int i =(size-5);i<size ; i++) {
				  WebElement webElement = options.get(i);
					String text = webElement.getText();
					System.out.println(text);
			
			}
			
			System.out.println("**********************************");
			System.out.println(" Display the middle five values from drop down box");
			int size2 = options.size()/2;
			

			if(size%2==0) {
				for (int i = (size2-3); i < (size2+2); i++) {
					WebElement webElement = options.get(i);
					String text = webElement.getText();
					System.out.println(text);
					
				}
				}
				
			
			else {
				System.out.println(size2);
			}
			//To print even values
			System.out.println("*************************************");
			System.out.println("To get the even values from drop down box");


				for (int i = 0; i < size; i=i+2) {
					WebElement webElement = options.get(i);
					String text = webElement.getText();
					System.out.println(text);
				}
				
				//To print odd values
				System.out.println("*************************************");
				System.out.println("To get the odd values from drop down box");
				for (int i = 1; i <size ; i=i+2) {
					WebElement webElement = options.get(i);
					String text = webElement.getText();
					System.out.println(text);
				}
				
			

			boolean contains = options.contains(options.get(10));
			System.out.println(contains);

		driver.close();
		driver.quit();
	}
}
