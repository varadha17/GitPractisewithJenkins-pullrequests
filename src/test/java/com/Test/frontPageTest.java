package com.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.Pages.frontPage;

public class frontPageTest extends BaseTest{
	
	public frontPageTest() throws IOException {
		super();
	}
	
	public frontPage fp;
	
	@BeforeMethod
	public void setup() throws IOException {
		startBrowser();
		
		fp = new frontPage();
	}
	
	
//	@Test(enabled=false)
//	public void gmailLinkTest() throws InterruptedException {
//		fp.gmailtest();
//	}
	
	@Test
	public void searchboxTest() throws InterruptedException, IOException {
		fp.searchbox();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
