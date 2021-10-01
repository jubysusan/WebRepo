package pagesTestCasesYasasiiWeb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRADTTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("doc01", "doc01", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test
public void EMRADT() throws InterruptedException {
		Thread.sleep(5000);
		
		EMRADTYasasiiWeb Schedule = new EMRADTYasasiiWeb(driver);
		Schedule.AdtSelectionn();
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}






}
