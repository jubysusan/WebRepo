package pagesOfYasasiiWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRIPDischargeYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public EMRIPDischargeYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement IP;
	
	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement MyDepartment;
	
	@FindBy(xpath = "//li[contains(text(),'All IP')]")
	public WebElement AllIP;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatient;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement SelectPatient;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement UParrow;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/img[1]")
	public WebElement DoctorNote;
	
	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement CreateNewNote;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[9]/li[1]")
	public WebElement SOAP;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement OK;
	
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement DiagnosisAndPlan;
	
	@FindBy(xpath = "//span[contains(text(),'Discharge Recommendation')]")
	public WebElement DischargeRecommendation;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement PatientForDischarge;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEService;
	
	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement EnterServiceName;
	
	@FindBy(xpath = "//label[contains(text(),'copper')]")
	public WebElement SelectService;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement EnterMedicine;
	
	@FindBy(xpath = "//div[contains(text(),'by Oral')]")
	public WebElement SelectMedicine;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADD;
	
	@FindBy(xpath = "//div[@id='emrdashboard_save']")
	public WebElement Save;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[7]/img[1]")
	public WebElement ADT;
	
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement DischargeStatus;
	
	@FindBy(xpath = "//li[contains(text(),'Cured')]")
	public WebElement SelectStatus;
	
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition;

	@FindBy(xpath = "//li[contains(text(),'Discharged Home')]")
	public WebElement SelectDisposition;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement save;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement patienthomepagelock;
	

	
	
public void DischargeSelectionn() throws InterruptedException{
		
		Thread.sleep(1000);
		OP.click();
		Thread.sleep(500);
		IP.click();
		Thread.sleep(500);
		MyDepartment.click();
		Thread.sleep(500);
		AllIP.click();
		Thread.sleep(500);
		EnterPatient.sendKeys("Krip");
		Thread.sleep(1000);
		SelectPatient.click();
		 Thread.sleep(5000);
		  patienthomepageicon.click();
		  patienthomepagelock.click();
		  Thread.sleep(5000);
		DoctorNote.click();
		//CreateNewNote.click();
		Template.click();
		SOAP.click();
		OK.click();
		DiagnosisAndPlan.click();
		DischargeRecommendation.click();
		Thread.sleep(1000);
		PatientForDischarge.click();	
		CPOEService.click();
		
		EnterServiceName.sendKeys("Copper");
		SelectService.click();
		CPOEPharmacy.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(text(),'In-Active')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Add')]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//label[contains(text(),'Current Note')]")).click();
    	Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='order-head']/div/div[@class='ng-star-inserted']/label[contains(text(),'Active')][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Current Note')]")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//div[@class='order-head']/div/div[@class='ng-star-inserted']/label[contains(text(),'Active')][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add as New')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-cpoe-diagnosis-list[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		Thread.sleep(1000);
		EnterMedicine.sendKeys("ultracet");
		Thread.sleep(500);
		SelectMedicine.click();
		Thread.sleep(500);
		ADD.click();
		UParrow.click();
		Save.click();
		Thread.sleep(5000);
		
		ADT.click();
		DischargeStatus.click();
		SelectStatus.click();
		Disposition.click();
		SelectDisposition.click();
		save.click();
		
}
	
	
	

}
