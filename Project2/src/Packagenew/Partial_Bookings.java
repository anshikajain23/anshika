package Packagenew;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Partial_Bookings {
	

	String driverpath="C:\\\\Users\\\\Anshika\\\\Downloads\\\\chromedriver.exe";
	//String driverpath="C:\\\\Users\\\\Anshika\\\\Downloads\\\\chromedriver.exe";

	@SuppressWarnings("deprecation")
	@Test
	public void f() throws InterruptedException {


	System.out.println("launching chrome browser");
	System.setProperty("webdriver.chrome.driver", driverpath);
	WebDriver driver = new ChromeDriver();
	driver.get("http://164.52.219.76:8085");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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
	
	driver.findElement(By.linkText("Partial bookings waiting list")).click();
	
	

Select Subspecialty = new Select(driver.findElement(By.name("subspecialty-id")));
Subspecialty.selectByVisibleText("Adnexal");


Select Service = new Select(driver.findElement(By.name("firm-id")));
Service.selectByVisibleText("Adnexal Service");

	
Select Next_letter_due = new Select(driver.findElement(By.name("status")));
Next_letter_due.selectByVisibleText("Refer to GP");

	
Select Site = new Select(driver.findElement(By.name("site_id")));
Site.selectByVisibleText("Princess");


driver.findElement(By.id("hos_num")).sendKeys("100");


Select Status = new Select(driver.findElement(By.name("booking_status")));
Status.selectByVisibleText("Requires rescheduling");

Select Letter_filter = new Select(driver.findElement(By.name("adminconfirmto")));
Letter_filter .selectByVisibleText("Invitation letter");


WebElement latest_letter = driver.findElement(By.id("adminconfirmdate"));
latest_letter.sendKeys("01 Dec 2021");

WebElement l=driver.findElement(By.id("checkall"));
//select checkbox with click()
l.click();


WebElement Print=driver.findElement(By.id("btn_print_all"));
//select checkbox with click()
Print.click();










driver.findElement(By.className("green hint cols-full")).click();






	
	
	
	

}
}
