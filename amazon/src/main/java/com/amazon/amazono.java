package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazono {
	@FindBy(id="twotabsearchtextbox")
   private WebElement searchbox;
	@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")
	private WebElement searchbtn;
	@FindBy(linkText="The Apple: History's greatest mystery. Mankind's greatest theft.")
	private WebElement book;
	@FindBy(id="ebooksImageBlock")
	private WebElement openbk;
	public amazono(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
   }
	public void amaction()
	{
		searchbox.sendKeys("apple");
		searchbtn.click();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		book.click();
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	openbk.click();
		
	}
}
