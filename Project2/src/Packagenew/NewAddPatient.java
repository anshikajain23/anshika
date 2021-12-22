package Packagenew;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class NewAddPatient {
public String baseurl="http://164.52.219.76:8085";

String driverpath="C:\\\\Users\\\\Anshika\\\\Downloads\\\\chromedriver.exe";

@Test
public void f() throws InterruptedException {
System.out.println("launching chrome browser");
System.setProperty("webdriver.chrome.driver", driverpath);
WebDriver driver = new ChromeDriver();
driver.get(baseurl);
driver.manage().window().maximize();
//Thread.sleep(1000);
driver.findElement(By.id("LoginForm_username")).sendKeys("naveen");
driver.findElement(By.id("LoginForm_password")).sendKeys("Admin@123");
driver.findElement(By.id("login_button")).click();
Thread.sleep(1000);
//driver.findElement(By.id("query")).sendKeys("virat kohli");
//driver.findElement(By.id("js-find-patient")).click();
//WebDriver element;
//driver.findElement(By.id("js-nav-shortcuts-btn")).click();


Actions act = new Actions(driver);
WebElement ele = driver.findElement(By.id("js-nav-shortcuts-btn"));
act.doubleClick(ele).perform();
Thread.sleep(1000);
// To add new patient
driver.findElement(By.linkText("Add Patient")).click();
//Thread.sleep(1000);
//driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.id("Contact_first_name")).sendKeys("Praveen");
Thread.sleep(1000);
driver.findElement(By.id("Contact_last_name")).sendKeys("pandey");
WebElement datebox= driver.findElement(By.id("Patient_dob"));
datebox.sendKeys("27/10/1993");
// For Admin purpose
//WebElement el = driver.findElement(By.id("js-nav-shortcuts-btn"));
//act.doubleClick(el).perform();
//driver.findElement(By.linkText("Admin")).click();
//driver.findElement(By.className("icon-logout")).click();
//Select dropdown = new Select(driver.findElement(By.id("js-nav-shortcuts-btn")));
//dropdown.selectByVisibleText("Admin");
//Thread.sleep(1000);
// DROP DOWNS SELECTIONS
Select patientSource = new Select(driver.findElement(By.name("Patient[patient_source]")));
patientSource.selectByVisibleText("Other");
Select gender = new Select(driver.findElement(By.id("Patient_gender")));
gender.selectByVisibleText("Male");
Select ethnicGroup = new Select(driver.findElement(By.id("Patient_ethnic_group_id")));
ethnicGroup.selectByVisibleText("White – British");
Select addressType = new Select(driver.findElement(By.id("Address_address_type_id")));
addressType.selectByVisibleText("Reply to");
driver.findElement(By.id("Address_address1")).sendKeys("Muzaffarpur");
driver.findElement(By.id("Contact_primary_phone")).sendKeys("7011422619");
Thread.sleep(10000);
// FILE
WebElement fileInput = driver.findElement(By.id("PatientReferral_uploadedFile"));
fileInput.sendKeys("C:\\\\Users\\\\Anshika\\\\Downloads\\\\aa.jpg");
//driver.findElement(By.id("Address_city")).sendKeys("Muzaffarpur");
driver.findElement(By.name("yt0")).click();
System.out.println("test failed");
Thread.sleep(1000);
//driver.findElement(By.xpath("//a[@href ='/OphCoDocument/default/view/4686440']")).click();
//driver.findElement(By.linkText("/OphCoDocument/default/view/4686440")).click();
driver.navigate().back();
driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.id("query")).sendKeys("Praveen pandey");
driver.findElement(By.id("js-find-patient")).click();
driver.findElement(By.id("r2339886")).click(); 

}
}

