package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersDisplayOrderYasassiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersDisplayOrderYasassiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	public WebElement mastericon;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")
	public WebElement Service;
	
	@FindBy(xpath = "//span[contains(text(),'Display Order')]")
	public WebElement DisplayOrder;
	
	@FindBy(xpath = "//div[contains(text(),'Laboratory')]")
	public WebElement Laboratory;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-displayorder[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
	public WebElement item1;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-displayorder[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[2]/i[1]")
	public WebElement downArrow;
	
	@FindBy(xpath = "//button[@id='displayordersave']")
	public WebElement Save;
	
public void DOSelect() throws InterruptedException
{
		Thread.sleep(3000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);
		Service.click();
		Thread.sleep(500);
		DisplayOrder.click();
		Thread.sleep(500);
		Laboratory.click();
		Thread.sleep(500);
		item1.click();
		Thread.sleep(500);
		downArrow.click();
		Thread.sleep(500);
		Save.click();
}
}
