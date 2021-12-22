package Packagenew;



import org.testng.annotations.Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Theatre_Diaries {
	

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
	
	driver.findElement(By.linkText("Theatre Diaries")).click();
	
	

    Select Site = new Select(driver.findElement(By.name("site-id")));
    Site.selectByVisibleText("Princess");
    

    Select Theatre = new Select(driver.findElement(By.name("theatre-id")));
    Theatre.selectByVisibleText("Theatre 1");
    

    Select Subspeciality = new Select(driver.findElement(By.name("subspecialty-id")));
    Subspeciality.selectByVisibleText("Anaesthetics");
    

    Select Context = new Select(driver.findElement(By.name("firm-id")));
    Context.selectByVisibleText("Anaesthetics Service");
    
    

    Select Ward = new Select(driver.findElement(By.name("ward-id")));
    Ward.selectByVisibleText("Nancy Fenwick");
    
    WebElement Emergency_list=driver.findElement(By.id("emergency_list"));
    // select checkbox with click()
    Emergency_list.click();
    
    WebElement radio =driver.findElement(By.id("date-filter_1"));
    radio.click();
    
       //WebElement dateboxtheatre = driver.findElement(By.id("date-start"));
       //dateboxtheatre.sendKeys("09/10/2019");
       

       //WebElement datebox2theatre = driver.findElement(By.id("date-end"));
      // datebox2theatre.sendKeys("09/10/2021");
       
driver.findElement(By.id("last_week")).click();
Thread.sleep(1000);
driver.findElement(By.id("next_week")).click();

Thread.sleep(1000);
driver.findElement(By.id("search_button")).click();


driver.findElement(By.xpath("//*[@id=\"session_form53007\"]/div[2]/div[1]/span[1]/a[2]")).click();
//driver.findElement(By.id("52818")).click();
//driver.findElement(By.linkText("Edit")).click();
Thread.sleep(1000);
//*[@id="session_form52818"]/div[2]/div[1]/span[1]/a[2]
//*[@id="session_form53007"]/div[2]/div[1]/span[1]/a[2]
WebElement Consultant_present=driver.findElement(By.id("consultant_53007"));
// select checkbox with click()
Consultant_present.click();
Thread.sleep(1000);

WebElement paediatric=driver.findElement(By.id("paediatric_53007"));
// select checkbox with click()
paediatric.click();

Thread.sleep(1000);

WebElement Anaesthetist=driver.findElement(By.id("anaesthetist_53007"));
//select checkbox with click()
Anaesthetist.click();

Thread.sleep(1000);
WebElement general_anaesthetic=driver.findElement(By.id("general_anaesthetic_53007"));
//select checkbox with click()
general_anaesthetic.click();

Thread.sleep(1000);
WebElement  Session_available=driver.findElement(By.id("available_53007"));
//select checkbox with click()
Session_available.click();


Thread.sleep(1000);

Select unavailablereasons = new Select(driver.findElement(By.name("unavailablereason_id_53007")));
unavailablereasons.selectByVisibleText("Theatre Service and Maintenance");

driver.findElement(By.id("max_procedures_53007")).sendKeys("11");
driver.findElement(By.id("max_complex_bookings_53007")).sendKeys("2213");

driver.findElement(By.className("cols-9 comments diaryEditMode")).sendKeys("11eewfrewfss");
driver.findElement(By.linkText("Save changes to session")).click();
//driver.findElement(By.className("button-span button-span-green")).click();
	
//driver.findElement(By.xpath("//*[@id=\"btn_edit_session_save_53006\"]/span")).click();
}
}
	
  