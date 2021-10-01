package pagesOfYasasiiWeb;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRDoctorsNoteSOAPYasasiiWeb extends PageFactoryInitYasasiiWeb{
	public EMRDoctorsNoteSOAPYasasiiWeb(WebDriver driver) {
		super(driver);
	}

		@FindBy(xpath = "//*[@id=\"emrtemplateid\"]")
	public WebElement TemplateSOAP;
		
		
	
	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP;
	
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	
	@FindBy(xpath = "//*[@name='TextArea_Discharege']")
	public WebElement PastHistory;
	
	@FindBy(xpath = "//*[@name='TextArea_presenthistory']")
	public WebElement PresentHistory;
	
	@FindBy(xpath = "//*[@name='TextArea_socialhistory']")
	public WebElement SocialHistory;
	
	@FindBy(xpath = "//*[@name='TextArea_familyhistory']")
	public WebElement FamilyHistory;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]")
	public WebElement History;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement medicalhistory ;
	
	@FindBy(xpath = "//input[@id='diagnosis']")
	public WebElement meddiagnosis;
	
	@FindBy(xpath = "//input[@id='onset']")
	public WebElement onset;
	
	
	@FindBy(xpath = "//input[@id='onsetuomtext']")
	public WebElement onsettext;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/form[1]/div[2]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement remarks;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/form[1]/div[3]/div[1]/button[1]")
	public WebElement medicalhisadd;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement familyhistorynew;
	
	@FindBy(xpath = "//input[@id='relationid']")
	public WebElement relation;
	
	@FindBy(xpath = "//textarea[@id='genetics']")
	public WebElement genetics;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/form[1]/div[3]/div[1]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement famremarks;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/form[1]/div[4]/div[1]/button[1]")
	public WebElement familyhisadd;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/app-surgical[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement surgerynewadd;
	
	@FindBy(xpath = "//input[@id='servicename']")
	public WebElement surgeryname;
	
	@FindBy(xpath = "//input[@id='onsetid']")
	public WebElement onsetid;

	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/app-surgical[1]/div[1]/form[1]/div[3]/div[1]/button[1]")
	public WebElement surgeryadd;
	
	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div")
	public WebElement Vitalsigns;

	@FindBy(xpath = "//input[@id='vital000']")
	public WebElement Height;

	@FindBy(xpath = "//input[@id='vital010']")
	public WebElement Weight;
	
	@FindBy(xpath = "//input[@id='vital050']")
	public WebElement temperature;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-vitalsigns[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/app-vitalfields[1]/div[1]/div[1]/form[1]/span[1]/img[1]")
	public WebElement temperatureremarks;
	
	@FindBy(xpath = "//input[@id='propertyrefid']")
	public WebElement temperatureproperty;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	public WebElement temperaturepropertyok;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]")
	public WebElement Allergy;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement addnewallergy ;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/ki-radio-list[1]/label[2]")
	public WebElement genericradiobutton;

	@FindBy(xpath = "//input[@id='drugclassname']")
	public WebElement AddNewdrugclass;
	
	@FindBy(xpath = "//input[@id='severityname']")
	public WebElement drugseverity;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement reaction;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[1]/span[1]/i[1]")
	public WebElement vomiting ;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[4]/span[1]/span[1]/span[1]/i[1]")
	public WebElement diarrhia ; 
	
	@FindBy(xpath = "//textarea[@id='description']")
	public WebElement description ;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/button[1]")
	public WebElement allergyadd ;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement otherallergy ;

	@FindBy(xpath = "//input[@id='otherallergyname']")
	public WebElement otherallergyname ;

	@FindBy(xpath = "//*[@class='form-control ng-pristine ng-valid ng-star-inserted ng-touched']")
	public WebElement SEArch ;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/button[1]")
	public WebElement otherallergyADD;

	@FindBy(xpath = "//div[contains(text(),'Clinical Warning')]")
	public WebElement ClinicalWarning;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-clinicalwarning[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement SignificantMedicalProblemBD;

	@FindBy(xpath = "/html/body/modal-container/div/div/div[4]/div[2]/span[1]")
	public WebElement SignificantMedicalProblemADD;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-clinicalwarning[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement VisitSpecificProblem;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")
	public WebElement VisitSpecificProblemOk;

	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")
	public WebElement clinicalwarnOK ;
	
	@FindBy(xpath = "//div[text()='Diagnosis and Plan']")
	public WebElement DiagnosisAndPlan;

	@FindBy(xpath = "//input[@id='fav']")
	public WebElement diagnosisSearcH;

	@FindBy(xpath = "//*[@id=\"component_TMH37\"]/app-diagnosis-plan/form/div/div/div[1]/div/div[1]/div/label[2]/i")
	public WebElement SearcHButton;

	@FindBy(xpath = "//div[contains(text(),'D19 Benign neoplasm of mesothelial tissue')]")
	public WebElement diagnosisDisease;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[2]/div[1]")
	public WebElement referral;
	
	@FindBy(xpath = "//input[@id='rhtodeptname']")
	public WebElement referraldepartment;
	
	@FindBy(xpath = "//input[@id='timeframeid']")
	public WebElement timeframe;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	public WebElement reasonremarks;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-referralhandover[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	public WebElement addreferral;
	
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEService ;
	
	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CPOEsearch;
	
	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	public WebElement CPOEedit;
	
	@FindBy(xpath = "//textarea[@id='clinicalindication']")
	public WebElement CPOEclinicalindication;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-cpoe-service-orderdetails[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[3]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement CPOEservicediagnosis;
	
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	public WebElement CPOEupdate;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement CPOEPharmacysearch;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	public WebElement AddNoCurrentMedication;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	public WebElement AddReconcillation;
	
			
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	public WebElement dssclose;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[5]/label[1]/span[1]/i[1]")
	public WebElement Recon;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[3]/label[2]/span[1]/i[1]")
	public WebElement Reconcilationicon;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ReconcilationConfirmation;
	
	
	
	@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[2]/div/div/div[1]")
	public WebElement SelectMedicine;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	
	@FindBy(xpath = "//input[@id='recommeddose']")
	public WebElement recommendeddose;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[2]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement recommendeddoseselection;

	
	
	@FindBy(xpath = "//div[@id='emrdashboard_preview']")
	public WebElement emrpreview;
	
	@FindBy(xpath = "//div[@id='emrdashboard_save']")
	public WebElement emrsave;
	
	
	public void medicalhistory()throws InterruptedException{
		
		clickOK.click();
		PastHistory.sendKeys("Tuberculosis");
		PresentHistory.sendKeys("Asthma");
		SocialHistory.sendKeys("Social drinker");
		FamilyHistory.sendKeys("Diabetic family");
		History.click();
		medicalhistory.click();
		meddiagnosis.sendKeys("Sarcoidosis of");
		meddiagnosis.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]")).click();
		onset.sendKeys("2");
		onsettext.click();
		driver.findElement(By.xpath("//li[contains(text(),'Months')]")).click();
		remarks.sendKeys("patient is suffering from severe Sarcoidosis of lung disease" );
		medicalhisadd.click();
		familyhistorynew.click();
		meddiagnosis.sendKeys("Abra");
		meddiagnosis.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]")).click();
		relation.click();
		driver.findElement(By.xpath("//li[contains(text(),'Others')]")).click();
		onset.sendKeys("5");
		onsettext.click();
		driver.findElement(By.xpath("//li[contains(text(),'Years')]")).click();
		genetics.sendKeys("test genetics ");
		famremarks.sendKeys("Test remarks");
		familyhisadd.click();
		surgerynewadd.click();
		surgeryname.sendKeys("Adenoidectomy");
		onsetid.sendKeys("7");
		onsettext.click();
		driver.findElement(By.xpath("//li[contains(text(),'Months')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", surgeryadd);
	//	 js.executeScript("window.scrollBy(1588,660)");
		Thread.sleep(3000);
		surgeryadd.click();
		Thread.sleep(3000);
	}
	public void vitals()throws InterruptedException{
		
		Vitalsigns.click();
		Thread.sleep(3000);
		Height.sendKeys("166");
		Weight.sendKeys("81");
		temperature.sendKeys("99");
		temperatureremarks.click();
		temperatureproperty.click();
		driver.findElement(By.xpath("//li[contains(text(),'Oral')]")).click();
		Thread.sleep(3000);
		temperaturepropertyok.click();
	}
	
	public void allergy()throws InterruptedException{
		
		Allergy.click();
		addnewallergy.click();
		genericradiobutton.click();
		AddNewdrugclass.sendKeys("para");
		AddNewdrugclass.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='list0']")).click();
		drugseverity.click();
		driver.findElement(By.xpath("//li[contains(text(),'Medium')]")).click();
		reaction.click();
		vomiting.click();
		diarrhia.click();
		reaction.click();
		description.sendKeys("test allergy description");
		allergyadd.click();
		
		otherallergy.click();
		otherallergyname.sendKeys("wool");
		otherallergyname.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='list0']")).click();
		drugseverity.click();
		driver.findElement(By.xpath("//li[contains(text(),'Medium')]")).click();
//		reaction.click();
//		vomiting.click();
		otherallergyADD.click();
		
	}
	public void clinicalwarning()throws InterruptedException{
		ClinicalWarning.click();
		SignificantMedicalProblemBD.click();
		onset.sendKeys("3");
		onsettext.click();
		driver.findElement(By.xpath("//li[contains(text(),'Months')]")).click();
		description.sendKeys("patient remarks" );
		clinicalwarnOK.click();
		VisitSpecificProblem.click();	
		onset.sendKeys("3");
		onsettext.click();
		driver.findElement(By.xpath("//li[contains(text(),'Months')]")).click();
		description.sendKeys("patient remarks" );
		VisitSpecificProblemOk.click();
	}
	
	public void diagnosisandplan()throws InterruptedException{
		
		Thread.sleep(5000);
		DiagnosisAndPlan.click();
		diagnosisSearcH.sendKeys("meso");
		//diagnosisSearcH.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		diagnosisDisease.click();
		Thread.sleep(3000);
	}
	
	public void referral()throws InterruptedException{
		
		referral.click();
		referraldepartment.sendKeys("cardio");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-referralhandover[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(2000);
		timeframe.click();
		driver.findElement(By.xpath("//li[contains(text(),'Within 1 Week')]")).click();
		Thread.sleep(2000);
		reasonremarks.sendKeys("having high fever");
		addreferral.click();
		Thread.sleep(3000);
	}
	
	public void cpoeservice()throws InterruptedException{
		
		CPOEService.click();
		CPOEsearch.sendKeys("Complete");
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[2]/div[1]/div[1]/label[2]")).click();
		Thread.sleep(3000);
		//CPOEsearch.clear();
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[1]/div[2]/span[3]/i[1]")).click();
		CPOEsearch.sendKeys("Sodium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[1]/div[2]/span[3]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(3000);
		CPOEedit.click();
		CPOEclinicalindication.sendKeys("TEST Clinical Indication");
		CPOEservicediagnosis.click();
		Thread.sleep(3000);
		CPOEupdate.click();
	}
	
	public EMRHSLogYasasiiWeb cpoepharmacy()throws InterruptedException{
		
		CPOEPharmacy.click();
		CPOEPharmacysearch.sendKeys("calpol 500");
//    	AddNoCurrentMedication.click();
//    	AddReconcillation.click();
       	driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
    	Thread.sleep(2000);
    //	dssclose.click();
//    	Recon.click();
//		Reconcilationicon.click();
//		Thread.sleep(2000);
//		ReconcilationConfirmation.click();
		ADDMedicine.click();
		//CPOEPharmacy.clear();
//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[2]/span[4]/i[1]")).click();
//		CPOEPharmacy.sendKeys("amoxicillin");
//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
//	 	recommendeddose.click();
//		recommendeddoseselection.click();
//		ADDMedicine.click();
		
	    emrpreview.click();
	    Thread.sleep(3000);
	    emrsave.click();
	    Thread.sleep(5000);
	    return new EMRHSLogYasasiiWeb(driver);
		
	}
}