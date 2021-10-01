package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVSampleDespatch;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRCPOEAdminstrationYasasiiWeb;
import pagesOfYasasiiWeb.EMROPNoteYasasiiWeb;
import pagesOfYasasiiWeb.OutsiderPatientYasasiiWeb;
import pagesOfYasasiiWeb.Outsiderappointment;

public class EMROPNoteTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("doc01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	
	@Test
	public void OPEMR() throws InterruptedException, IOException {
		EMROPNoteYasasiiWeb OP = new EMROPNoteYasasiiWeb(driver) ;
		OP.OP_EMRReg();
	}
		
	@Test
	   public void cpoeadmin() throws InterruptedException {
			Thread.sleep(5000);
			
			EMRCPOEAdminstrationYasasiiWeb admin = new EMRCPOEAdminstrationYasasiiWeb(driver);
	        admin.EMRCPOE();
			}
			
		
		
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}
}