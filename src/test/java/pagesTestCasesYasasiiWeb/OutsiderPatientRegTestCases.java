package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.ER2OPRegistration;
import pagesOfYasasiiWeb.ERPatientYasasiiWeb;
import pagesOfYasasiiWeb.FOERPatientEncounterYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.OutsiderPatientYasasiiWeb;
import pagesOfYasasiiWeb.Outsiderappointment;

public class OutsiderPatientRegTestCases extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	

	@BeforeClass
	public void navigateERPage() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("recep01", "recep01", "KIMSHEALTH TVM");
		Thread.sleep(8000);
		
		
	}
	@Test
	public void outsideregistration() throws InterruptedException, IOException {
		OutsiderPatientYasasiiWeb OSReg = new OutsiderPatientYasasiiWeb(driver) ;
		OSReg.Outsiderentry();
		Outsiderappointment OSApp = new Outsiderappointment(driver);
		OSApp.Outsiderappointment();
		OSApp.encounterappCheckIn();
		OSReg.OutsiderRegistration();
		
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}


}
