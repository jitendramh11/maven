package com.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testamazono {
@Test
public void Testamazono()
{
	System.setProperty("webdriver.gecko.driver", "../amazon/exe/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
amazono rv = new amazono(driver);
rv.amaction();


	}
}
