package com.amazon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testguru99login {
	@Test
public void Testguru99login ()
	{
		System.setProperty("webdriver.gecko.driver", "../egazette/exe/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		Guru99login rv=new Guru99login(driver);
		rv.action();
		String t = driver.getTitle();
		System.out.println(t);
	    String expectedTitle="Guru99 Bank Manager HomePage";
	    if(t.equals(expectedTitle)){
	        System.out.println("Test Pass");
	    }
	    else{
	    System.out.println("Test Failed");
	    }
	    }
	}