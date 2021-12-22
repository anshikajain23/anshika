package Packagenew;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class New_Practices {
	
	
	
	
	//String driverpath="C:\\\\Users\\\\Anshika Jain\\\\Downloads\\\\chromedriver.exe";

	String driverpath="C:\\\\Users\\\\Anshika\\\\Downloads\\\\chromedriver.exe";
	@SuppressWarnings("deprecation")
	@Test
	public void f() throws InterruptedException {


	System.out.println("launching chrome browser");
	System.setProperty("webdriver.chrome.driver", driverpath);
	WebDriver driver = new ChromeDriver();
	driver.get("http://164.52.219.76:8085");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//Thread.sleep(1000);

	driver.findElement(By.id("LoginForm_username")).sendKeys("naveen");
	driver.findElement(By.id("LoginForm_password")).sendKeys("Admin@123");
	driver.findElement(By.id("login_button")).click();
	Thread.sleep(1000);

	// To add new patient
	
	Actions act = new Actions(driver);
	WebElement ele = driver.findElement(By.id("js-nav-shortcuts-btn"));
	act.doubleClick(ele).perform();
    Thread.sleep(1000);
	
	driver.findElement(By.linkText("Practices")).click();
	
	//for create practice 
	
	driver.findElement(By.xpath("//*[@id=\"practice-grid\"]/tfoot/tr/td[1]/a/button")).click();
	
	driver.findElement(By.id("Contact_first_name")).sendKeys("Amit");
	driver.findElement(By.id("Practice_code")).sendKeys("E81503");
	driver.findElement(By.id("Practice_phone")).sendKeys("020 8578311000");

    Select Address_Type2 = new Select(driver.findElement(By.name("Address[address_type_id]")));
    Address_Type2.selectByVisibleText("Correspondence");
	
    driver.findElement(By.id("Address_address1")).sendKeys(" Lane gkikkjhhhvvg Sourger=y14 Cuckoo Lane");
	driver.findElement(By.id("Address_address2")).sendKeys("Hanwell");
	driver.findElement(By.id("Address_city")).sendKeys("London");
	driver.findElement(By.id("Address_postcode")).sendKeys("TW12 1NY");
	driver.findElement(By.id("Address_county")).sendKeys("123123123123");
	
	  Select Country_new = new Select(driver.findElement(By.name("Address[country_id]")));
	  Country_new.selectByVisibleText("Albania");
	  driver.findElement(By.xpath("//*[@id=\"practice-form\"]/table/tbody/tr[13]/td/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/section/div/div/a/button")).click();
		

	    Select Address_Type3 = new Select(driver.findElement(By.name("Address[address_type_id]")));
	    Address_Type3.selectByVisibleText("Transport");

	    driver.findElement(By.xpath("//*[@id=\"practice-form\"]/table/tbody/tr[13]/td/input")).click();
	  
	
	//for practice new click

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://164.52.219.76:8085");

		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//Thread.sleep(1000);

		driver2.findElement(By.id("LoginForm_username")).sendKeys("naveen");
		driver2.findElement(By.id("LoginForm_password")).sendKeys("Admin@123");
		driver2.findElement(By.id("login_button")).click();
		Thread.sleep(1000);
	    
	    Actions act2 = new Actions(driver2);
		WebElement ele2 = driver2.findElement(By.id("js-nav-shortcuts-btn"));
		act2.doubleClick(ele2).perform();
	    Thread.sleep(1000);
		
		driver2.findElement(By.linkText("Practices")).click();
	
	
	//driver2.findElement(By.xpath("//*[@id=\"practice-grid\"]/tfoot/tr/td[1]/a/button")).click();
	
	
	driver2.findElement(By.xpath("//*[@id=\"r144\"]/td[1]")).click();
	driver2.findElement(By.xpath("/html/body/div[4]/div[2]/section/div/div/a/button")).click();
	//driver.findElement(By.className("button hint blue pad pro-theme")).click();


    Select Address_Type = new Select(driver2.findElement(By.name("Address[address_type_id]")));
    Address_Type.selectByVisibleText("Correspondence");

    
    
    driver2.findElement(By.id("Address_county")).sendKeys("123");
  
    Thread.sleep(1000); 
    Select Country = new Select(driver2.findElement(By.name("Address[country_id]")));
    Country.selectByVisibleText("Gambia");

    Thread.sleep(1000);
    driver2.findElement(By.xpath("//*[@id=\"practice-form\"]/table/tbody/tr[13]/td/input")).click();
    driver2.findElement(By.xpath("/html/body/div[4]/div[2]/section/div/div/a/button")).click();

   Thread.sleep(1000);
    

    driver2.findElement(By.xpath("//*[@id=\"practice-form\"]/table/tbody/tr[13]/td/input")).click();
	}
	

}