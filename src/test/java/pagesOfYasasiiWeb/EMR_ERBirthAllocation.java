package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_ERBirthAllocation  extends PageFactoryInitYasasiiWeb{
	
	public EMR_ERBirthAllocation(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Hamburger;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement FOModule;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement Registration;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;
	@FindBy(xpath = "//li[contains(text(),'Miss')]")
	public WebElement SelectMiss;
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement EnterFirstNME;
	@FindBy(xpath = "//input[@id='age']")
	public WebElement EnterAge;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement EmergencyCheckBox;
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Save;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement OK;
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement EnterProviderName;
	@FindBy(xpath = "//li[contains(text(),'Kumar')]")
	public WebElement Selectprovider;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/app-billing-details[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/label[1]/i[1]")
	public WebElement Plus;
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement SAve;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement Okey;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]/i[1]")
	public WebElement ADT;
	@FindBy(xpath = "//input[@id='admittedproviderdisplayname']")
	public WebElement EnterInchargeProvider;
	@FindBy(xpath = "//li[contains(text(),'Mohan Ram Das(ram01)')]")
	public WebElement SelectinchargeProvider;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[4]/li[1]")
	public WebElement SelectRoomType;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BedNumber;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[8]/li[1]")
	public WebElement SelectBed;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SaVe;
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Module;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement SelectModule;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement EMR;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement ERSelect;
	@FindBy(xpath = "//li[contains(text(),'ER')]")
	public WebElement SelectER;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
	public WebElement SelectPatient;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement Arrow;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement Lock;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement DoctorNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement Ok;
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[5]/div[1]/div[1]")
	public WebElement SelectMedicine;
	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement MedicineOrder;
	@FindBy(xpath = "//li[contains(text(),'Ongoing')]")
	public WebElement Ongoing;
	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement Type;
	@FindBy(xpath = "//li[contains(text(),'Patient own medication')]")
	public WebElement OwnMedication;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADD;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]")
	public WebElement ThreeDots;
	@FindBy(xpath = "//div[contains(text(),'Discontinue/Hold')]")
	public WebElement DiscontinueHold;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-discontinuehold[1]/form[1]/div[2]/div[1]/div[1]/div[2]/button[2]")
	public WebElement oK;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement SAVe;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[7]/span[1]")
	public WebElement adt;
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Discharge;
	@FindBy(xpath = "//li[contains(text(),'Cured')]")
	public WebElement Cured;
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition;
	@FindBy(xpath = "//li[contains(text(),'Discharged Home')]")
	public WebElement Selectdispostn;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement sAve;
	
	

public void ERBedAllocation() throws InterruptedException, IOException {
	
    Thread.sleep(1000);
	Hamburger.click();
	Thread.sleep(800);
	FOModule.click();
	Thread.sleep(500);
	Registration.click();
	Thread.sleep(800);
	
	Title.click();
	SelectMiss.click();
	EnterFirstNME.sendKeys("Nani");
	EnterAge.sendKeys("25");
	Thread.sleep(1000);
	try {
		
	
	WebElement chekbox=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]"));
	{
	if(!chekbox.isSelected())
	{
	
	Save.click();
	}
	}
	}
	//OK.click();
		//chekbox.click();
		//chekbox.click();	
//	{
//	if(driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).isEnabled())
//	{
//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
//	}
//	}
	
	catch(Exception e)
	{
		WebElement chekox=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]"));
		Thread.sleep(600);
		chekox.click();
		Thread.sleep(500);
		Save.click();
		Thread.sleep(600);
		
	
		//WebElement chebox=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]"));
		//chebox.click();
	//	EmergencyCheckBox.click();
	//	Save.click();
	}
	
	
	
	//Thread.sleep(600);
	//EmergencyCheckBox.click();
	//Thread.sleep(500);
	//Save.click();
	Thread.sleep(600);
	OK.click();
	Thread.sleep(600);
	EnterProviderName.sendKeys("Ram");
	Thread.sleep(800);
	Selectprovider.click();
	Thread.sleep(800);
	Plus.click();
	Thread.sleep(800);
	SAve.click();
	Thread.sleep(1000);
	Okey.click();
	Thread.sleep(600);
	ADT.click();
	Thread.sleep(1000);
	EnterInchargeProvider.sendKeys("Mohan");
	Thread.sleep(600);
	SelectinchargeProvider.click();
	RoomType.click();
	SelectRoomType.click();
	BedNumber.click();
	SelectBed.click();
	SaVe.click();
	Thread.sleep(900);
	Module.click();
	Thread.sleep(500);
	SelectModule.click();
	Thread.sleep(500);
	EMR.click();
	Thread.sleep(500);
	EMRHomeScreen.click();
	Thread.sleep(600);
	ERSelect.click();
	SelectER.click();
	EnterName.sendKeys("Nani");
	Thread.sleep(700);
	SelectPatient.click();
	Thread.sleep(900);
	Arrow.click();
	Lock.click();
	DoctorNote.click();
	Thread.sleep(500);
	EnterChiefComplaint.sendKeys("hedache");
	Ok.click();
	Thread.sleep(900);
	CPOEPharmacy.click();
	Thread.sleep(600);
	SelectMedicine.click();
	Thread.sleep(500);
	MedicineOrder.click();
	Ongoing.click();
	Type.click();
	OwnMedication.click();
	ADD.click();
	Thread.sleep(500);
	ThreeDots.click();
	DiscontinueHold.click();
	oK.click();
	Thread.sleep(500);
	SAVe.click();
	Thread.sleep(10000);
	adt.click();
	Thread.sleep(1000);
	Discharge.click();
	Cured.click();
	Disposition.click();
	Selectdispostn.click();
	Thread.sleep(600);
	sAve.click();
	
	
}
}