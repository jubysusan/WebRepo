package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FOERPatientEncounterYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public FOERPatientEncounterYasasiiWeb(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath= "//input[@id='inchargeproviderdisplayname']")
	WebElement erencprovider;
	
	@FindBy(xpath= "//input[@id='inchargedeptid']")
	WebElement erdep;
	
	@FindBy(xpath= "//input[@id='specialityid']")
	WebElement ersep;
			
    @FindBy(xpath= "//button[contains(text(),'Save')]")
	WebElement erencsave;
	
  
    public ER2OPRegistration FoERencounter(String myerprovider) throws InterruptedException
	{
    	
    	Thread.sleep(5000);
		erencprovider.sendKeys(myerprovider);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//typeahead-container/button[@id='ngb-typeahead-0-0']/span[1]")).click();
		Thread.sleep(5000);
	    erencprovider.sendKeys(Keys.ENTER);
		 erencsave.click();
		 
		return new ER2OPRegistration(driver);
		
	}
    
    
    
    
    
    
    
}
