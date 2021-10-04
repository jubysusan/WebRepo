package pagesTestCasesYasasiiWeb;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.EMRCPOEAdminstrationYasasiiWeb;
import pagesOfYasasiiWeb.EMRFollowupNoteYasasiiWeb;
import pagesOfYasasiiWeb.FOEncounterYasasiiWeb;
import pagesOfYasasiiWeb.FOFollowUpNoteYasasiiWeb;
import pagesOfYasasiiWeb.FORegEditYasasiiWeb;
import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersResourceCategoryYasassiiWeb;
import org.testng.annotations.BeforeClass;


public class FOEMRFollowUpNoteTestcaseYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("doc01", "KAmeda123$", "KIMSHEALTH TVM");
	
	}
	

@Test (priority=1)

public void FOfollowup() throws InterruptedException, IOException {
	FOFollowUpNoteYasasiiWeb note = new FOFollowUpNoteYasasiiWeb(driver);
	note.FOfollowup();

}
		
@Test (priority=2)
public void EMRFollowup() throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMRFollowupNoteYasasiiWeb followup = new EMRFollowupNoteYasasiiWeb(driver);
        followup.EMRFollowup();
		}
		


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}


}







