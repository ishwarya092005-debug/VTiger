package testRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_005 extends BaseClass {
	@Test(groups= {"Smoke"})
    public void CON_002() throws EncryptedDocumentException, IOException {
        HomePage hp = new HomePage(driver);
        hp.clickOnContactsMenu();
        ContactsPage cp = new ContactsPage(driver);
        cp.clickOnCreateNewContactIcon();
        String lastName = eu.getDataFromExcel("Contacts", 4, 1);
        String department = eu.getDataFromExcel("Contacts", 4, 2);
        String email = eu.getDataFromExcel("Contacts", 4, 3);
        String mobile = eu.getDataFromExcel("Contacts", 4, 4);
        CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
        cncp.createNewContact(lastName, department, email, mobile);
    }



@Test
public void m1() {
	System.out.println("hi vishnu");
}
}