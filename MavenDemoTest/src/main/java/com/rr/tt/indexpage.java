package com.rr.tt;


import javax.naming.ConfigurationException;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.ar.ss.TestBase;



public class indexpage extends TestBase{
	Actions action = new Actions(driver);


	@FindBy(xpath="//*[@id=\"auto-complete-app\"]/div/div/input")
	WebElement search;
	
	@FindBy(xpath="/html/body/div[8]/div/div/a")
	WebElement close;
	
    	@FindBy(xpath="//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div/div[3]/div[1]/a/div[1]/div/img")
		WebElement urun;
		
	@FindBy(xpath="//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[5]/button[1]/div[1]")
		WebElement sepetekle;
		
	@FindBy(xpath="/html/head/title")
	WebElement titles;
		
		
		PropertiesConfiguration config ;
		
		public indexpage(){
			PageFactory.initElements(driver, this);
		}
	
		
	
		
		//Actions:
		public String validateLoginPageTitle() {
			
			System.setProperty("webdriver.gecko.driver", "D:files\\geckodriver.exe");
			
			driver.get("https://www.trendyol.com/");
		
			return driver.getTitle();
		}
		

		public void closeadvertisement() throws InterruptedException, ConfigurationException{
			
			Thread.sleep(3000);
			close.click();
		//reklamı kapatma ilk açılışta
			Thread.sleep(3000);
			
		}
		
	}
