package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a creating New contact webpage POM class
 * @author ishu
 * @version 26-09-15
 */
public class CreatingNewContactPage {
	//1. Declaring the WebElements
		
			@FindBy(name="firstname")
			private WebElement firstnameTxtField;
			
			@FindBy(name="lastname")
			private WebElement lastnameTxtField;
			
			@FindBy(id="title")
			private WebElement titleTxtField;
			
			@FindBy(name="department")
			private WebElement departmentTxtField;
			
			@FindBy(name="email")
			private WebElement emailTxtField;
			
			@FindBy(name="mobile")
			private WebElement mobileTxtField;
			
			@FindBy(name="mailingcity")
			private WebElement mailingcityTxtField;
			
			@FindBy(id="mailingstate")
			private WebElement mailingstateTxtField;
			
			@FindBy(name="mailingcountry")
			private WebElement mailingcountryTxtField;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement saveButton;
			
			
	//Initializing the webelements
	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
			}
			
	//Getter Methods
			public WebElement getFirstnameTxtField() {
				return firstnameTxtField;
			}

			public WebElement getLastnameTxtField() {
				return lastnameTxtField;
			}

			public WebElement getTitleTxtField() {
				return titleTxtField;
			}
			
			public WebElement getDepartmentTxtField() {
				return departmentTxtField;
			}
			
			public WebElement getEmailTxtField() {
				return emailTxtField;
			}

			public WebElement getMobileTxtField() {
				return mobileTxtField;
			}

			public WebElement getMailingcityTxtField() {
				return mailingcityTxtField;
			}

			public WebElement getMailingstateTxtField() {
				return mailingstateTxtField;
			}

			public WebElement getMailingcountryTxtField() {
				return mailingcountryTxtField;
			}

			public WebElement getSaveButton() {
				return saveButton;
			}
			
	//3.Utilizing the WebElements
			/**
			 * This is a business library to create a new contact
			 * @param firstname
			 * @param lastname
			 * @param title
			 */
		public void createNewContact(String firstname, String lastname, String title){
			getFirstnameTxtField().sendKeys(firstname);
			getLastnameTxtField().sendKeys(lastname);
			getTitleTxtField().sendKeys(title);
			getSaveButton().click();
		}
		/**
		 * This is a business library to create a new contact
		 * @param lastname
		 * @param department
		 * @param email
		 * @param mobile
		 */
		public void createNewContact(String lastname, String department, String email, String mobile){
			getLastnameTxtField().sendKeys(lastname);
			getDepartmentTxtField().sendKeys(department);
			getEmailTxtField().sendKeys(email);
			getMobileTxtField().sendKeys(mobile);
			getSaveButton().click(); 
		}
		/**
		 * This is a business library to create a new contact
		 * @param lastname
		 * @param title
		 * @param email
		 * @param mailingcity
		 * @param mailingstate
		 * @param mailingcountry
		 */
		public void createNewContact(String lastname, String title, String email, String mailingcity, String mailingstate, String mailingcountry){
			getLastnameTxtField().sendKeys(lastname);
			getTitleTxtField().sendKeys(title);
			getEmailTxtField().sendKeys(email);
			getMailingcityTxtField().sendKeys(mailingcity);
			getMailingstateTxtField().sendKeys(mailingstate);
			getMailingcountryTxtField().sendKeys(mailingcountry);
			getSaveButton().click();	
		}
	}


