package testRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;
 
public class TC_006 extends BaseClass{
	 @Test(groups= {"Sanity"})
	    public void CON_003() throws EncryptedDocumentException, IOException {
	        HomePage hp = new HomePage(driver);
	        hp.clickOnContactsMenu();
	        ContactsPage cp = new ContactsPage(driver);
	        cp.clickOnCreateNewContactIcon();
	        String lastName = eu.getDataFromExcel("Contacts", 7, 1);
	        String title = eu.getDataFromExcel("Contacts", 7, 2);
	        String email = eu.getDataFromExcel("Contacts", 7, 3);
	        String mailingCity = eu.getDataFromExcel("Contacts", 7, 4);
	        String mailingState = eu.getDataFromExcel("Contacts", 7, 5);
	        String mailingCountry = eu.getDataFromExcel("Contacts", 7, 6);
	        CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
	        cncp.createNewContact(lastName, title, email,mailingCity, mailingState,mailingCountry );
	    }

}
