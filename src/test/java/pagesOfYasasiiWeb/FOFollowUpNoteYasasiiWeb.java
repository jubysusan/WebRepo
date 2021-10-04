package pagesOfYasasiiWeb;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FOFollowUpNoteYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public FOFollowUpNoteYasasiiWeb(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath="//li/a/label/div/div")
public WebElement EMRmenu;
@FindBy(xpath="//label/i[@class='ki ki-reception-fill']")
public WebElement FO;
@FindBy(xpath="//input[@id='searchtext']")
public WebElement search;
@FindBy(xpath="//span[contains(text(),'G00000104621')]")
public WebElement patientselect;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/app-billing-details[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
public WebElement service;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/app-billing-details[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/label[1]/i[1]")
public WebElement add;
@FindBy(xpath="//button[@id='billingsave']")
public WebElement save;
@FindBy(xpath="//button[contains(text(),'OK')]")
public WebElement OK;
	
	
public Object FOfollowup() throws InterruptedException, IOException {

	Thread.sleep(1000);
	EMRmenu.click();
	Thread.sleep(1000);
	FO.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(),'Registration')]")).click();
	Thread.sleep(1000);
	search.click();
	Thread.sleep(1000);
	search.sendKeys("Subha");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	patientselect.click();
	Thread.sleep(1000);
	service.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[contains(text(),'Followup Consultation')]")).click();
	Thread.sleep(1000);
	add.click();
	Thread.sleep(1000);
	save.click();
	Thread.sleep(8000);
	OK.click();
	Thread.sleep(1000);
	
	return EMRFollowupNoteYasasiiWeb(driver);
	
	
	
}

private Object EMRFollowupNoteYasasiiWeb(WebDriver driver) {
	// TODO Auto-generated method stub
	return null;
}
}

