package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class EMRCPOEAdminstrationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRCPOEAdminstrationYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement patienthomepagelock1;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[3]/span[1]")
	public WebElement adminstration;

//	Calpol
		@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/span[2]/img[1]")
	    public WebElement Quickadmin;
	
	
	//Diabeta
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/span[2]/img[1]")
	public WebElement tabman;
	@FindBy(xpath="//input[@id='rejectquantity']")
	public WebElement quantity;
	@FindBy(xpath="//input[@id='rejectquantityunitid']")
	public WebElement quantityid;
	@FindBy(xpath="//input[@id='verifiedbyid']")
	public WebElement verifyid;
	@FindBy(xpath="//input[@id='verifiedPassword']")
	public WebElement password;
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[3]/div[1]/div[9]/span[1]/i[1]")
	public WebElement verify;
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[3]/div[2]/i[1]")
	public WebElement plussign;
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/ki-dialog-confirm[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement yes;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement save;
	
	//Amoxicillin
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/span[2]/img[1]")
	public WebElement tabman1;
	@FindBy(xpath="//input[@id='statusid']")
	public WebElement statusid;
	@FindBy(xpath="//input[@id='brand']")
	public WebElement brand;
		
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[3]/div[2]/i[1]")
	public WebElement plussign1;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement save1;
		
	//URIFAST
	//@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[3]/div[1]/span[2]/img[1]")
	//public WebElement tabman2;
//	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[3]/div[2]/i[1]")
//	public WebElement plussign2;
//	@FindBy(xpath="//button[contains(text(),'Save')]")
//	public WebElement save2;
//	
	
	//ServiceAdminstration
	@FindBy(xpath="//label[contains(text(),'Service Administration')]")
	public WebElement serviceadmin;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[5]/label[1]/i[1]")
	public WebElement exeicon;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement savebutton;
	
	//Instruction order
	@FindBy(xpath="//label[contains(text(),'Instruction Order')]")
	public WebElement instructionorder;
	@FindBy(xpath="//button[contains(text(),'Today')]")
	public WebElement Today;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement savebutton1;
	
		
	
	public void EMRCPOE() throws InterruptedException {
	
		patienthomepagelock1.click();
		Thread.sleep(500);
		adminstration.click();
		Thread.sleep(1000);
		
//diabeta	
		Thread.sleep(1000);
		tabman.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",quantity);
		 quantity.click();
	    Thread.sleep(1000);
	    quantity.sendKeys("0");
		quantity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		quantityid.click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[contains(text(),'Bottle')]")).click();
        Thread.sleep(1000);
        verifyid.click();
        Thread.sleep(500);
	    driver.findElement(By.xpath("//li[contains(text(),'Renu George(renu01)')]")).click();
	    Thread.sleep(1000);
	    password.click();
	    password.clear();
	    password.sendKeys("KAmeda123$");
	    Thread.sleep(500);
        verify.click();
        Thread.sleep(1000);
	    plussign.click();
	    Thread.sleep(1000);
   //     yes.click();
	  Thread.sleep(1000);
	    JavascriptExecutor js3 = (JavascriptExecutor) driver;
     	js3.executeScript("arguments[0].scrollIntoView();",save);
	    save.click();
	    Thread.sleep(5000);
	    
////Amoxalin
        tabman1.click();
       Thread.sleep(1000);
	    statusid.click();
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(text(),'Self Administered')]")).click();
	    Thread.sleep(500);
	    brand.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[contains(text(),'Mox 100Mg/1Ml Drops 10Ml')]")).click();
	   	JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].scrollIntoView();", plussign1);
	    plussign1.click();
	    Thread.sleep(1000);
	    save1.click();
	    Thread.sleep(1000);
////Urifast	   
////	    tabman2.click();
////	    Thread.sleep(1000);
////	    plussign2.click();
////	    Thread.sleep(1000);
////	    save2.click();
////	    Thread.sleep(1000);
////	    
//////Service
	    serviceadmin.click();
	    Thread.sleep(1000);
        exeicon.click();
	    Thread.sleep(1000);
        savebutton.click();
	    Thread.sleep(2000);
	    
//Instructionorder
	    Thread.sleep(1000);
	    instructionorder.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//tbody/tr[1]/td[17]")).click();
	  //  driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-service-detail-modal[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ki-calender-time-military[1]/div[1]/input[1]")).click();
	    Thread.sleep(1000);
	  //  driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-timer[1]/owl-date-time-timer-box[1]/button[1]/span[1]/*[1]")).click();
	    // driver.findElement(By.xpath("//*[@id='owl-dt-picker-6']/div[2]/div/button[1]/span")).click();
	 //   Today.click();
	    Thread.sleep(1000);
	    savebutton1.click();
	    Thread.sleep(1000);
	    
	    
	    
}
}