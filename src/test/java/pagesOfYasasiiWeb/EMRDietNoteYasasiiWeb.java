package pagesOfYasasiiWeb;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class EMRDietNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRDietNoteYasasiiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement EMRmenu;	
	@FindBy(xpath="//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[3]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement homescreen;		
	
@FindBy(xpath="//input[@id='maincategory']")
public WebElement Selectip;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[2]/div[1]/div[1]/span[3]/i[1]")
public WebElement docselect;
@FindBy(xpath="//input[@id='authgenuserid']")
public WebElement useriddoc;
@FindBy(xpath="//input[@id='searchtext']")
public WebElement searchtext;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
public WebElement patientselect;	
@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")
public WebElement patienthomepageicon;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")	
public WebElement patientlock;	
@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
public WebElement docnote;	
@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
 public WebElement createnote;
@FindBy(xpath = "//input[@id='chiefcomplainttext']")
public WebElement encreate;
@FindBy(xpath = "//input[@id='emrtemplateid']")
public WebElement template;	
@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
public WebElement clickOK ;	
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement calories;
@FindBy(xpath="//input[@id='dynamic_textHTF1000211']")
public WebElement calper;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[4]/div[4]/label[2]/span[2]")	
public WebElement optimal;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement vegetabletaken;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[1]/span[2]")	
public WebElement adequate;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[4]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")	
public WebElement vitamins;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[1]/span[2]")
public WebElement vityes;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[5]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")	
public WebElement intake;
@FindBy(xpath="//input[@id='dynamic_textHTF1000227']")
public WebElement intakeel;
@FindBy(xpath="//input[@id='dynamic_textHTF1000230']")
public WebElement weight;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement presence;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[1]/span[2]")
public WebElement yes;
@FindBy(xpath="//input[@id='dynamic_textHTF1000234']")
public WebElement overweight;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement malnutrition;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[2]/span[2]")
public WebElement No;
@FindBy(xpath="//input[@id='dynamic_textHTF1000249']")
public WebElement heightper;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[8]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement vitamindef;
@FindBy(xpath="//input[@id='dynamic_textHTF1000252']")
public WebElement vit;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[9]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement irondef;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]")
public WebElement Diet;
@FindBy(xpath="//textarea[@id='dynamic_textarea_HTF1000257']")
public WebElement dignosis;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/label[1]/span[2]")
public WebElement feeding;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/label[2]/span[2]")
public WebElement appetite;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[5]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/label[1]")
public WebElement intakeproblem;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/label[4]/span[2]")
public WebElement lacto;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[1]/span[2]")
public WebElement carbo;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[2]/span[2]")
public WebElement Protein;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[1]/span[2]")
public WebElement Fat;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[1]/span[2]")
public WebElement Fibre;
@FindBy(xpath="//textarea[@id='dynamic_textarea_HTF1000282']")
public WebElement Energy;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]")
public WebElement History;
//@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/i[1]")
//public WebElement plusss;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
public WebElement FamilyHistory;
@FindBy(xpath="//input[@id='diagnosis']")
public WebElement problems;
@FindBy(xpath="//input[@id='relationid']")
public WebElement relation;
@FindBy(xpath="//input[@id='onset']")
public WebElement onset;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/form[1]/div[4]/div[1]/button[1]")
public WebElement Add;
@FindBy(xpath="//div[contains(text(),'Vital Signs')]")
public WebElement Vitalsigns;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-vitalsigns[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/label[1]/i[1]")
public WebElement pointdot;
@FindBy(xpath="//input[@id='vital000']")
public WebElement Hei ;
@FindBy(xpath="//input[@id='vital010']")
public WebElement wei;	
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]")
public WebElement Allergy;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
public WebElement addnewallergy;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
public WebElement plussign;
@FindBy(xpath="//input[@id='drugclassname']")
public WebElement drugname;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/button[1]")
public WebElement Adddrug;
@FindBy(xpath="	//button[contains(text(),'Add New Allergy')]")
public WebElement otherplussign;
@FindBy(xpath="//input[@id='otherallergyname']")
public WebElement otheralergyname;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/button[1]")
public WebElement Addother ;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]")
public WebElement DiagnosisPlan ;
@FindBy(xpath="//input[@id='fav']")
public WebElement search ;
@FindBy(xpath="//label[contains(text(),'CPOE Service')]")
public WebElement CPOEService ;
@FindBy(xpath="//input[@id='cpoeSearchText']")
public WebElement CPOESearch1;
 
