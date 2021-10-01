package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRBirthRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.EMR_ERBirthAllocation;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMR_ERBirthAllocationTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("doc01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}



@Test()
public void ERBirth() throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMR_ERBirthAllocation Schedule1 = new EMR_ERBirthAllocation(driver);
		Schedule1.ERBedAllocation();
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

}