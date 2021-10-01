package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;


public class MastersResouceMasterYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersResouceMasterYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	public WebElement mastericon;
	
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")
	public WebElement Appoinment;
	
	@FindBy(xpath = "//span[contains(text(),'Resource Master')]")
	public WebElement ResourceMaster;
	
	@FindBy(xpath = "//input[@id='resourcecategoryid']")
	public WebElement Category;
	
	@FindBy(xpath = "//li[contains(text(),'Category A')]")
	public WebElement SelectCategory;
	
	@FindBy(xpath = "//input[@id='name1']")
	public WebElement EnterName;
	
	@FindBy(xpath = "//button[@id='resourcemastersave']")
	public WebElement Save;
	
	@FindBy(xpath = "//input[@id='resourcecategory']")
	public WebElement Search;
	
	@FindBy(xpath = "//li[contains(text(),'Category A')]")
	public WebElement SelectCategoryForSearch;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickonName;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement Edit;
	
	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement EnterDescription;
	
	@FindBy(xpath = "//button[@id='resourcemasterupdate']")
	public WebElement clickonUpdate;
	
	@FindBy(xpath = "//input[@id='blockid']")
	public WebElement floorblock;
	
	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement descrip; 
	
	@FindBy(xpath = "//input[@id='roomtypeid']")
	public WebElement roomtype;
	
	public void ResourceMasterSelect() throws InterruptedException{
		
	Thread.sleep(3000);
	Menutoggle.click();
	Thread.sleep(3000);
	mastericon.click();
	Thread.sleep(3000);
	Appoinment.click();
	ResourceMaster.click();
//	Category.sendKeys("Category B");
//	SelectCategory.click();
//	EnterName.sendKeys("Test ABC");
//	Save.click();
//	Thread.sleep(5000);
//	Search.sendKeys("Category B");
//	SelectCategoryForSearch.click();
//	Thread.sleep(500);
//	clickonName.click();
//	clickonName.click();
//	Thread.sleep(500);
//	Edit.click();
//	EnterDescription.sendKeys("Alphabets");
//	Thread.sleep(500);
//	clickonUpdate.click();
	
}
	
	public void ResourceMasterBed(String BlockName,String FloorName,String RoomName,String BedName) throws InterruptedException{
		
		Thread.sleep(500);
		
		Category.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(text(),'Block')]")).click();
		Thread.sleep(500);
		EnterName.sendKeys(BlockName);
		Thread.sleep(500);
		Save.click();
		Thread.sleep(1000);
		Category.sendKeys("F");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(text(),'Floor')]")).click();
		Thread.sleep(500);
		EnterName.sendKeys(FloorName);
		Thread.sleep(500);
		floorblock.click();
		floorblock.sendKeys("A");
		Thread.sleep(500);
		descrip.sendKeys("test floor");
		Thread.sleep(500);
		Save.click();
		
		Category.click();
		Thread.sleep(500);
		Category.sendKeys("V");
		Thread.sleep(500);
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey25']")).click();
		Thread.sleep(500);
		roomtype.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(text(),'Normal Room')]")).click();
		Thread.sleep(500);
		floorblock.click();
		Thread.sleep(500);
		floorblock.click();
		Save.click();
		
	}
		

}
