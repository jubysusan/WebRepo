package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.ER2OPRegistration;
import pagesOfYasasiiWeb.ERADTYasasiiWeb;
import pagesOfYasasiiWeb.ERPatientYasasiiWeb;
import pagesOfYasasiiWeb.FOERPatientEncounterYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class ERPatientTestCasesYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	

	@BeforeClass
	public void navigateERPage() throws InterruptedException {
		
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("recep01","KAmeda123$","KIMSHEALTH TVM");
		Thread.sleep(8000);
		
	}
	
	
	@Test(dataProvider="getData")
	public void addERReg(String firstname ,String gender,String age,String encounter) throws InterruptedException, IOException {
		ERPatientYasasiiWeb ERReg = new ERPatientYasasiiWeb(driver) ;
		FOERPatientEncounterYasasiiWeb foerencounter = ERReg.enterERRegDetails(firstname, gender, age);
		ER2OPRegistration er2op =  new ER2OPRegistration(driver) ;
		er2op.ER2OPEditYasasiiWeb();
		log.debug("ER Patient Registration ,taking encounter and making ER to Op, done successfully");
		}
		
		

	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("ERPatientFlow");
		return data;	
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}


}



