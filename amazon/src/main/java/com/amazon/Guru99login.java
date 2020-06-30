package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99login {
@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
private WebElement id;
@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
private WebElement pwd;
@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
private WebElement loginbtn;


public Guru99login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void action()
{
	id.sendKeys("mngr261794");
	pwd.sendKeys("nAzEhUm");
	loginbtn.click();
	}
}