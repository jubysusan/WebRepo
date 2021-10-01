package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class EMROPNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMROPNoteYasasiiWeb(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	} 
	@FindBy(xpath="//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement toggle;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement emr;
	
	@FindBy(xpath="//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;
	
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement Menudropdown;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")
	public WebElement selectop;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]"
			+ "")
	public WebElement patientselect;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement patienthomepagelock;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement docnote;
	
   // @FindBy(xpath = "//button[contains(text(),'Create New Note')]")
   //  public WebElement createnote;
		
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	
	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP;
	
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	
	@FindBy(xpath="//div[contains(text(),'Vital Signs')]")
	public WebElement vitalsigns;
	
	@FindBy (xpath="//input[@id='vital010']")
	public WebElement height;
	
	@FindBy(xpath="//input[@id='vital030']")
	public WebElement Weight;
	
	@FindBy(xpath="//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEServices;
	
	
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch1;
	
	
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	public WebElement point1;
	
	@FindBy(xpath="//span[contains(text(),'Schedule')]")
	public WebElement schedule;
	
	@FindBy(xpath="//span[contains(text(),'Weekly')]")
	public WebElement Weekly;
	@FindBy(xpath="//input[@id='weekcount']")
	public WebElement reoccur;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-cpoe-service-orderdetails[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/app-cpoe-service-orderschedule[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]")
	public WebElement tuesday;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-cpoe-service-orderdetails[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/app-cpoe-service-orderschedule[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/label[1]/span[1]")
	public WebElement Friday;
	@FindBy(xpath="//input[@id='occurrenceCount']")
	public WebElement occurcount;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-cpoe-service-orderdetails[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/app-cpoe-service-orderschedule[1]/form[1]/div[1]/div[1]/div[3]/div[5]/button[1]")
	public WebElement scheduleadd;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	public WebElement update;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[1]/div[2]/span[3]/i[1]")
	public WebElement refresh;
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch2;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[1]/div[2]/span[3]/i[1]")
	public WebElement refresh1;
	
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch3;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]")
	public WebElement SelectMedicine;
    
			
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch1;
	
	@FindBy(xpath ="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement SelectM;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine1;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch2;
	
	@FindBy(xpath="//input[@id='MedicineName']")
	public WebElement medicinename;
	
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-pharmacy-additive[1]/form[1]/div[1]/div[1]/div[3]/div[4]/span[1]")
	public WebElement Add;
	
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-pharmacy-additive[1]/form[1]/div[1]/div[1]/div[5]/div[1]/button[1]")
	public WebElement ok;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine2;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch3;
	
	@FindBy(xpath="//input[@id='mindose']")
	public WebElement mindose;
	
	@FindBy(xpath="//input[@id='doseunitid']")
	public WebElement doseunit;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[2]/div[2]/span[1]/i[1]")
	public WebElement dosage;
	
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-cpoe-dose-details[1]/form[1]/div[2]/button[1]")
	public WebElement doseok;
	
	@FindBy(xpath="//input[@id='routeid']")
	public WebElement routeid;
		
	@FindBy(xpath="//input[@id='formid']")
    public WebElement form;	
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency1;
	
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-cpoe-frequency-details[1]/form[1]/div[2]/div[1]/div[1]/button[1]")
	public WebElement okay;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine3;
	
	// Linked Medicine
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch4;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency2;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement days;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine4;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch5;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[3]/div[1]/div[1]/label[3]/span[1]")
	public WebElement linkedmedicine;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine5;
	
	@FindBy (xpath="//body/modal-container[1]/div[1]/div[1]/app-cpoe-linkedmedicine[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement checkbox;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	public WebElement ok1;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch6;
	
	@FindBy(xpath="//input[@id='mindose']")
	public WebElement mindose1;
	
	@FindBy(xpath="//input[@id='doseunitid']")
	public WebElement doseunit1;
	
	@FindBy(xpath="//input[@id='routeid']")
	public WebElement routeid1;
		
	@FindBy(xpath="//input[@id='formid']")
    public WebElement form1;	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency3;
	
		
	@FindBy(xpath="//input[@id='duration']")
	public WebElement duration;
	
	//@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	//public WebElement days1;
	
	@FindBy(xpath="//input[@id='antibioticorderingreasonid']")
	public WebElement OrderingReason;
	
	@FindBy(xpath="//label[contains(text(),'Add as Tapering')]")
	public WebElement tapering;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency4;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement dayss;
	
	@FindBy(xpath="//label[contains(text(),'Add as Tapering')]")
	public WebElement tapering1;
	
		
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine6;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch7;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[2]/div[2]/span[1]/i[1]")
	public WebElement doseicon;
	
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-cpoe-dose-details[1]/form[1]/div[2]/button[1]")
	public WebElement OKK;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency5;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine7;
		
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement emrsave;
	
//create new note for Discontinue the Medicine 
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement docnote1;
	
    @FindBy(xpath = "//button[contains(text(),'Create New Note')]")
    public WebElement createnote1;
		
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate1;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template1;
	
	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP1;
	
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK1 ;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy1;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]")
	public WebElement active;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/label[1]/span[1]")
	public WebElement Check;
	
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[2]/div[1]/i[1]")
	public WebElement point;
	
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/lib-discontinuehold[1]/form[1]/div[2]/div[1]/div[1]/div[2]/button[2]")
	public WebElement ok2;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement emrsave1;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/app-patient-pharmacy-result[1]/div[1]/div[1]/div[1]/span[1]/i[1]")
	public WebElement inactive;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/app-patient-pharmacy-result[1]/div[1]/div[1]/div[1]/span[1]/i[1]")
	public WebElement inactive1;
	
	@FindBy(xpath="//div[contains(text(),'Antibiotic Medicines')]")
	public WebElement antibiotic;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/app-patient-pharmacy-result[1]/div[1]/div[1]/span[1]/span[1]/i[1]")
	public WebElement diplaydots;
	
	@FindBy(xpath="//span[contains(text(),'Calculator')]")
	public WebElement calculator;
		
	@FindBy(xpath="//input[@id='reqdose']")
	public WebElement reqdose;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]")
	public WebElement editmedicine;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement id;
	
	@FindBy(xpath="//button[@id='updatePharmacy']")
	public WebElement Updatepharmacy;
	
	
	
		
	public EMRCPOEAdminstrationYasasiiWeb OP_EMRReg() throws InterruptedException {

		 Thread.sleep(1000);
   	      patientselect.click();
		  Thread.sleep(2000);
		  patienthomepageicon.click();
		  patienthomepagelock.click();
		  Thread.sleep(5000);
		  docnote.click();
			Thread.sleep(1000);
	//	createnote.click();
	 	Thread.sleep(1000);
	 	   encreate.clear();
	       encreate.click();
		   Thread.sleep(1000);
		    encreate.sendKeys("Fever");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
			Thread.sleep(3000);
			template.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
			clickOK.click();
			Thread.sleep(1000);
//vitalsigns			
			vitalsigns.click();
			Thread.sleep(1000);
			height.click();
			height.sendKeys("165");
			height.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Weight.click();
			Weight.sendKeys("75");
			Thread.sleep(1000);
//CPOEService
			CPOEServices.click();
			Thread.sleep(1000);
			CPOESearch1.click();
			CPOESearch1.sendKeys("Potassium");
			Thread.sleep(1000);
			//CPOESearch1.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[2]/div[2]/div[1]/label[2]")).click();
			Thread.sleep(1000);
			point1.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
			Thread.sleep(1000);
			schedule.click();
			Thread.sleep(1000);
			Weekly.click();
			Thread.sleep(1000);
			reoccur.click();
			reoccur.sendKeys("2");
			reoccur.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			tuesday.click();
			Thread.sleep(1000);
			Friday.click();
			Thread.sleep(1000);
			occurcount.click();
			occurcount.sendKeys("4");
			occurcount.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			scheduleadd.click();
			Thread.sleep(1000);
			update.click();
			Thread.sleep(1000);
		//	driver.findElement(By.xpath("//input[@id='cpoeSearchText']")).click();
			refresh.click();
			Thread.sleep(1000);
			CPOESearch2.click();
			CPOESearch2.clear();
			CPOESearch2.sendKeys("Lipid Panel");
			CPOESearch2.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[contains(text(),'Lipid Panel')]")).click();
			Thread.sleep(1000);
	//Instructions
			refresh1.click();
			Thread.sleep(500);
			CPOESearch3.click();
			CPOESearch3.clear();
			CPOESearch3.sendKeys("check Blood Pressure");
			CPOESearch3.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[contains(text(),'check Blood pressure')]")).click();
			Thread.sleep(500);
////			
////			
//////Cpoe Pharmacy
			
			CPOEPharmacy.click();
			Thread.sleep(1000);
////			
//////ongoing- patient own medication			
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[3]/span[1]/i[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(text(),'Ongoing')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(text(),'Patient own medication')]")).click();
			CPOEPharmacysearch.sendKeys("Augmentin");
			CPOEPharmacysearch.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
	     	driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]")).click();
	    	Thread.sleep(2000);
	  		ADDMedicine.click();
	    	Thread.sleep(1000);
	    	
//////Past-outsidehospital	    	
	    	
	    	driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[3]/span[1]/i[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[3]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(text(),'Outside hospital')]")).click();
			Thread.sleep(1000);
			CPOEPharmacysearch1.click();
			CPOEPharmacysearch1.clear();
			CPOEPharmacysearch1.sendKeys("Dolopar");
			CPOEPharmacysearch1.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			ADDMedicine1.click();
//////Additive Medicine		
			CPOEPharmacysearch2.click();
			CPOEPharmacysearch2.clear();
			CPOEPharmacysearch2.sendKeys("Dextrose");
			CPOEPharmacysearch2.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(text(),'Dextrose + 0.45% Normal Saline 500Ml-Fresinius, 50')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[3]/div[2]/span[1]/i[1]")).click();
			Thread.sleep(1000);
			medicinename.click();
			Thread.sleep(1000);
			medicinename.sendKeys("Deriphyllin Inj");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[contains(text(),'Deriphyllin Inj')]")).click();
			Thread.sleep(500);
			Add.click();
			Thread.sleep(500);
			ok.click();
			Thread.sleep(500);
			frequency.click();
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(1000);
			ADDMedicine2.click();
			Thread.sleep(500);
////			
////// sliding scale
			CPOEPharmacysearch3.click();
			CPOEPharmacysearch3.clear();
			CPOEPharmacysearch3.sendKeys("Insulin");
			CPOEPharmacysearch3.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[13]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			mindose.click();
			mindose.sendKeys("2");
			Thread.sleep(1000);
			doseunit.click();
			Thread.sleep(500);
			doseunit.sendKeys("%");
			driver.findElement(By.xpath("//li[contains(text(),'%')]")).click();
			Thread.sleep(1000);
		  dosage.click();
		  Thread.sleep(1000);
		  doseok.click();
		  Thread.sleep(1000);
//			routeid.click();
//			driver.findElement(By.xpath("//li[contains(text(),'Intravenous')]")).click();
//			Thread.sleep(1000);
//			form.click();
//			driver.findElement(By.xpath("//li[contains(text(),'Injection')]")).click();
//			Thread.sleep(1000);
//			frequency1.click();
//			driver.findElement(By.xpath("//li[contains(text(),'Continuous Infusion')]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[4]/div[2]/span[1]/i[1]")).click();
//			Thread.sleep(1000);
//			okay.click();
//			Thread.sleep(1000);
//			ADDMedicine3.click();
//			Thread.sleep(1000);
//// linked Medicine
//			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[3]/span[1]/i[1]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[contains(text(),'New Order')]")).click();
//			Thread.sleep(1000);
//			CPOEPharmacysearch4.clear();
//			CPOEPharmacysearch4.click();
//			CPOEPharmacysearch4.sendKeys("calpol");
//			CPOEPharmacysearch4.sendKeys(Keys.ENTER);
//			Thread.sleep(500);
//			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[3]/div[1]/div[1]")).click();
//			Thread.sleep(500);
//			frequency2.click();
//			driver.findElement(By.xpath("//li[contains(text(),'Days')]")).click();
//			Thread.sleep(500);
//			days.click();
//			days.sendKeys("3");
//			Thread.sleep(1000);
//			ADDMedicine4.click();
//			Thread.sleep(500);
//			
//			CPOEPharmacysearch5.clear();
//			CPOEPharmacysearch5.click();
//			CPOEPharmacysearch5.sendKeys("Diabeta");
//			CPOEPharmacysearch5.sendKeys(Keys.ENTER);
//			Thread.sleep(500);
//			driver.findElement(By.xpath("//div[contains(text(),'by Oral')]")).click();
//			Thread.sleep(1000);
//			linkedmedicine.click();
//			Thread.sleep(1000);
//			ADDMedicine5.click();
//			Thread.sleep(1000);
//			checkbox.click();
//			Thread.sleep(500);
//	//		driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-cpoe-linkedmedicine[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
//			Thread.sleep(500);
//			ok1.click();
//			Thread.sleep(500);
////tapering medicine 1			
//			CPOEPharmacysearch6.clear();
//			CPOEPharmacysearch6.click();
//			CPOEPharmacysearch6.sendKeys("Amoxicillin");
//			CPOEPharmacysearch6.sendKeys(Keys.ENTER);
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
//			Thread.sleep(1000);
//			mindose1.click();
//			mindose1.sendKeys("2");
//			Thread.sleep(1000);
//			doseunit1.click();
//			Thread.sleep(1000);
//			doseunit1.sendKeys("%");
//			driver.findElement(By.xpath("//li[contains(text(),'Mg')]")).click();
//			Thread.sleep(1000);
//			 routeid1.click();
//			 Thread.sleep(1000);
//			//JavascriptExecutor js = (JavascriptExecutor) driver;
//			// js.executeScript("arguments[0].scrollIntoView();", routeid1);
//			// routeid1.click();
//		//	 Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[contains(text(),'Ear')]")).click();
//			Thread.sleep(1000);
//			form1.click();
//			driver.findElement(By.xpath("//li[contains(text(),'Drops')]")).click();
//			frequency2.click();
//			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
//			Thread.sleep(1000);
//			duration.click();
//			 duration.clear();
//		     duration.sendKeys("3");
//		//	 days1.click();
//		//	 days1.sendKeys("3");
//			
//			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
//			 js1.executeScript("arguments[0].scrollIntoView();", OrderingReason);
//			 OrderingReason.click();
//			 Thread.sleep(1000);
//			 driver.findElement(By.xpath("//li[contains(text(),'Culture')]")).click();
//			 Thread.sleep(1000);
//			 tapering.click();
//			 Thread.sleep(1000);
//			 frequency4.click();
//			 driver.findElement(By.xpath("//li[contains(text(),'Days')]")).click();
//			 Thread.sleep(1000);
//			 dayss.click();
//			 dayss.sendKeys("3");
//			 Thread.sleep(1000);
//			 tapering1.click();
//			 Thread.sleep(1000);
//			 ADDMedicine6.click();
//			 Thread.sleep(1000);
////    		
////		     CPOEPharmacysearch7.clear();
		  	CPOEPharmacysearch7.click();
			CPOEPharmacysearch7.sendKeys("Urifast");
			CPOEPharmacysearch7.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			doseicon.click();
			Thread.sleep(1000);
			calculator.click();
			Thread.sleep(1000);
			reqdose.click();
			Thread.sleep(1000);
			reqdose.sendKeys("2");
			reqdose.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			OKK.click();
		    Thread.sleep(1000);
		    frequency5.click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		    Thread.sleep(1000);
		     ADDMedicine7.click();
//Edit the adding Medicine.
		     Thread.sleep(1000);
		     editmedicine.click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
		     Thread.sleep(1000);
		     id.click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//li[contains(text(),'OD')]")).click();
		     Thread.sleep(1000);
		     Updatepharmacy.click();
		     Thread.sleep(1000);
		  	 emrsave.click();
		     Thread.sleep(20000);
		    
//NewNote
		    docnote1.click();
			Thread.sleep(1000);
		    createnote1.click();
	 	    Thread.sleep(1000);
	 	    encreate1.clear();
	        encreate1.click();
		    Thread.sleep(1000);
		
		    encreate1.sendKeys("Fever");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
			Thread.sleep(3000);
			template1.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
			clickOK1.click();
			Thread.sleep(1000);
			CPOEPharmacy1.click();
			Thread.sleep(1000);
			 active.click();
			Thread.sleep(1000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].scrollIntoView();", Check);
			Check.click();
			Thread.sleep(1000);
//Discontinue//hold
			point.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(text(),'Discontinue/Hold')]")).click();
			Thread.sleep(1000);
			ok2.click();
			Thread.sleep(1000);
			emrsave1.click();
			Thread.sleep(8000);
			inactive.click();
			Thread.sleep(1000);
//Inactive List
			driver.findElement(By.xpath("//div[contains(text(),'Inactive Medicines')]")).click();
			Thread.sleep(2000);
			inactive1.click();
			Thread.sleep(1000);
//Antibiotic 
			antibiotic.click();
			Thread.sleep(1000);
			diplaydots.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/app-patient-pharmacy-result[1]/div[1]/div[1]/span[1]/span[1]/div[1]/div[1]")).click();
			Thread.sleep(1000);
  		  return new EMRCPOEAdminstrationYasasiiWeb(driver);
			
			
	}

	
	
}
