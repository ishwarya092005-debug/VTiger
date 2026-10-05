package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class pomPractice {
	@FindBy(name="user_name")
	WebElement usernameTF;
	public pomPractice(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility su=new SeleniumUtility();
		PropertiesUtility pu=new PropertiesUtility();
//		WebDriver driver=new ChromeDriver();
//		su.maximizeWindow(driver);
//		su.impliciteWait(driver, 15);
//		String URL=pu.getDataFromProperties("url");
//		su.accessApplication(driver,URL);
//		String UN=pu.getDataFromProperties("username");
//		String PWD=pu.getDataFromProperties("password");
//		
		
		
		
//		driver.manage().window().maximize();
//		driver.get("http://localhost:8888/");
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		
		
		
	}

}
