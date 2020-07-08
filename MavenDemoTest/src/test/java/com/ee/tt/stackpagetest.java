package com.ee.tt;



import java.io.FileNotFoundException;
import java.io.IOException;

import javax.naming.ConfigurationException;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ar.ss.TestBase;
import com.rr.tt.stackpage;


public class stackpagetest extends TestBase {
	
	stackpage basketPage;
	PropertiesConfiguration config ;
	
	public stackpagetest() {
		
		super();
		initialization();
		basketPage = new stackpage();
	}
	
	@Test(priority=1)
	public void searchrandom() throws org.apache.commons.configuration.ConfigurationException, InterruptedException, ConfigurationException  {
			
			config=new PropertiesConfiguration("C:\\Users\\Nergi\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\aa\\dd\\stack.properties");
		Thread.sleep(2000);
		//aldığı ürünle sepetteki ürünü karşılaştırıyor.
				basketPage.searchcomputers();
		}
	
	@Test(priority=2)
public void basketequalpagetest() throws org.apache.commons.configuration.ConfigurationException, InterruptedException, ConfigurationException  {
		
		config=new PropertiesConfiguration("C:\\Users\\Nergi\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\aa\\dd\\stack.properties");
	Thread.sleep(2000);

			basketPage.basket();
	}
	
	
	@Test(priority=3)
	public void pricecontrol() throws InterruptedException {
		
//sepetteki ürün ile alınacak ürün fiyatı karşılatırılıyor
		Assert.assertEquals(basketPage.basketproductprices(),config.getProperty("pageprice").toString());
	 
		
	}
	
	
	@Test(priority=4)
	public void priceincreasingtest() throws InterruptedException {
		//sefettekki ürünü kontrol ediyor
		Assert.assertEquals(basketPage.priceincreasing(),"2");
	
		
	}
	@Test(priority=5)
	public void deleteProducttest() throws InterruptedException {
		//sepeti temizleme kontrolü.
		Assert.assertEquals(basketPage.deleteProduct(), "Sepetinizde ürün bulunmamaktadır.");
		
		   
		
	}
	
}

	