package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class HomePageYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public HomePageYasasiiWeb(WebDriver driver) {
	
		super(driver);
	}
	 
		@FindBy(css = "ul[class='navbar-nav float-right'] a[class='nav-link dropdown-toggle pro-pic']")
		
		WebElement usermenu;
		
		@FindBy(xpath= "//header/nav[1]/div[2]/ul[2]/li[5]/div[1]/div[1]/a[6]")
		
		WebElement logOut;
		
		@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/ki-dialog-common[1]/div[2]/div[1]/div[3]/button[1]")
		WebElement Okbutton;
		 
		public LoginPageYasasiiWeb clickLogout() throws InterruptedException
		{
			
			Thread.sleep(5000);
			usermenu.click();
			Thread.sleep(3000);
			logOut.click();
			Thread.sleep(2000);
			Okbutton.click();
			
			return new LoginPageYasasiiWeb(driver);
			
		}
}
