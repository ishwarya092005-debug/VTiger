package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\pp783\\OneDrive\\Desktop\\project.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		System.out.println(url);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		
		
	}

}
