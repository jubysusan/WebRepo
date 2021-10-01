package pagesOfYasasiiWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;


public class MastersResourceMappingYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersResourceMappingYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement mastericon;
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")
	public WebElement Appoinment;
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]")
	public WebElement ResourceMapping;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement MainCategory;
	
	@FindBy(xpath = "//li[contains(text(),'Category A')]")
	public WebElement SelectMainCategory;
	
	@FindBy(xpath = "//input[@id='resourcemasterlist']")
	public WebElement EnterName;
	
	@FindBy(xpath = "//li[contains(text(),'abc')]")
	public WebElement SelectName;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement SubCategory;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement SelectSubCategory;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement clickonName;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/form[1]/div[1]/div[2]/div[1]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement ToDate;
	
	@FindBy(xpath = "//tbody/tr[4]/td[4]/span[1]")
	public WebElement SelectToDate;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/form[1]/div[1]/div[2]/div[1]/div[4]/ki-time-picker[1]/div[1]/input[1]")
	public WebElement ToTime;
	
	//@FindBy(xpath = "//body/div[2]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-timer[1]/owl-date-time-timer-box[1]/button[1]/span[1]/*[1]")
//	public WebElement UpArrow;
	
	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/owl-date-time-container[1]/div[2]/div[1]/button[2]/span[1]")
	public WebElement Set;
	
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	public WebElement Add;

	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement Save;
	
	
	public void ResourceMasterSelect() throws InterruptedException{
		
		Thread.sleep(3000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);
		Appoinment.click();
		ResourceMapping.click();
		MainCategory.click();
		SelectMainCategory.click();
		EnterName.sendKeys("ab");
		SelectName.click();
		SubCategory.click();
		SelectSubCategory.click();
		Thread.sleep(500);
		clickonName.click();
		ToDate.click();
		SelectToDate.click();
		ToTime.click();
		//UpArrow.click();
		Set.click();
		Add.click();
		Save.click();
		
	}
		
		
}
