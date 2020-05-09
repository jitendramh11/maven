package com.egazette;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Egazette {
@FindBy(xpath="//*[@id=\"ImgMessage_OK\"]")
private WebElement attention;
//@FindBy(xpath="../html/body/form/div[4]/center/ul/li[4]/a")
@FindBy(linkText="Directory")
private WebElement directory;
@FindBy(id="ddlCategory")
private WebElement lb1;
public Egazette(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void egazActions()
{
	attention.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	directory.click();
	
	lb1.click();
	Select s= new Select(lb1);
	s.selectByVisibleText("Weekly Gazette");
			
	 }
}