package testRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass {
	@Test(groups= {"Smoke", "Sanity"})
    public void LE_003() throws EncryptedDocumentException, IOException {
        HomePage hp = new HomePage(driver);
        hp.clickOnContactsMenu();
        ContactsPage cp = new ContactsPage(driver);
        cp.clickOnCreateNewContactIcon();
        String firstName = eu.getDataFromExcel("Contacts", 1, 1);
        String lastName = eu.getDataFromExcel("Contacts", 1, 2);
        String title = eu.getDataFromExcel("Contacts", 1, 3);
        CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
        cncp.createNewContact(firstName, lastName, title);

    }
	

}
