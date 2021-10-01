package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.EMRIPDischargeYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRIPDischargeTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("doc01", "doc01", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test
public void Schedulesettings() throws InterruptedException {
		Thread.sleep(5000);
		
		EMRIPDischargeYasasiiWeb Schedule = new EMRIPDischargeYasasiiWeb(driver);
		Schedule.DischargeSelectionn();
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

}

