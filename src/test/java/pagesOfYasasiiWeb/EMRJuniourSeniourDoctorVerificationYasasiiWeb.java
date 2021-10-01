package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRJuniourSeniourDoctorVerificationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRJuniourSeniourDoctorVerificationYasasiiWeb(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement IP;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement SelectIP;
	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement MyDepartment;
	@FindBy(xpath = "//li[contains(text(),'All IP')]")
	public WebElement AllIp;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
	public WebElement SelectPatient;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement Arrow;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement LockArrow;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement DoctorNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate;
	@FindBy(xpath = "//li[contains(text(),'SOAP')]")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement OK;
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement DiagnosisAndPlan;
	@FindBy(xpath = "//div[contains(text(),'A48.4 Brazilian purpuric fever')]")
	public WebElement SelectICD;
	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEService;
	@FindBy(xpath = "//label[contains(text(),'Glucose 2 HR')]")
	public WebElement SelectService;
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement PatientNotInterviewed;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	public WebElement aDd;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[5]/label[1]/span[1]/i[1]")
	public WebElement AdmissionReconsile;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[3]/label[2]/span[1]/i[1]")
	public WebElement Reconsile;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement yeS;
	
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'by Oral')]")
	public WebElement SelectMedicine;	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[5]/div[2]/span[1]/i[1]")
	public WebElement FrequencyDetails;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/app-cpoe-frequency-details[1]/form[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/app-cpoe-pharmacy-admintime[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterQuantity;		
	@FindBy(xpath = "//span[contains(text(),'Schedule')]")
	public WebElement Schedule;
	@FindBy(xpath = "//input[@id='weeklyValue']")
	public WebElement EnterRecover;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/app-cpoe-frequency-details[1]/form[1]/div[1]/div[1]/tabset[1]/div[1]/tab[2]/app-cpoe-pharmacy-schedule[1]/form[1]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[2]/div[1]/label[3]/span[1]")
	public WebElement Tuesday;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/app-cpoe-frequency-details[1]/form[1]/div[2]/div[1]/div[1]/button[1]")
	public WebElement ok;
	@FindBy(xpath = "//input[@id='orderreadback']")
	public WebElement OrderRead;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[4]/div[1]/label[2]/img[1]")
	public WebElement Print;
	@FindBy(xpath = "//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[2]")
	public WebElement CancelPrint;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement Save;

	//logout and then login as senior doctor
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[2]/li[5]/a[1]")
	public WebElement DownArrow;
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[2]/li[5]/div[1]/div[1]/a[6]/span[2]")
	public WebElement LogOut;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/ki-dialog-common[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement Yes;
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement EnterUserId;
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement EnterPassword;
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement Site;
	@FindBy(xpath = "//li[contains(text(),'KIMSHEALTH TVM')]")
	public WebElement SelectSite;
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	public WebElement login;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[3]/span[1]/div[1]")
	public WebElement Task;
	@FindBy(xpath = "//span[contains(text(),'Jr doctor sr doctor verification')]")
	public WebElement JrToSrDrVerification;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Entername;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")
	public WebElement SelectName;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement SideArrow;
	@FindBy(xpath = "//*[@class='ki ki-check-circle-fill' and @title='Counter Sign Pending']")
	
	public WebElement CounterSignPending;
	@FindBy(xpath = "//textarea[@id='countersignremarkstxt']")
	public WebElement EnterCounterSignRemarks;
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement SaveCounterSign;
	
	
	
	
public void JuniourSeniorDoctorAction() throws InterruptedException, IOException, AWTException {
		
	    Thread.sleep(600);
	    IP.click();
	    SelectIP.click();
	    MyDepartment.click();
	    AllIp.click();
		Thread.sleep(1000);
		EnterName.sendKeys("Nirupam");
		Thread.sleep(800);
		SelectPatient.click();
		Thread.sleep(800);
		Arrow.click();
		LockArrow.click();
		DoctorNote.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chiefcomplainttext']")).clear();
		Thread.sleep(600);
		EnterChiefComplaint.sendKeys("Infection");
		Thread.sleep(600);
		EnterTemplate.click();
		EnterTemplate.sendKeys("SOA");
		Thread.sleep(700);
		SelectTemplate.click();
		OK.click();
		Thread.sleep(800);
		DiagnosisAndPlan.click();
		SelectICD.click();
		CPOEService.click();
		SelectService.click();
		CPOEPharmacy.click();
		PatientNotInterviewed.click();
		aDd.click();
		AdmissionReconsile.click();
		Reconsile.click();
		Thread.sleep(600);
		yeS.click();
		Thread.sleep(700);
		SelectMedicine.click();
		Thread.sleep(600);
		FrequencyDetails.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-cpoe-frequency-details[1]/form[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/app-cpoe-pharmacy-admintime[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")).clear();
		Thread.sleep(600);
		EnterQuantity.sendKeys("2");
		Schedule.click();
		EnterRecover.sendKeys("1");
		Tuesday.click();
		ok.click();
		OrderRead.sendKeys("yes");
		AddMedicine.click();
		Thread.sleep(900);
//		Print.click();
//		Thread.sleep(1000);
		
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
		
//		Robot robot = new Robot();
//		robot.mouseMove(1000, 1);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\\\"sidebar\\\"]//print-preview-button-strip//div/cr-button[2]")).click();
		//CancelPrint.click();
		Save.click();
		Thread.sleep(5000);
		DownArrow.click();
		Thread.sleep(1000);
		LogOut.click();
		Thread.sleep(800);
		Yes.click();
		Thread.sleep(2000);
		EnterUserId.sendKeys("doc01");
		EnterPassword.sendKeys("KAmeda123$");
		Site.click();
		SelectSite.click();
		login.click();
		Thread.sleep(1000);
		Task.click();
		Thread.sleep(600);
		JrToSrDrVerification.click();
		Thread.sleep(900);
		Entername.sendKeys("Nirupam");
		Thread.sleep(600);
		SelectName.click();
		Thread.sleep(1000);
		
		try
		{
			SideArrow.click();
		}
		catch (Exception e)
		{
			
		}
		
		//SideArrow.click();
		Thread.sleep(600);
		CounterSignPending.click();
		Thread.sleep(600);
		EnterCounterSignRemarks.sendKeys("Juniour Doctor Verified");
		Thread.sleep(600);
		SaveCounterSign.click();
		Thread.sleep(600);

}
}