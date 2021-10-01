package pagesTestCasesYasasiiWeb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersResourceCategoryYasassiiWeb;


public class MastersResourceCategoryTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("itadmin01", "itadmin01", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test
public void Schedulesettings() throws InterruptedException {
		Thread.sleep(5000);
		
		MastersResourceCategoryYasassiiWeb Schedule = new MastersResourceCategoryYasassiiWeb(driver);
		Schedule.ResourceMasterSelect();
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}


}
