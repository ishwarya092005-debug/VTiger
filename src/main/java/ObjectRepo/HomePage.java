package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	
	//Declaring the webelements
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	//2.Initializing the WebElements
    public HomePage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	
	
	//Utilizing the webelements
	/**
	 * this is a business library to click on leadsmenu
	 */
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	
	/**
	 * this is business library to click on conacts menu
	 */
	
	public void clickOnContactsMenu() {
	getContactsMenu().click();
	
	}
	
	/**
	 * this is the business library to perform logout operation
	 * @param driver
	 */
	
	public void logoutOperation(WebDriver driver) {
		new SeleniumUtility().MouseHoveringAction(driver, getAccountIcon());
		getSignoutOption().click();
	}

}
