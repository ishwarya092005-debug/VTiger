package ObjectRepo;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	/**
	 * This is a contact webpage POM class
	 * @author ishu
	 * @version 26-09-15
	 */
	public class ContactsPage {
	//1. Declaring the WebElements
		
		@FindBy(xpath="//img[@alt='Create Contact...']")
		private WebElement createNewContactIcon;
	
		//2.Initializing the WebElements	
		public ContactsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	//Getter Methods
		public WebElement getCreateNewContactIcon() {
			return createNewContactIcon;
		}
		
	//3.Utilizing the WebElements
		/**
		 * This is a business library to click on create new contact icon
		 */
		public void clickOnCreateNewContactIcon() {
			getCreateNewContactIcon().click();
		}
	}


