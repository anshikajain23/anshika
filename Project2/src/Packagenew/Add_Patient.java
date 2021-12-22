package Packagenew;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Add_Patient {

	
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



	driver.findElement(By.linkText("Add Patient")).click();
	driver.get("http://164.52.219.76:8085/patient/create");
	

	Thread.sleep(1000);
	driver.findElement(By.id("autocomplete_gp_id")).sendKeys("doctor reddy");
	driver.findElement(By.id("autocomplete_practice_id")).sendKeys("9999");
	driver.findElement(By.id("autocomplete_user_id")).sendKeys("Hospital");
	driver.findElement(By.id("Address_address1")).sendKeys("UK");
	driver.findElement(By.id("Address_address2")).sendKeys("India");
	driver.findElement(By.id("Address_city")).sendKeys("Gurgaon");
	driver.findElement(By.id("Address_postcode")).sendKeys("411054");
	driver.findElement(By.id("Address_county")).sendKeys("new_India");
	driver.findElement(By.id("Contact_primary_phone")).sendKeys("9766058674");
	driver.findElement(By.id("Address_email")).sendKeys("anshika_jain@gmail.com");
	driver.findElement(By.id("Contact_title")).sendKeys("Add_New_patient");
	driver.findElement(By.id("Patient_hos_num")).sendKeys("14446");
	driver.findElement(By.id("Contact_first_name")).sendKeys("Rahul");
	driver.findElement(By.id("Patient_nhs_num")).sendKeys("1952");
	driver.findElement(By.id("Contact_last_name")).sendKeys("Jain");
	driver.findElement(By.id("PatientIdentifier_0_value")).sendKeys("medical record number=7896");
    driver.findElement(By.id("Contact_maiden_name")).sendKeys("Raj");
  

	Thread.sleep(1000);
	
	
 WebElement datebox = driver.findElement(By.id("Patient_dob"));
 datebox.sendKeys("28/10/1993");
 driver.findElement(By.id("Patient_is_deceased"));

	Thread.sleep(1000);

    
  WebElement l=driver.findElement(By.id("Patient_is_deceased"));
    // select checkbox with click()
  l.click();
    
 WebElement datebox2 = driver.findElement(By.id("Patient_date_of_death"));
    
    
    datebox2.sendKeys("27/10/1923");
   // driver.findElement(By.id("pmu-disabled pmu-button"));
    
    
    //driver.quit();
    
    Thread.sleep(1000);
    
    // FILE UPLOADING USING SENDKEYS ....
    
   
    
    // drop down 
    
    
    
  
    Select patientSource = new Select(driver.findElement(By.name("Patient[patient_source]")));
    patientSource.selectByVisibleText("Other");
    Select gender = new Select(driver.findElement(By.id("Patient_gender")));
    gender.selectByVisibleText("Male");
    Select ethnicGroup = new Select(driver.findElement(By.id("Patient_ethnic_group_id")));
    ethnicGroup.selectByVisibleText("White – British");
    Select addressType = new Select(driver.findElement(By.id("Address_address_type_id")));
    addressType.selectByVisibleText("Reply to");



	Thread.sleep(2000);
    
    
    
    
    //WebElement browse = driver.findElement(By.id("PatientReferral_uploadedFile"));
  //driver.findElement(By.id("PatientReferral_uploadedFile")).click();
   // WebElement browse = driver.findElement(By.id("PatientReferral_uploadedFile"));
    //click on ‘Choose file’ to upload the desired file
  // browse.sendKeys("C:\\Users\\Anshika Jain\\Pictures\\Screenshots\\pic.png"); 
    //System.out.println("File is Uploaded Successfully");
    
    
    
    
    //WebElement element=driver.findElement(By.xpath("//select[@id=’Patient_patient_source’]"));
    //Select sel = new Select(element);
   // sel.selectByVisibleText("Referral");		
    // select an option by value method
    //s.selectByValue("Referral");
 
    // select an option by index method
    //sel.selectByIndex(1); 
   // sel.selectByValue("1");	
    //sel.deselectByVisibleText("Referral");

	//System.out.println(sel.isMultiple());
	

   // WebElement Firstelement= sel.getFirstSelectedOption();
   // System.out.println("first element"+Firstelement.getText());
	

   // WebElement element2=driver.findElement(By.xpath("//select[@id=’Patient_gender’]"));
    //Select sel2 = new Select(element2);

    //sel2.selectByValue("3");
    //sel.deselectByVisibleText("Female");
  //  WebElement Firstelement1= sel.getFirstSelectedOption();
   // System.out.println("first element"+Firstelement1.getText());
    
    
    
    	 	
    //WebElement upload_file = 

    //upload_file.sendKeys("C:\\Users\\Anshika Jain\\Desktop\\anshiwordfile.docx");
    
    

WebElement fileInput = driver.findElement(By.id("PatientReferral_uploadedFile"));

fileInput.sendKeys("C:\\Users\\Anshika\\Downloads\\aa.jpg");

   

Thread.sleep(10000);

driver.findElement(By.name("yt0")).click();
    
    
	Thread.sleep(10000);
	
	
	
	//a[text()='Cancel']
driver.findElement(By.xpath("//a[text()='Cancel']")).click();



Thread.sleep(2000);
	
  
    
    
	}}
