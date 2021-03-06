package pagesOfYasasiiWeb;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class  EMRFollowupNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public  EMRFollowupNoteYasasiiWeb(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//li/a/label/div/div")
public WebElement menu;
@FindBy(xpath="//label/i[@class='ki ki-chevron-down']")
public WebElement EMR;
@FindBy(xpath="//span[contains(text(),'EMR HomeScreen')]")
public WebElement EMRHomescreen;
@FindBy(xpath="//input[@id='searchtext']")
public WebElement searchtext;
@FindBy(xpath="//span[contains(text(),'G00000104621')]")
public WebElement patientselect;
@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
public WebElement patienthomepageicon;
@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
public WebElement patienthomepagelock;
@FindBy(xpath = "//*[@id='emrdashboardpatient_template_1']/span[1]")
public WebElement docnote;
@FindBy(xpath="//button[contains(text(),'Create New Note')]")
public WebElement createnote;
@FindBy(xpath = "//input[@id='chiefcomplainttext']")
public WebElement encreate;
@FindBy(xpath = "//input[@id='emrtemplateid']")
public WebElement template;
@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
public WebElement clickOK ;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")
public WebElement followup;
@FindBy(xpath="//textarea[@id='dynamic_textarea_HTF1000369']")
public WebElement textarea;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
public WebElement save;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[6]/label[1]/i[1]")
public WebElement arrow;

	
	public void EMRFollowup() throws InterruptedException, IOException {
	    Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
//		EMR.click();
		Thread.sleep(1000);
		EMRHomescreen.click();
		Thread.sleep(1000);
		searchtext.click();
		Thread.sleep(1000);
		searchtext.sendKeys("Mariyammal");
		Thread.sleep(1000);
		patientselect.click();
		Thread.sleep(1000);
		patienthomepageicon.click();
		Thread.sleep(1000);
		patienthomepagelock.click();
		Thread.sleep(1000);
		 docnote.click();
		 Thread.sleep(1000);
		//createnote.click();
		 Thread.sleep(1000);
		  encreate.clear();
	       encreate.click();
		 	encreate.sendKeys("Fever");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
			Thread.sleep(3000);
			template.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
			clickOK.click();
			Thread.sleep(1000);
	//	 driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
		 Thread.sleep(1000);
		 followup.click();
		 Thread.sleep(1000);
		 textarea.click();
		 Thread.sleep(1000);
		 textarea.sendKeys("Fever \r\n symptoms of dengue \r\n Mediation");
		 textarea.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			save.click();
			Thread.sleep(10000);
			arrow.click();
			Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[contains(text(),'Log')]")).click();
		 Thread.sleep(7000);
		 
}
}
