package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leadsPage {
	
		//1. Declaring the WebElements
			
				@FindBy(xpath = "//img[@alt='Create Lead...']")
				private WebElement createNewleadIcon;
				
		//2.Initializing the WebElements
				public leadsPage(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
		//Getter Methods
				public WebElement getCreateNewleadIcon() {
					return createNewleadIcon;
				}
				
		//3.Utilizing the WebElements
				/**
				 * This is a business library to click on create new lead icon
				 */	
				public void clickOnCreateNewleadIcon() {
					getCreateNewleadIcon().click();
				}	
		}


