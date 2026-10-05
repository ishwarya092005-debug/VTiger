package testRepo;

import java.io.IOException;

import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.leadsPage;
import genericUtility.BaseClass;
	public class TC_001 extends BaseClass{
		@Test(groups= {"Regression"})
		 public void LE_001() throws EventException, IOException {

		        HomePage hp = new HomePage(driver);
		        hp.clickOnLeadsMenu();
		        leadsPage lp = new leadsPage(driver);
		        lp.clickOnCreateNewleadIcon();
		        String firstName = eu.getDataFromExcel("Leads", 1, 1);
		        String lastName = eu.getDataFromExcel("Leads", 1, 2);
		        String company = eu.getDataFromExcel("Leads", 1, 3);
		        CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		        cnlp.createNewLead(firstName, lastName, company);
		 }

	}

	

	
	
