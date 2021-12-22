package Packagenew;




//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Patient_Merge {
	

	String driverpath="C:\\\\Users\\\\Anshika\\\\Downloads\\\\chromedriver.exe";

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
	
	driver.findElement(By.linkText("Patient Merge")).click();
	
	WebElement l=driver.findElement(By.id("PatientMergeRequest_show_merged"));
	//select checkbox with click()
	l.click();
	
	WebElement l2=driver.findElement(By.id("selectall"));
	//select checkbox with click()
	l2.click();
	
	//driver.findElement(By.("button small")).click();

	//Actions act2 = new Actions(driver);
	//WebElement ele2 = driver.findElement(By.className("secondary small filter"));
	//act2.doubleClick(ele2).perform();

	driver.findElement(By.xpath("//*[@id=\"patientMergeWrapper\"]/div/div[1]/div/div[2]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"patientMergeRequestList\"]/tfoot/tr/td/a[1]")).click();
	
	
	driver.findElement(By.id("oe-autocompletesearch")).sendKeys("11");
	
	//for auto suggestion
	WebDriverWait wait=new WebDriverWait(driver, 1);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-0\"]")));
	driver.findElement(By.xpath("//*[@id=\"ui-id-0\"]")).click();
	driver.findElement(By.id("PatientMergeRequest_comment")).sendKeys("Personal Details Secondary");
	
	
	
	//driver.findElement(By.xpath("//*[@id=\"grid_header_form\"]/div[2]/div[2]/div[3]/div/input")).click();
	driver.findElement(By.id("oe-autocompletesearch")).sendKeys("12");
	WebDriverWait wait2=new WebDriverWait(driver, 2);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-0\"]")));
	driver.findElement(By.xpath("//*[@id=\"ui-id-0\"]")).click();
	driver.findElement(By.id("PatientMergeRequest_comment")).sendKeys("Personal Details Primary");
	
	//*[@id="ui-id-0"]
	
	WebElement e=driver.findElement(By.xpath("//*[@id=\"PatientMergeRequest_personal_details_conflict_confirm\"]"));
	//select checkbox with click()
	e.click();
	driver.findElement(By.id("PatientMergeRequest_personal_details_conflict_confirm"));


	driver.findElement(By.className("button small")).click();
	//driver.findElement(By.xpath("//*[@id=\"patientMergeWrapper\"]/div/div[1]/div/section/a")).click();
	//*[@id="ui-id-0"]
	//*[@id="PatientMergeRequest_personal_details_conflict_confirm"]

	}
}
