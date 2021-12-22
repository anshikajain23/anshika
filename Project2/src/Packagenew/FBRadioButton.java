package Packagenew;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FBRadioButton {

		
		public String baseurl="https://www.facebook.com/";

		String driverpath="C:\\\\Users\\\\Anshika\\\\Downloads\\\\chromedriver.exe";

		@Test
		public void f() throws InterruptedException {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);

		//how to maximize
		driver.manage().window().maximize();
		
		
	
		
		
		List<WebElement> allGenders=driver.findElements(By.xpath("//input[@name='sex']"));
		System.out.println(allGenders.size());
		
		//click on male
		allGenders.get(1).click();
		
		allGenders.get(0).click();

	}

}















