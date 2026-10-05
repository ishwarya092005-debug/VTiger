package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is a login webpage pom class
 */

public class loginPage {
	
		//1.DECLARING THE WEBELEMENT
		@FindBy(name="user_name") 
		private WebElement usernameTextField;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement passwordTextField;
		
		@FindBy(id="submitButton")
		private WebElement loginButton;
		
		//2.INITIALIZE THE WEBELEMENT
		public loginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		//GETTER METHODS
		
		
		public WebElement getUsernameTextField() {
			return usernameTextField;
			
		}
		

		public WebElement getPasswordTextField() {
			return passwordTextField;
			
		}
		

		public WebElement getLoginButton() {
			return loginButton;
			
		}
		//3.UTILIZING THE WEBELEMENT
		/**
		 * this is a business library to perform login to application
		 * @param UN
		 * @param PWD
		 */
		
		public void loginToApplication(String UN,String PWD) {
			getUsernameTextField().sendKeys(UN);
			getPasswordTextField().sendKeys(PWD);
			getLoginButton().click();
			
		}
		
		
		
		
		
		
	}


