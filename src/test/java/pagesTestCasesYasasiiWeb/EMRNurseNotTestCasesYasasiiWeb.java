package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRBirthRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRNurseNoteYasasiiWeb;

public class EMRNurseNotTestCasesYasasiiWeb extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("nur01", "KK01$#", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test()
public void NurseNote() throws InterruptedException, IOException
{
	Thread.sleep(5000);
	
	EMRNurseNoteYasasiiWeb nurse = new EMRNurseNoteYasasiiWeb(driver);
	nurse.NurseNoteAction();
	}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

}
