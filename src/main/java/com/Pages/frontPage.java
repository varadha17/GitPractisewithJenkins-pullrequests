package com.Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest;
import com.utilities.excel;

public class frontPage extends BaseTest{
	
	public frontPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Gmail")
	WebElement gmail;
	
	@FindBy(name="q")
	WebElement search;
	
//	public void gmailtest() throws InterruptedException {
//		gmail.click();
//		Thread.sleep(6000);
//	}
	
	excel ex = new excel("./src/main/java/Excel/Selenium.xlsx");
	
	public secondPage searchbox() throws InterruptedException, IOException {
		for(int i=1;i<=4;i++) {
		search.sendKeys(ex.getCellData(i, 0, "SearchBox"));
		search.sendKeys(Keys.ENTER);
		driver.navigate().back();
		search.clear();
		}
		Thread.sleep(3000);
		return new secondPage();
		
//		System.out.println("Row Count: "+ex.getRowCount("SearchBox"));
//		for(int i=1; i<=5;i++) {
//			System.out.println("Cell Data: "+ex.getCellData(i,0,"value"));
//		}
//		ex.setcellData(2, 1, "Pass", "SearchBox");
		
//		ex.addSheet("AWS");
		
//		ex.removeSheet("AWS");
	}

}
