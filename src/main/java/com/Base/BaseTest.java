package com.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static Properties prop;
	public FileInputStream fis;
	protected static WebDriver driver;

	public BaseTest() throws IOException{
		prop = new Properties();
		
		fis = new FileInputStream("C:\\Users\\Abinash\\eclipse-workspace\\TestNGTest\\src\\main\\java\\com\\Properties\\config.properties");
		prop.load(fis);
	}
	
	
	public static void startBrowser() {
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		} else {
			System.out.println("No Browser");
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
	}
	
	
	
	
}
