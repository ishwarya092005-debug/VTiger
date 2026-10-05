package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is a creating New lead webpage POM class
 * @author ishu
 * @version 26-09-15
 */
public class CreatingNewLeadPage {
	
	//1. Declaring the WebElements
		
		@FindBy(name="firstname")
		private WebElement firstnameTxtField;
		
		@FindBy(name="lastname")
		private WebElement lastnameTxtField;
		
		@FindBy(name="company")
		private WebElement companyTxtField;
		
		@FindBy(id="designation")
		private WebElement titleTxtField;
		
		@FindBy(name="leadsource")
		private WebElement leadsourceDropdown;
		
		@FindBy(name="noofemployees")
		private WebElement noofemployeeTxtField;
		
		@FindBy(name="mobile")
		private WebElement mobileTxtField;
		
		@FindBy(id="email")
		private WebElement emailTxtField;
		
		@FindBy(name="country")
		private WebElement countryTxtField;
		
		@FindBy(name="city")
		private WebElement cityTxtField;
		
		@FindBy(id="state")
		private WebElement stateTxtField;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveButton;
		
		
//2.Initializing the WebElements
	public CreatingNewLeadPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	//Getter Methods
		public WebElement getFirstnameTxtField() {
			return firstnameTxtField;
		}
		public WebElement getLastnameTxtField() {
			return lastnameTxtField;
		}
		public WebElement getCompanyTxtField() {
			return companyTxtField;
		}
		public WebElement getTitleTxtField() {
			return titleTxtField;
		}
		public WebElement getLeadsourceDropdown() {
			return leadsourceDropdown;
		}
		public WebElement getNoofemployeeTxtField() {
			return noofemployeeTxtField;
		}
		public WebElement getMobileTxtField() {
			return mobileTxtField;
		}
		public WebElement getEmailTxtField() {
			return emailTxtField;
		}
		public WebElement getCountryTxtField() {
			return countryTxtField;
		}
		public WebElement getCityTxtField() {
			return cityTxtField;
		}
		public WebElement getStateTxtField() {
			return stateTxtField;
		}
		public WebElement getSaveButton() {
			return saveButton;
		}
		
	//3.Utilizing the WebElements	
		/**
		 * This is a business library to create a new lead
		 * @param firstname
		 * @param lastname
		 * @param company
		 */
		public void createNewLead(String firstname, String lastname, String company) {
			getFirstnameTxtField().sendKeys(firstname);
			getLastnameTxtField().sendKeys(lastname);
			getCompanyTxtField().sendKeys(company);
			getSaveButton().click();
		}
		
		/**
		 * This is a business library to create a new lead
		 * @param lastname
		 * @param company
		 * @param title
		 * @param leadsource
		 * @param noofemployee
		 */
		public void createNewLead(String lastname, String company, String title, String leadsource, String noofemployee) {
			getLastnameTxtField().sendKeys(lastname);
			getCompanyTxtField().sendKeys(company);
			getTitleTxtField().sendKeys(title);
			new SeleniumUtility().selectOptionByValue(getLeadsourceDropdown(), leadsource);
			getNoofemployeeTxtField().sendKeys(noofemployee);
			getSaveButton().click();
		}
		
		/**
		 * This is a business library to create a new lead
		 * @param lastname
		 * @param company
		 * @param mobile
		 * @param email
		 * @param city
		 * @param state
		 * @param country
		 */
		public void createNewLead(String lastname, String company, String mobile, String email, String city, String state, String country) {
			getLastnameTxtField().sendKeys(lastname);
			getCompanyTxtField().sendKeys(company);
			getMobileTxtField().sendKeys(mobile);
			getEmailTxtField().sendKeys(email);
			getCityTxtField().sendKeys(city);
			getStateTxtField().sendKeys(state);
			getCountryTxtField().sendKeys(country);	
			getSaveButton().click();
			
		}
	}
	
	
	
	


