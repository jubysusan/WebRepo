package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class ERPatientYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public ERPatientYasasiiWeb(WebDriver driver) {
	
		super(driver);
		
	}
	

	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstname;
		
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement gender;
	

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ercheckbox;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement encOk;
	
	@FindBy(xpath= "//input[@id='inchargeproviderdisplayname']")
	WebElement encprovider;
			
    @FindBy(xpath= "//button[contains(text(),'Save')]")
	WebElement encsave;
	
	
	public FOERPatientEncounterYasasiiWeb enterERRegDetails(String myfirstname,String mygender, String myage ) throws InterruptedException {
		
		firstname.sendKeys(myfirstname);
		gender.click();
		driver.findElement(By.xpath("//app-list-item/li[contains(text(),\"" + mygender + "\")]")).click();
		age.sendKeys(myage);
		age.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		ercheckbox.click();
		Thread.sleep(3000);
		fosave.click();
		Thread.sleep(2000);
		encOk.click();
	    return new FOERPatientEncounterYasasiiWeb(driver);

}
	
}