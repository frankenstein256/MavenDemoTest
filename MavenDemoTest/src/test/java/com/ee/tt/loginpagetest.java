package com.ee.tt;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ar.ss.TestBase;
import com.rr.tt.loginpage;




public class loginpagetest extends TestBase{
	loginpage loginPage;
	
	
	public loginpagetest() {
		super();
		initialization();
		loginPage = new loginpage();
	}
	
	

	
	@Test(priority=1)
	public void loginTest() throws InterruptedException{
	//giriş kısmında butona basınca tekrar aynı sayfa dönüyor.
		Thread.sleep(2000);
	    loginPage.login("nergin.turgut256@gmail.com", "Naciye.111");
	    
		
	}

	
	
	

}
