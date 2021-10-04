
package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_BirthRegTwoChildYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMR_BirthRegTwoChildTestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

@BeforeClass
public void foadt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("recep01", "KAmeda123$", "KIMSHEALTH TVM");
		Thread.sleep(8000);
}



@Test(priority=1,dataProvider="getData")
public void addFOPatReg(String FirstName,String AadharNumber) throws InterruptedException, IOException {
	EMR_BirthRegTwoChildYasasiiWeb fopatReg = new EMR_BirthRegTwoChildYasasiiWeb(driver) ;
     fopatReg.Action1(FirstName,AadharNumber);
     fopatReg.Secondbabyadd(FirstName,AadharNumber);
     fopatReg.Save();
	}
	
@Test(priority=2,dataProvider="getData")
	public void Two(String FirstName,String AadharNumber) throws InterruptedException, IOException {
		Thread.sleep(5000);
		EMR_BirthRegTwoChildYasasiiWeb Step1 = new EMR_BirthRegTwoChildYasasiiWeb(driver);
		Step1.Action2(FirstName,AadharNumber);
		Step1.Secondbabyadt(FirstName,AadharNumber);
		Step1.Babyadtlogoutin();
		Step1.Firstbabychart(FirstName,AadharNumber);
		Step1.secondbabychart(FirstName,AadharNumber);
		Step1.EMR_LogOut();
		
	}
	
@Test(priority=3,dataProvider="getData")
	public void Three(String FirstName,String AadharNumber) throws InterruptedException, IOException {
		Thread.sleep(5000);
		EMR_BirthRegTwoChildYasasiiWeb Step2 = new EMR_BirthRegTwoChildYasasiiWeb(driver);
		Step2.Action3(FirstName,AadharNumber);
		Step2.SecondbabyDis(FirstName,AadharNumber);
		
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}


@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("BirthRegSenarios");
	return data;	
}




}

