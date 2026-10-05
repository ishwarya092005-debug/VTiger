package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


/**
 * this is a utility class which has functionality from selenium library
 * @author ishu
 * @version 26-09-09
 */
public class SeleniumUtility {
	
	/**
	 * this is a generic method access a web application
	 * @param driver
	 * @param uRL 
	 */
	public void accessApplication(WebDriver driver, String url) {
		driver.get(url); 
	}
	/**
	 * this is a generic method to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * this is a generic method refresh the web page
	 * @param driver
	 */
	public void refreshWebpage(WebDriver driver) {
		driver.navigate().refresh();
	}
	/**
	 * this is a generic method to close the browser
	 * @param driver
	 */
	public void closeBrowser(WebDriver driver) {
		driver.quit();
		
	}
	/**
	 * this is a generic method to provide implicite wait
	 * @param driver
	 * @param maximumNumber
	 */
	public void implicitWait(WebDriver driver,int maximumTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maximumTime));
	}
	
	
	
                     	///**************HANDLING DROPDOWN************//////////////
	
	
	
	/**
	 * this is a generic method  to select an option in dropdown using value attribute
	 * @param dropdownEle
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownEle,String value) {
		Select sel =new Select (dropdownEle);
		sel.selectByValue(value);
	}
	/**
	 * this is a generic method  to select an option in dropdown using visible Text
	 * @param dropdownEle
	 * @param VisibleText
	 */
	public void selectOptionByVisibleText(WebElement dropdownEle,String VisibleText) {
		Select sel =new Select (dropdownEle);
		sel.selectByVisibleText(VisibleText);
	}
	/**
	 * this is a generic method  to select an option in dropdown using index
	 * @param dropdownEle
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownEle,int index) {
		Select sel =new Select (dropdownEle);
		sel.selectByIndex(index);
	}
	
	/////***********MOUSE ACTION**************////////////
	
	
	/**
	 * this is a generic method to perform mouse  hovering action
	 * @param driver
	 * @param element
	 */
	
	public void MouseHoveringAction(WebDriver driver,WebElement element) {
		new Actions(driver).moveToElement(element).perform();
		
	}
	/**
	 *  this is a generic method to perform right click action
	 * @param driver
	 * @param element
	 */
	
	public void rightClickAction(WebDriver driver,WebElement element) {
		new Actions(driver).contextClick(element).perform();
		
	}
	/**
	 * this is a generic method to perform drag and drop action
	 * @param driver
	 * @param draggableEle
	 * @param dropEle
	 */
	public void dragAndDrop(WebDriver driver,WebElement draggableEle,WebElement dropEle) {
		new Actions(driver).dragAndDrop(draggableEle,dropEle).perform();
		
	}
	           ////***********HANDLING ALERT POPUP*************///////

	/**
	 * this is a generic method to accept alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * this is the generic method to cancel the alert popup
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	//////***********HANDLING FRAMES***********////////////
	
	
	
	/**
	 * this is the generic method to switch to a frame using frame index
	 * @param driver
	 * @param index
	 */
	public void SwitchToFrameIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * this is the generic method to switch to a frame using frame WebElement
	 * @param driver
	 * @param frameEle
	 */
	public void SwitchToFrameElemet(WebDriver driver,WebElement frameEle) {
		driver.switchTo().frame(frameEle);
	}
	
	
	///////*************TAKESCREENSHOT*********///////////////////
	
/**
 * this is a generic method to capture webpage screenshot
 * @param driver
 * @param fileName
 * @return
 * @throws IOException
 */
	public String takeWebpageScreenShot(WebDriver driver ,String fileName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sre=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\screenshot\\"+fileName+".png");
		Files.copy(sre, dest);
		return dest.getAbsolutePath();//used for listerners
		
		
	}
}

