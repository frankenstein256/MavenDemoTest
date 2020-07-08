package com.ee.tt;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ar.ss.TestBase;
import com.rr.tt.indexpage;




public class indexpagetests extends TestBase {

	indexpage indexpage;
	PropertiesConfiguration config ;

	
	
	public indexpagetests() {
		super();
		initialization();
		indexpage = new indexpage();
	}
	
	/*@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new homepage();	
	}*/
	@Test(priority=2)
	public void close() throws InterruptedException, ConfigurationException, javax.naming.ConfigurationException{
	
		Thread.sleep(2000);
	    indexpage.closeadvertisement();
		
	}
	
	@Test(priority=1)
	public void HomePageTitleTest() throws ConfigurationException{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.trendyol.com");
		
		
		Assert.assertEquals(driver.getTitle(),"En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da");
	}
	
	
	
	
	
	
	

}
