package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.EMRAppointmentPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRDoctorsNote;
import pagesOfYasasiiWeb.EMRDoctorsNoteSOAPYasasiiWeb;
import pagesOfYasasiiWeb.EMRHSLogYasasiiWeb;
import pagesOfYasasiiWeb.EMRHomePageYasasiiWeb;
import pagesOfYasasiiWeb.EMReditDoctorsNoteYasasiiWeb;
import pagesOfYasasiiWeb.FOFullPatientRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRHomePageYW extends TestBaseYasasiiWeb {

	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

	@BeforeClass
	public void navigateEMRPage() throws InterruptedException {

		this.login = new LoginPageYasasiiWeb(driver);
		this.hm = login.enterloginDetails("doc01", "doc01", "KIMSHEALTH TVM");
		Thread.sleep(8000);

	}

	@Test
	public void EMRscreen() throws InterruptedException, IOException {
		EMRHomePageYasasiiWeb emrpatientscreen = new EMRHomePageYasasiiWeb(driver);
		
		EMRDoctorsNote emrdoctorsnote =emrpatientscreen.enterEMRHomePage();
		//emrdoctorsnote.EMRdocnoteReconcillation();
		emrdoctorsnote.EMRdocnote();
		EMRDoctorsNoteSOAPYasasiiWeb docsoap = new EMRDoctorsNoteSOAPYasasiiWeb(driver);
		docsoap.medicalhistory();
		docsoap.vitals();
		docsoap.allergy();
		docsoap.clinicalwarning();
		docsoap.diagnosisandplan();
		docsoap.referral();
		docsoap.cpoeservice();
		docsoap.cpoepharmacy();
		EMRHSLogYasasiiWeb emrhmlog = new EMRHSLogYasasiiWeb(driver);
		EMReditDoctorsNoteYasasiiWeb emredit = emrhmlog.EMRHomeLogpage();
		emredit.EMReditIPRecommendation();
//		EMRADTYasasiiWeb Schedule = new EMRADTYasasiiWeb(driver);
//		Schedule.AdtSelectionn();
	}
	

	
	  @AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
		  }
	  
	 

//	@DataProvider
//	public Object[][] getData() throws Exception {
//
//		Object[][] data = readExcel("EMRPatientFlow");
//		return data;
//	}

}
