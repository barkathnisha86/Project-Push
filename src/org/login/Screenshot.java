package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenshot {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// To configure the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To Launch the browser
		driver.get("http://adactinhotelapp.com/");

		// To maximize the window

		driver.manage().window().maximize();
		Screenshot.captureScreen(driver,"homepage");
		
		//To inspect UserName
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Barkath11");
		Screenshot.captureScreen(driver,"username");
		
		//To inspect Password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("bashanisha");
		Screenshot.captureScreen(driver, "password");
		
		//To inspect login button
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Screenshot.captureScreen(driver, "login");
		
		//To inspect Select button
		WebElement location = driver.findElement(By.name("location"));
		Select s=new Select(location);
		s.selectByValue("New York");
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s2=new Select(roomtype);
		s2.selectByValue("Standard");
		WebElement roomnum = driver.findElement(By.name("room_nos"));
		Select s3=new Select(roomnum);
		s3.selectByValue("2");
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4=new Select(adult);
		s4.selectByValue("2");
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5=new Select(child);
		s5.selectByValue("2");
		Screenshot.captureScreen(driver, "select");
		
		//To inspect search button
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
		Screenshot.captureScreen(driver, "search");
		
		//To inspect radio button
		WebElement radio = driver.findElement(By.name("radiobutton_0"));
		radio.click();
		WebElement cont = driver.findElement(By.name("continue"));
		cont.click();
		Screenshot.captureScreen(driver, "radio");
		
		//To inspect book hotel page
		//To inspect first name
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("Barkath");
		
		//To inspect last name
		WebElement lname = driver.findElement(By.name("last_name"));
		lname.sendKeys("Jahangeer");
		
		//To inspect address
		WebElement address = driver.findElement(By.name("address"));
		address.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		r.keyPress(KeyEvent.VK_PERIOD);
		r.keyRelease(KeyEvent.VK_PERIOD);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_COMMA);
		r.keyRelease(KeyEvent.VK_COMMA);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		WebElement credit = driver.findElement(By.name("cc_num"));
		credit.sendKeys("3456675898761234");
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select s6=new Select(cctype);
		s6.selectByValue("MAST");
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s7=new Select(month);
		s7.selectByValue("10");
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		
		Select s8=new Select(year);
		s8.selectByValue("2022");
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("234");
		WebElement book = driver.findElement(By.name("book_now"));
		 book.click();
		 Screenshot.captureScreen(driver, "bookhotel");
		driver.close();
		driver.quit();
	}
		//To take screenshot
		public static void captureScreen(WebDriver driver,String name) throws IOException, InterruptedException {
			
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium Test papers\\"+name+".jpeg"));
		Thread.sleep(3000);
		}
		
		

}

