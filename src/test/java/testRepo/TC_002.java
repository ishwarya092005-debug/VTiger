package testRepo;

import static org.testng.Assert.fail;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.leadsPage;
import genericUtility.BaseClass;


@Listeners(genericUtility.ListenersImplementation.class)

public class TC_002 extends BaseClass{
	@Test(groups= {"Smoke"},retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class)
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
        hp.clickOnLeadsMenu();
        leadsPage lp = new leadsPage(driver);
     // Assert.fail();
        lp.clickOnCreateNewleadIcon();
        String lastName = eu.getDataFromExcel("Leads", 4, 1);
        String company = eu.getDataFromExcel("Leads", 4, 2);
        String title = eu.getDataFromExcel("Leads", 4, 3);
        String leadSource = eu.getDataFromExcel("Leads", 4, 4);
        String noOfEmp = eu.getDataFromExcel("Leads", 4, 5);
        CreatingNewLeadPage cnlp =new CreatingNewLeadPage(driver);
        cnlp.createNewLead(lastName, company, title, leadSource, noOfEmp);
	}

}
