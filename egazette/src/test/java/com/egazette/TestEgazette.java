package com.egazette;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestEgazette {
	@Test
	public void TestEgazette()
	{
		System.setProperty("webdriver.gecko.driver", "../egazette/exe/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://egazette.nic.in/");
		driver.manage().window().maximize();
		Egazette rv=new Egazette(driver);
		rv.egazActions();
		}
}


