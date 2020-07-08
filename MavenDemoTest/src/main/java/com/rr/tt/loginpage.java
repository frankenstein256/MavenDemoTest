package com.rr.tt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ar.ss.TestBase;





public class loginpage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="/html/body/div[7]/div/div/a")
	WebElement close;
	@FindBy(xpath="//*[@id=\"accountBtn\"]/div[1]")
	WebElement giris;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"loginSubmit\"]")
	WebElement buton;
	
	
	public loginpage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:

	

	public void login(String email1, String password1) throws InterruptedException{
		
		Thread.sleep(3000);
		
		close.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		
		giris.click();
		Thread.sleep(3000);
		email.sendKeys(email1);
		Thread.sleep(3000);
		password.sendKeys(password1);
		Thread.sleep(3000);
	    buton.click();
		    	
		
	}
	
}
