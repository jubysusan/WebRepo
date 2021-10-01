package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.EMRJuniourSeniourDoctorVerificationYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRJuniorSeniorDoctorVerificationTestCasesYW extends TestBaseYasasiiWeb  {
public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("jur01", "KK01$#", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}
@Test()
public void NurseNote() throws InterruptedException, IOException, AWTException
{
	Thread.sleep(5000);
	
	EMRJuniourSeniourDoctorVerificationYasasiiWeb junoiur = new EMRJuniourSeniourDoctorVerificationYasasiiWeb(driver);
	junoiur.JuniourSeniorDoctorAction();
	}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}


}