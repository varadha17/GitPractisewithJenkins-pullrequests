package com.Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest;

public class frontPage extends BaseTest{
	
	public frontPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Gmail")
	WebElement gmail;
	
	@FindBy(name="q")
	WebElement search;
	
	public void gmailtest() throws InterruptedException {
		gmail.click();
		Thread.sleep(6000);
	}
	
	public secondPage searchbox() throws InterruptedException, IOException {
		Thread.sleep(6000);
		search.sendKeys("Hello");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		return new secondPage();
	}

}
