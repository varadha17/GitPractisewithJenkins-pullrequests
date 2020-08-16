package com.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest;

public class secondPage extends BaseTest {

	public secondPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	
	public void getLinks() {
		for(WebElement ele:links) {
			System.out.println(ele.getText());
			System.out.println("Get List of Links");
		}
	}

}
