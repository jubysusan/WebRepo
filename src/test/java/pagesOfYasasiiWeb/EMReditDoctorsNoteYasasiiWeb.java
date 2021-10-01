package pagesOfYasasiiWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMReditDoctorsNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMReditDoctorsNoteYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosisplan;
	
	@FindBy(xpath = "//span[contains(text(),'IP Recommendation')]")
	public WebElement iprecommendation;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement patientforadmissioncheckbox;
	
	@FindBy(xpath = "//input[@id='categoryid']")
	public WebElement priority;
	
	@FindBy(xpath = "//input[@id='admntypeid']")
	public WebElement admtype;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/div[6]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement remarks;
	
	@FindBy(xpath = "//div[@id='emrdashboard_preview']")
	public WebElement emreditpreview;
	
	@FindBy(xpath = "//div[@id='emrdashboard_save']")
	public WebElement emrsave;
	
	@FindBy(xpath = "//input[@id='bedid']")
	public WebElement emrroomtype;
	
	@FindBy(xpath = "//li[contains(text(),'Normal Room')]")
	public WebElement emrroomtypeselect;
	
	
	
	
public void EMReditIPRecommendation() throws InterruptedException {
	//docemrnote.click();
	Thread.sleep(3000);
	diagnosisplan.click();
	Thread.sleep(1000);
	iprecommendation.click();
	Thread.sleep(3000);
	patientforadmissioncheckbox.click();
	priority.click();
	driver.findElement(By.xpath("//li[contains(text(),'Elective')]")).click();
	Thread.sleep(1000);
	admtype.click();
	driver.findElement(By.xpath("//li[contains(text(),'Day Case Admission')]")).click();
	Thread.sleep(500);
	emrroomtype.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//li[contains(text(),'Normal Room')]")).click();
	Thread.sleep(500);
	remarks.sendKeys("admit the patient");
	Thread.sleep(1000);
	emreditpreview.click();
	Thread.sleep(1000);
	emrsave.click();
	Thread.sleep(3000);
	
}
}
