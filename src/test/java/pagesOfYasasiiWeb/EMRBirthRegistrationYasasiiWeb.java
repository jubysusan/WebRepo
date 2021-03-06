package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRBirthRegistrationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRBirthRegistrationYasasiiWeb(WebDriver driver) {

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
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterMob;
	@FindBy(xpath = "//input[@id='division']")
	public WebElement EnterOrganisationLetter;
	@FindBy(xpath = "//li[contains(text(),'Others')]")
	public WebElement SelectOrganisation;
	@FindBy(xpath = "//span[contains(text(),'Contact Information')]")
	public WebElement ContactInformation;
	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement EnterAddress;
	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;
	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[2]/button[1]/label[1]/i[1]")
	public WebElement Clickadd;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[2]/button[1]")
	public WebElement HowDidYouKnow;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[3]/div[1]/label[1]/span[1]")
	public WebElement TV;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement Ok;
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Save;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement OK;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]/i[1]")
	public WebElement ADT;
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;
	@FindBy(xpath = "//li[contains(text(),'Kumar(doc01)')]")
	public WebElement SelectProviderName;
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;
	@FindBy(xpath = "//li[contains(text(),'WARD')]")
	public WebElement SelectBedCategory;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[4]/li[1]")
	public WebElement SelectRoomType;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement MenuToggle;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement EMR;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement SelectIP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
	public WebElement SelectPatient;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement UpArrow;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement DoctorNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate;
	@FindBy(xpath = "//li[contains(text(),'Antenatal Assessment')]")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement ClickOk;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-antenatal-assessment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Pregnant;
	@FindBy(xpath = "//input[@id='obstetricscore']")
	public WebElement EnterObstreticScore;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-antenatal-assessment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement MaritalStatus;
	@FindBy(xpath = "//input[@id='noofyears']")
	public WebElement EnterNoYears;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-antenatal-assessment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Conseption;
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[3]/div[5]/div/div[1]")
	public WebElement SelectMedicine;
	@FindBy(xpath = "//*[@id=\"prescriptiontypeid\"]")
	public WebElement Ongoing;
	@FindBy(xpath = "//li[contains(text(),'Ongoing')]")
	public WebElement SelectOngoing;
	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement Ownmedication;
	@FindBy(xpath = "//li[contains(text(),'Patient own medication')]")
	public WebElement SelectOwnMedication;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement Cladd;
	@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[3]/div[2]/div/div[1]")
	public WebElement Medicine2;
	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement Past;
	@FindBy(xpath = "//li[contains(text(),'Past')]")
	public WebElement SelectPast;
	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement OwnMedication;
	@FindBy(xpath = "//li[contains(text(),'Patient own medication')]")
	public WebElement SelectOnMedication;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement Cladd2;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement arrw;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement sAVe;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement arw;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement doctrnote;
	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement Selectcreate;
	
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Enteremplate;
	@FindBy(xpath = "//li[contains(text(),'Delivery Note')]")
	public WebElement Selectemplate;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement Clickk;	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]")
	public WebElement SelectBirthNote;
	@FindBy(xpath = "//input[@id='gestationperiodweeks']")
	public WebElement EnterGestationalAgeInWeeks;
	@FindBy(xpath = "//input[@id='genderid']")
	public WebElement Gender;
	@FindBy(xpath = "//li[contains(text(),'Female')]")
	public WebElement SelectGender;
	@FindBy(xpath = "//input[@id='weight']")
	public WebElement EnterWeight;
	@FindBy(xpath = "//input[@id='presentation']")
	public WebElement Presentation;
	@FindBy(xpath = "//li[contains(text(),'Breech')]")
	public WebElement SelectPresentation;
	@FindBy(xpath = "//input[@id='typeofdeliveryid']")
	public WebElement TypeOfDelivery;
	@FindBy(xpath = "//li[contains(text(),'Normal')]")
	public WebElement SelectNormal;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-birth-notes[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[3]/div[3]/div[1]/div[2]/img[1]")
	public WebElement APGARScore;
	@FindBy(xpath = "//input[@id='score0']")
	public WebElement RespiratoryEffort;
	@FindBy(xpath = "//li[contains(text(),'Good Cry')]")
	public WebElement SelectRespiratoryEffort;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[3]/button[1]")
	public WebElement CLickOk;
	@FindBy(xpath = "//input[@id='neonatalstatus']")
	public WebElement NeonatalStatus;
	@FindBy(xpath = "//li[contains(text(),'Alive')]")
	public WebElement SelectNeonatal;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-birth-notes[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[6]/div[3]/button[1]")
	public WebElement ADD;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement Uparw;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement SelectSave;
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement mentogle;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement modles;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement fomod;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement registran;
	
	
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement SelectBirthRegisration;
	@FindBy(xpath = "//li[contains(text(),'Birth Registration')]")
	public WebElement BirthRegitration;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Selectpatient;
	@FindBy(xpath = "//label[contains(text(),'Select')]")
	public WebElement Selectselect;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Mobnum;
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement clickSave;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement ClIckOK;
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProvidername;
	@FindBy(xpath = "//li[contains(text(),'Kumar(doc01)')]")
	public WebElement SelectProvidername;
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement prioty;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPrirty;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement Roomcatgry;
	@FindBy(xpath = "//li[contains(text(),'WARD')]")
	public WebElement Selectcategry;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement BEd;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[4]/li[1]")
	public WebElement SelectBEd;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BEDno;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]")
	public WebElement SelectBEDno;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAVE;
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[1]")
	public WebElement Menu;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MODules;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement EMR1;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement EMRHomeScreen1;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement Dropdown;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement IP;
	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement NextDropdown;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement MyDeptIP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName1;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
	public WebElement SelectBaby;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement UpArrow1;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement Lock;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement DoctorNote1;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint1;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate1;
	@FindBy(xpath = "//li[contains(text(),'SOAP')]")
	public WebElement SelectTemplate1;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement ClickOk1;
	
	@FindBy(xpath = "//div[contains(text(),'Child Development Chart')]")
	public WebElement ChildDevelopmentChart;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-childmilestone[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][1]")
	public WebElement SocialSmile;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ClickOk2;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-childmilestone[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][2]")
	public WebElement EyesFollow;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ClickOk3;
	
	/*@FindBy(xpath = "//*[name()='g' and contains(@class,'raphael-gr')]//*[name()='g' and contains(@class,'raphael-gr')]//*[name()='g' and contains(@class,'raphael-gr')]//*[name()='g' and contains(@class,'raphael-gr')]//*[name()='rect' and contains(@width,'54')]")
	public WebElement TransferObj;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ClickOk4;*/
	

	@FindBy(xpath = "//div[contains(text(),'Child Language Evaluation Chart')]")
	public WebElement ChildLangEval;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][1]")
	public WebElement RespondsToBell;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ClickOk5;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][2]")
	public WebElement RespondsToSmile;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ClickOk6;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][7]")
	public WebElement ListensWhenSpoken;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ClickOk7;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement SelectSave1;
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement mentogle1;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement modles1;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement fomod1;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement registran1;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement FoMenu1;
	@FindBy(xpath = "//li[contains(text(),'IP')]")
	public WebElement FoDropdown;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search2;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
	public WebElement SelectBaby1;
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Dischargestat;
	@FindBy(xpath = "//li[normalize-space()='Patient Requested']")
	public WebElement SelectDischargestat;
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition;
	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement SelectDisposition;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement DischargeSave;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Selectpatient2;
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Dischargestat1;
	@FindBy(xpath = "//li[normalize-space()='Patient Requested']")
	public WebElement SelectDischargestat1;
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition1;
	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement SelectDisposition1;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement DischargeSave1;
	
	
	
	
	

	
	
	
