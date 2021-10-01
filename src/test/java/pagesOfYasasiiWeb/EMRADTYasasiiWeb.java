package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRADTYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public EMRADTYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement SelectPatient;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement UpArrow;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[7]/img[1]")
	public WebElement ADT;
	
	@FindBy(xpath = "//input[@id='admittype']")
	public WebElement ER;
	
	@FindBy(xpath = "//li[contains(text(),'Day Case Admission')]")
	public WebElement DayCaseAdmission;
	
	@FindBy(xpath = "//div[contains(text(),'Recommended Date')]")
	public WebElement RecommendedDateClick;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement EnterRemarks;
	
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement RoomCategory;
	
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement RoomCategorySelection;
	
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	
	@FindBy(xpath = "//li[contains(text(),'Normal Room(8)')]")
	public WebElement SelectRoomType;
	
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[4]/li[1]")
	public WebElement SelectBed;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement Save;
	
	
	public void AdtSelectionn() throws InterruptedException{
		
		Thread.sleep(1000);
		SelectPatient.click();
		Thread.sleep(1000);
		UpArrow.click();
		Thread.sleep(700);
		ADT.click();
		ER.click();
		DayCaseAdmission.click();
		Thread.sleep(1000);
		RecommendedDateClick.click();
		Thread.sleep(5000);
		EnterRemarks.sendKeys("Admint the Patient");
//		RoomCategory.click();
//		RoomCategorySelection.click();
//		RoomType.click();
//		Thread.sleep(1000);
//		SelectRoomType.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(1000);
		SelectBed.click();
		Thread.sleep(3000);
		Save.click();
	}

}
