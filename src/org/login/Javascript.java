package org.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
public static void main(String[] args) throws InterruptedException, IOException {
	// To configure the browser
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 //To launch the browser
		driver.get("http://adactinhotelapp.com/");
		//Type casting for java script executor
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		WebElement user = driver.findElement(By.id("username"));
		//To pass values to web element ref based on java script
		jk.executeScript("arguments[0].setAttribute('value','Barkath11')", user);
		WebElement pass = driver.findElement(By.id("password"));
		
		//To pass values to webelement ref based on java script
		jk.executeScript("arguments[0].setAttribute('value','bashanisha')", pass);
		WebElement login = driver.findElement(By.name("login"));
		//To click webelement based on javascript
		jk.executeScript("arguments[0].click()", login);

		
		WebElement location = driver.findElement(By.id("location"));
		jk.executeScript("arguments[0].value='Melbourne'", location);
		WebElement hotel = driver.findElement(By.id("hotels"));
		jk.executeScript("arguments[0].value='Hotel Cornice'", hotel);
		WebElement room = driver.findElement(By.id("room_type"));
		jk.executeScript("arguments[0].value='Deluxe'", room);
		WebElement roomnum = driver.findElement(By.id("room_nos"));
		jk.executeScript("arguments[0].value='2'", roomnum);
		WebElement adult = driver.findElement(By.id("adult_room"));
		jk.executeScript("arguments[0].value='2'", adult);
		WebElement child = driver.findElement(By.id("child_room"));
		jk.executeScript("arguments[0].value='2'", child);
		WebElement search = driver.findElement(By.id("Submit"));
		Thread.sleep(3000);
		//To click webelement based on java script
		jk.executeScript("arguments[0].click()", search);
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		//To click radio button based on javascript
		jk.executeScript("arguments[0].click()", radio);
		Thread.sleep(3000);
		WebElement continu = driver.findElement(By.id("continue"));
		//To click continue button based on javascript
		jk.executeScript("arguments[0].click()", continu);
		WebElement fname = driver.findElement(By.id("first_name"));
		//To pass values to web element ref based on java script
		jk.executeScript("arguments[0].setAttribute('value','Barkath')", fname);
		WebElement lname = driver.findElement(By.id("last_name"));
		//To pass values to web element ref based on java script
		jk.executeScript("arguments[0].setAttribute('value','Jahangeer')", lname);
		WebElement address = driver.findElement(By.id("address"));
		//To pass values to web element ref based on java script
		
		jk.executeScript("arguments[0].value='Taramani'", address);

		WebElement ccard = driver.findElement(By.id("cc_num"));
		//To pass values to web element ref based on java script
		jk.executeScript("arguments[0].setAttribute('value','2345674839458754')", ccard);
		WebElement ctype = driver.findElement(By.id("cc_type"));
		jk.executeScript("arguments[0].value='VISA'", ctype);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		jk.executeScript("arguments[0].value='12'", month);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		jk.executeScript("arguments[0].value='2022'", year);
		WebElement  cvv= driver.findElement(By.id("cc_cvv"));
		//To pass values to web element ref based on java script
		jk.executeScript("arguments[0].setAttribute('value','234')",cvv );
		WebElement book = driver.findElement(By.id("book_now"));
		jk.executeScript("arguments[0].scrollIntoView(true)", book);
		//To click book now button based on javascript
		jk.executeScript("arguments[0].click()", book);
		TakesScreenshot tk=(TakesScreenshot) driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File target=new File("D:\\Selenium Test papers\\logout.jpeg");
		FileUtils.copyFile(source, target);
		
		


}

}
