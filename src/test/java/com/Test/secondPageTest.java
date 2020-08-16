package com.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.Pages.frontPage;
import com.Pages.secondPage;

public class secondPageTest extends BaseTest{

	public secondPageTest() throws IOException {
		super();
	}
	
	public frontPage fp;
	public secondPage sp;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		startBrowser();
		
		fp = new frontPage();
		sp = fp.searchbox();
	}
	
	@Test
	public void getLinksTest() {
		sp.getLinks();
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
