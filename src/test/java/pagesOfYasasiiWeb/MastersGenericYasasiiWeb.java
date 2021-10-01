package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersGenericYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersGenericYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement menutoggle;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	public WebElement mastericon;     
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]")
	public WebElement generic;
	
	@FindBy(xpath = "//input[@id='genericname']")
	public WebElement entergenericname;   
	
	
	@FindBy(xpath = "//input[@id='genericcode']")
	public WebElement entergenericcode;          
	
	@FindBy(xpath = "//input[@id='drugclassadd']")
	public WebElement clickdrugclass;         
	
	@FindBy(xpath = "//li[contains(text(), 'Acetylcholinesterase Inhibitors (AChEI) ')]")
	public WebElement selectdrugclass;      
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[2]/button[1]")
	public WebElement clickadd;     
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	public WebElement selectdefault; 
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement antibiotics;
	
	@FindBy(xpath = "//*[@id='updateGenMaster']")
	public WebElement save; 
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement search;   
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement clickonsearch; 
	
	@FindBy(xpath = "//*[@formcontrolname='searchtext']")
	public WebElement clickonname;  
	
	@FindBy(xpath = "//*[@class='ki ki-pencil']")
	public WebElement clickonedit; 
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/label[1]/ki-checkbox-control[1]/label[1]")
	public WebElement insulin;  
	
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement combinationgeneric;  
	
	@FindBy(xpath = "//input[@id='combinationssearch']")
	public WebElement combinationmedicinename; 
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]")
	public WebElement addcombinationmedicinename;
	
	@FindBy(xpath = "//input[@id='edulink']")
	public WebElement educationlink;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement highrisk; 
	
	@FindBy(xpath = "//*[@class='btn btn-dark-green active ng-star-inserted']")
	public WebElement clickonupdate;   //

	
	
	
	
	 public void genericmedicinecreate(String genericname,String genericcode) throws InterruptedException{
			
			Thread.sleep(3000);
			menutoggle.click();
			Thread.sleep(3000);
			mastericon.click();
			Thread.sleep(3000);
			generic.click();
			Thread.sleep(3000);
			entergenericname.sendKeys(genericname);
			entergenericcode.sendKeys(genericcode);
			clickdrugclass.sendKeys("pen");
			driver.findElement(By.xpath("//li[contains(text(),'Penicillins')]")).click();
			Thread.sleep(2000);
			clickadd.click();
			Thread.sleep(2000);
			selectdefault.click();
			antibiotics.click();
			insulin.click();
			educationlink.sendKeys("https://www.google.com/search?q=GENERIC&oq=GENERIC&aqs=chrome..69i57j0i433l2j0j0i433j69i60l3.2545j0j7&sourceid=chrome&ie=UTF");
			driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[2]/button[1]")).click();
			Thread.sleep(2000);
			save.click();
			search.sendKeys(genericname);
			Thread.sleep(2000);
			clickonsearch.click();
			Thread.sleep(2000);
			WebElement selectgeneric=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
			WebElement editgeneric=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-genericmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]"));
			act.moveToElement(selectgeneric).build().perform();
			Thread.sleep(5000);
			act.moveToElement(editgeneric).click().build().perform();
			//Thread.sleep(8000);
//			clickonname.click();
//			clickonedit.click();
    		Thread.sleep(3000);
    		highrisk.click();
    		Thread.sleep(2000);
    		clickonupdate.click();
}
	 
	 public void genericmedicinecreate2() throws InterruptedException{
		
		 //driver.findElement(By.xpath("//button[contains(text(),'Clear')]")).click();
		 Thread.sleep(3000);
//			menutoggle.click();
//			Thread.sleep(3000);
//			mastericon.click();
//			Thread.sleep(3000);
//			generic.click();
//			Thread.sleep(3000);
			entergenericname.sendKeys("Penicillamine+Benzyl Penicillin");
			entergenericcode.sendKeys("Z12190234");
			clickdrugclass.sendKeys("Penicillins");
			driver.findElement(By.xpath("//li[contains(text(),'Penicillins')]")).click();
			Thread.sleep(2000);
			clickadd.click();
			Thread.sleep(2000);
			selectdefault.click();
			Thread.sleep(2000);
			combinationgeneric.click();
			combinationmedicinename.sendKeys("Penicillamine");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'Penicillamine')]")).click();
			addcombinationmedicinename.click();
			Thread.sleep(2000);
			combinationmedicinename.sendKeys("Benzyl Penicillin");
			driver.findElement(By.xpath("//li[contains(text(),'Benzyl Penicillin')]")).click();
			addcombinationmedicinename.click();
			Thread.sleep(2000);
			save.click();
	 
}
}