@FindBy(xpath="  //label[contains(text(),'CPOE Pharmacy')]  ")
public WebElement CPOEPharmacy ;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
public WebElement pharmacysearch;
@FindBy(xpath = "//button[@id='updatePharmacy']")
public WebElement ADDMedicine6;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
public WebElement save;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
public WebElement docnote1;
@FindBy(xpath="//button[contains(text(),'Edit Existing Note')]")
public WebElement edit;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
public WebElement save1;

public void Diet() throws InterruptedException {
	Thread.sleep(1000);
	EMRmenu.click();
	Thread.sleep(1000);
	homescreen.click();
	Thread.sleep(1000);
	Selectip.click();
	Thread.sleep(1000);
	Thread.sleep(1000);
 	driver.findElement(By.xpath("//li[contains(text(),'IP')]")).click();
	Thread.sleep(1000);
	docselect.click();
	Thread.sleep(1000);
	useriddoc.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[contains(text(),'Ram Kumar(doc01)')]")).click();
	 searchtext.click();
	 searchtext.sendKeys("Vishaga M");
	 searchtext.sendKeys(Keys.ENTER);
	 Thread.sleep(1000);
    patientselect.click();
	Thread.sleep(1000);
	patienthomepageicon.click();
	Thread.sleep(1000);
	patientlock.click();
	Thread.sleep(1000);
	docnote.click();
	Thread.sleep(1000);
//	createnote.click();
	Thread.sleep(1000);
	encreate.clear();
    encreate.click();
	Thread.sleep(1000);
	 encreate.sendKeys("Weight Loss");
	 encreate.sendKeys(Keys.ENTER);
//	 driver.findElement(By.xpath("//typeahead-container/button[@id='ngb-typeahead-1-1']/span[1]/strong[1]")).click();
	Thread.sleep(3000);
	template.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[contains(text(),'Dietitian Template')]")).click();
	Thread.sleep(1000);
	clickOK.click();
	Thread.sleep(1000);
	calories.click();
	Thread.sleep(1000);
	calper.click();
	Thread.sleep(1000);
	calper.sendKeys("50%");
	optimal.click();
	Thread.sleep(1000);
	vegetabletaken.click();
	Thread.sleep(1000);
	adequate.click();
	Thread.sleep(1000);
	vitamins.click();
	Thread.sleep(1000);
	vityes.click();
	Thread.sleep(1000);
	intake.click();
	Thread.sleep(1000);
	intakeel.click();
	intakeel.sendKeys("Nuts");
	Thread.sleep(1000);
	weight.click();
	weight.sendKeys("25");
	Thread.sleep(1000);
	presence.click();
	Thread.sleep(1000);
	yes.click();
	overweight.click();
	overweight.sendKeys("10%");
	Thread.sleep(1000);
	malnutrition.click();
	Thread.sleep(1000);
	No.click();
	 heightper.click();
	 heightper.sendKeys("60%");
     heightper.sendKeys(Keys.ENTER);
     vitamindef.click();
     Thread.sleep(1000);
     vit.click();
     vit.sendKeys("yes");
     Thread.sleep(1000);
     irondef.click();
     Thread.sleep(1000);
     Diet.click();
     Thread.sleep(1000);
     dignosis.click();
     dignosis.sendKeys("Liver Fatty");
     Thread.sleep(1000);
     feeding.click();
     Thread.sleep(1000);
     appetite.click();
     Thread.sleep(1000);
     intakeproblem.click();
     Thread.sleep(1000);
     lacto.click();
     Thread.sleep(1000);
     carbo.click();
     Thread.sleep(1000);
     Protein.click();
     Thread.sleep(1000);
     Fat.click();
     Thread.sleep(1000);
     Fibre.click();
     Thread.sleep(1000);
     Energy.click();
     Thread.sleep(1000);
     Energy.sendKeys("High");
     Energy.sendKeys(Keys.ENTER);
     History.click();
     Thread.sleep(1000);
     
     FamilyHistory.click();
 //    plusss.click();
    Thread.sleep(1000);
    
    
     problems.click();
     Thread.sleep(1000);
     problems.sendKeys(" Alcoholic");
     problems.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]")).click();
     Thread.sleep(1000);
     relation.click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//li[contains(text(),'Others')]")).click();
     Thread.sleep(1000);
     onset.click();
     Thread.sleep(1000);
     Add.click();
     Thread.sleep(1000);
     Vitalsigns.click();
     Thread.sleep(1000);
     pointdot.click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//span[contains(text(),'Default View')]")).click();
     Thread.sleep(1000);
     Hei.click();
     Hei.clear();
     Thread.sleep(1000);
     Hei.sendKeys("165");
     wei.click();
     wei.clear();
     wei.sendKeys("60");
     Thread.sleep(1000);
     Allergy.click();
     Thread.sleep(1000);
 //    plussign.click();
     Thread.sleep(1000);
     addnewallergy.click();
     Thread.sleep(1000);
     
     drugname.click();
     drugname.sendKeys("Parathyroid ");
     drugname.sendKeys(Keys.ENTER);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[contains(text(),'Parathyroid Hormone And Analogs')]")).click();
     Thread.sleep(1000);
     Adddrug.click();
     Thread.sleep(1000);
     otherplussign.click();
     Thread.sleep(1000);
     otheralergyname.click();
     Thread.sleep(1000);
     otheralergyname.sendKeys("Chicken");
     otheralergyname.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("//div[contains(text(),'Chicken')]")).click();
     Thread.sleep(1000);
     Addother.click();
     DiagnosisPlan.click();
     Thread.sleep(1000);
  //  search.click();
  //  Thread.sleep(1000);
 //   search.sendKeys("Diet");
 //   Thread.sleep(1000);
 //   search.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("//div[contains(text(),'A01.04 Typhoid arthritis')]")).click();
     Thread.sleep(1000);
      CPOEService.click();
     Thread.sleep(1000);
     CPOESearch1.click();
     CPOESearch1.sendKeys("Low fat diet");
     CPOESearch1.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("//label[contains(text(),'Low fat diet')]")).click();
     Thread.sleep(1000);
     CPOEPharmacy.click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")).click();
     driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")).click();
     driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[5]/label[1]/span[1]/i[1]")).click();
   driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[3]/label[2]/span[1]/i[1]")).click();
    Thread.sleep(1000);
   driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")).click();
     pharmacysearch.click();
     Thread.sleep(1000);
     pharmacysearch.sendKeys("Diabeta");
     pharmacysearch.sendKeys(Keys.ENTER);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[contains(text(),'by Oral')]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[6]/div[2]/div[2]/label[1]/span[1]")).click();
     Thread.sleep(1000);
     ADDMedicine6.click();
     Thread.sleep(1000);
     save.click();
     Thread.sleep(10000);
     docnote1.click();
     Thread.sleep(1000);
     edit.click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//span[contains(text(),'Vegetable taken')]")).click();
     Thread.sleep(1000);              
     driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[2]/span[2]")).click();
     Thread.sleep(1000); 
     save1.click();
     Thread.sleep(10000);
}


}
