package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class OutsiderPatientYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public OutsiderPatientYasasiiWeb(WebDriver driver) {
	
		super(driver);
	}
	
	
	@FindBy(xpath= "//input[@id='maincategory']")
	WebElement maincategorySearch;
	
	@FindBy(xpath= "//li[contains(text(),'Outsider')]")
	WebElement maincategoryoutsider;
	
	@FindBy(xpath= "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[3]/div[2]/span[1]/i[1]")
	WebElement outsiderpatienticon;
	
	@FindBy(xpath= "//input[@id='firstname']")
	WebElement firstname;
	
	@FindBy(xpath= "//input[@id='middlename']")
	WebElement middlename;
	
	@FindBy(xpath= "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	WebElement gender;
	
	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement phoneno;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/button[1]")
	public WebElement howdiduknow;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[1]/div[1]/label[1]/span[1]")
	public WebElement checknewspaper;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement howdiduknowOk;
	
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement fosave;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	public WebElement register;
	
	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;

	@FindBy(xpath = "//span[contains(text(),' Contact Information ')]")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

	@FindBy(xpath = "//input[@id='homeaddress2']")
	public WebElement homeadd2;

	@FindBy(xpath = "//span[contains(text(),' Document Identification ')]")
	public WebElement docIdentification;
	
	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[2]/button[1]/label[1]/i[1]")
	public WebElement docadd;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement successok;
	
  
    public Outsiderappointment Outsiderentry() throws InterruptedException
	{
    	Thread.sleep(1000);
    	maincategorySearch.click();
    	maincategoryoutsider.click();
    	outsiderpatienticon.click();
    	firstname.sendKeys("Kripz");
    	middlename.sendKeys("Thom");
    	gender.click();
    	driver.findElement(By.xpath("//li[contains(text(),'Male')]")).click();
    	age.sendKeys("39");
		age.sendKeys(Keys.ENTER);
		phoneno.sendKeys("1017764423");
		Thread.sleep(5000);
		howdiduknow.click();
		checknewspaper.click();
		Thread.sleep(1000);
		howdiduknowOk.click();
		Thread.sleep(5000);
		fosave.click();
		return new Outsiderappointment(driver);
	}
    
    public void OutsiderRegistration() throws InterruptedException
    
    {
    
		Thread.sleep(2000);
		register.click();
		organisation.sendKeys("Ki");
		driver.findElement(By.xpath("//li[contains(text(),'KIMS')]")).click();
		contInformation.click();
		Thread.sleep(2000);
		homeadd1.sendKeys("houseno69");
		homeadd2.sendKeys("Ullas Nagar");
		docIdentification.click();
		docnumber.sendKeys("JKLP/20Z3/01SS");
		docadd.click();
		Thread.sleep(5000);
		fosave.click();
		Thread.sleep(2000);
		successok.click();
		
		
	}
    

}