public void enterFOpatientBirthRegistrationSelectn(String Name,String AadharNumber) throws InterruptedException, IOException {
	
    Thread.sleep(1000);
	Hamburger.click();
	Thread.sleep(800);
	FOModule.click();
	Thread.sleep(500);
	Registration.click();
	Thread.sleep(500);
	Title.click();
	SelectMiss.click();
	EnterFirstNME.sendKeys(Name);
	EnterAge.sendKeys("25");
	EnterMob.sendKeys("1235048789");
	EnterOrganisationLetter.sendKeys("Other");
	Thread.sleep(1000);
	SelectOrganisation.click();
	ContactInformation.click();
	EnterAddress.sendKeys("Trivandrum");
	DocumentIdentification.click();
	EnterAadhar.sendKeys(AadharNumber);
	Clickadd.click();
	HowDidYouKnow.click();
	TV.click();
	Ok.click();
	Save.click();
	Thread.sleep(500);
	OK.click();
	Thread.sleep(900);
	ADT.click();
	EnterProviderName.sendKeys("Ram");
	Thread.sleep(600);
	SelectProviderName.click();
	Priority.click();
	SelectPriority.click();
	Thread.sleep(500);
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
	BedCategory.click();
	SelectBedCategory.click();
	RoomType.click();
	SelectRoomType.click();
	Bed.click();
	SelectBed.click();
	SAve.click();
	Thread.sleep(10000);
	MenuToggle.click();
	MOdules.click();
	EMR.click();
	Thread.sleep(600);
	EMRHomeScreen.click();
	Thread.sleep(500);
	OP.click();
	Thread.sleep(600);
	SelectIP.click();
	EnterPatientName.sendKeys(Name);
	Thread.sleep(600);
	SelectPatient.click();
	Thread.sleep(500);
	UpArrow.click();
	DoctorNote.click();
	Thread.sleep(500);
	EnterChiefComplaint.sendKeys("Pregnant");
	Thread.sleep(600);
	EnterTemplate.click();
	EnterTemplate.sendKeys("A");
	Thread.sleep(1000);
	SelectTemplate.click();
	ClickOk.click();
	Thread.sleep(500);
	Pregnant.click();
	EnterObstreticScore.sendKeys("2");
	MaritalStatus.click();
	EnterNoYears.sendKeys("3");
	Conseption.click();
	CPOEPharmacy.click();
	Thread.sleep(500);
	SelectMedicine.click();
	Thread.sleep(500);
	Ongoing.click();
	SelectOngoing.click();
	OwnMedication.click();
	SelectOwnMedication.click();
	Cladd.click();
	Thread.sleep(500);
	Medicine2.click();
	Thread.sleep(500);
	Past.click();
	SelectPast.click();
	OwnMedication.click();
	SelectOnMedication.click();
	Thread.sleep(500);
	Cladd2.click();
	Thread.sleep(1000);
	arrw.click();
	Thread.sleep(600);
	sAVe.click();
	Thread.sleep(10000);
	arw.click();
	Thread.sleep(600);
	doctrnote.click();
	Thread.sleep(1000);
	Selectcreate.click();
	Thread.sleep(900);
	Enteremplate.click();
	Selectemplate.click();
	Clickk.click();
	Thread.sleep(1000);
	SelectBirthNote.click();
	EnterGestationalAgeInWeeks.sendKeys("32");
	Gender.click();
	SelectGender.click();
	EnterWeight.sendKeys("3");
	Presentation.click();
	SelectPresentation.click();
	TypeOfDelivery.click();
	SelectNormal.click();
	APGARScore.click();
	RespiratoryEffort.click();
	SelectRespiratoryEffort.click();
	CLickOk.click();
	NeonatalStatus.click();
	SelectNeonatal.click();
	ADD.click();
	Uparw.click();
	Thread.sleep(500);
	SelectSave.click();
	Thread.sleep(1000);
	mentogle.click();
	modles.click();
	Thread.sleep(5000);
	fomod.click();
	registran.click();
	Thread.sleep(500);
	SelectBirthRegisration.click();
	BirthRegitration.click();
	Thread.sleep(800);
	EnterName.sendKeys(Name);
	Thread.sleep(600);
	Selectpatient.click();
	Thread.sleep(500);
	Selectselect.click();
	Thread.sleep(500);
	//Mobnum.sendKeys("2563258962");
	clickSave.click();
	Thread.sleep(500);
	ClIckOK.click();
	EnterProvidername.sendKeys("Ram");
	Thread.sleep(500);
	SelectProvidername.click();
	prioty.click();
	SelectPrirty.click();
	Thread.sleep(500);
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
	Roomcatgry.click();
	Selectcategry.click();
    Thread.sleep(500);
	BEd.click();
	Thread.sleep(800);
	SelectBEd.click();
	Thread.sleep(1000);
	BEDno.click();
	Thread.sleep(5000);
	SelectBEDno.click();
	Thread.sleep(1000);
	SAVE.click();
	Thread.sleep(10000);
	
	
	Menu.click();
	Thread.sleep(5000);
	MODules.click();
	Thread.sleep(1000);
	EMR1.click();
	Thread.sleep(1000);
	EMRHomeScreen1.click();
	Thread.sleep(1000);
	Dropdown.click();
	Thread.sleep(5000);
	IP.click();
	Thread.sleep(1000);
	NextDropdown.click();
	Thread.sleep(1000);
	MyDeptIP.click();
	Thread.sleep(1000);
	EnterPatientName1.sendKeys(Name);
	Thread.sleep(1000);
	SelectBaby.click();
	Thread.sleep(1000);
	UpArrow1.click();
	Thread.sleep(1000);
	Lock.click();
	Thread.sleep(1000);
	DoctorNote1.click();
	Thread.sleep(500);
	EnterChiefComplaint1.sendKeys("New Born Yellow");
	Thread.sleep(600);
	EnterTemplate1.click();
	Thread.sleep(1000);
	SelectTemplate1.click();
	Thread.sleep(1000);
	ClickOk1.click();
	Thread.sleep(500);
	
	ChildDevelopmentChart.click();
	Thread.sleep(5000);
    SocialSmile.click();
    Thread.sleep(1000);
	ClickOk2.click();
	Thread.sleep(1000);
	EyesFollow.click();
	Thread.sleep(1000);
    ClickOk3.click();
	Thread.sleep(1000);
	/*TransferObj.click();
	Thread.sleep(1000);
    ClickOk4.click();
	Thread.sleep(1000);*/
	

	ChildLangEval.click();
	Thread.sleep(1000);
    RespondsToBell.click();
	Thread.sleep(1000);
	ClickOk5.click();
	Thread.sleep(1000);
	RespondsToSmile.click();
	Thread.sleep(1000);
    ClickOk6.click();
	Thread.sleep(1000);
	ListensWhenSpoken.click();
	Thread.sleep(1000);
    ClickOk7.click();
	Thread.sleep(1000);
	SelectSave1.click();
	Thread.sleep(8000);
	
	mentogle1.click();
	modles1.click();
	Thread.sleep(5000);
	fomod1.click();
	registran1.click();
	Thread.sleep(500);
	FoMenu1.click();
	Thread.sleep(1000);
	FoDropdown.click();
	Thread.sleep(1000);
	Search2.sendKeys(Name);
	Thread.sleep(1000);
	SelectBaby1.click();
	Thread.sleep(1000);
	Dischargestat.click();
	Thread.sleep(1000);
	SelectDischargestat.click();
	Thread.sleep(1000);
	Disposition.click();
	Thread.sleep(1000);
	SelectDisposition.click();
	Thread.sleep(1000);
	DischargeSave.click();
	Thread.sleep(1000);
	Selectpatient2.click();
	Thread.sleep(500);
	Dischargestat1.click();
	Thread.sleep(1000);
	SelectDischargestat1.click();
	Thread.sleep(1000);
	Disposition1.click();
	Thread.sleep(1000);
	SelectDisposition1.click();
	Thread.sleep(1000);
	DischargeSave1.click();
	Thread.sleep(1000);
	
	
}
}