package com.rr.tt;


import java.util.List;
import java.util.Random;

import javax.naming.ConfigurationException;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ar.ss.TestBase;



public class stackpage extends TestBase{
	PropertiesConfiguration config ;
	Actions action = new Actions(driver);
	
	
	
	@FindBy( xpath="//*[@id=\"auto-complete-app\"]/div/div/i")
	WebElement searchbuton;
	
	@FindBy( xpath="//*[@id=\"auto-complete-app\"]/div/div/input")
	WebElement searchcomputer;
	
	
	@FindBy( xpath="//*[@id=\"search-app\"]/div/div/div[2]")
	WebElement searchlist;
	
	@FindBy( xpath="//*[@id=\"partial-basket\"]/div/div[3]/div[2]/div[3]/div[1]/div/input")
	WebElement price;
	
	@FindBy( xpath="//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[1]/button[1]/div[1]")
	WebElement addbasket;
	
	@FindBy( xpath="//*[@id=\"myBasketListItem\"]/div[1]/a/i")
	WebElement basket;
	
	@FindBy( xpath="//*[@id=\"partial-basket\"]/div/div[3]/div[2]/div[3]/div[1]/div/button[2]")
	WebElement 	increase;
	
	
	@FindBy( xpath="//*[@id=\"partial-basket\"]/div/div[3]/div[2]/div[3]/div[1]/div/input")
	WebElement 	incraseaddcont;
	

	
	
	@FindBy( xpath="//*[@id=\"partial-basket\"]/div/div[3]/div[2]/div[3]/button")
	WebElement delete;
	
	@FindBy( xpath="//*[@id=\"ngdialog1\"]/div[2]/form/div/div[2]/div/button[2]")
	WebElement deletecntrl;
	
	@FindBy( xpath="//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/span[2]")
	WebElement productprice;
	
	@FindBy( xpath="//*[@id=\"basketAside\"]/div/div/dl/dd[4]")
	WebElement basketproductprice;

	@FindBy( xpath="//*[@id=\"basketNoProductPage\"]/div[2]/div/div[1]")
	WebElement basketempty;
	
public stackpage(){
		
	PageFactory.initElements(driver, this);
	}
		
	public void searchcomputers () throws org.apache.commons.configuration.ConfigurationException, InterruptedException {
		
		config=new PropertiesConfiguration("C:\\Users\\Nergi\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\aa\\dd\\stack.properties");
	    driver.get((String) config.getProperty("url3"));
	    searchcomputer.click();
	    Thread.sleep(2000);
	    searchcomputer.sendKeys("bilgisayar");
	    Thread.sleep(2000);
	    searchbuton.click();
	    Thread.sleep(2000);
	    
	    
	    List<WebElement> links= driver.findElements(By.xpath("//*[@id=\"search-app\"]/div/div/div[2]"));
	    int count=links.size();
	    System.out.println("Number of links are:"+count); 
	    Random r=new Random();
	    int linkNo=r.nextInt(count);
	    WebElement link=links.get(linkNo);
	    System.out.println(link.getText());
	    Thread.sleep(2000);
	    link.click();
	    //burada da üretinlen random değerinde div içerisindeki tüm elemenler arasındna rastgele seçimm yapar
	    
	    
	   
	
	}
	public void basket() throws InterruptedException, ConfigurationException, org.apache.commons.configuration.ConfigurationException{
	    
		 //ALdığım ürünün linki geliyor(url1).
			
			    Thread.sleep(3000);
			    config.setProperty("pageprice", productprice.getText());
				   config.save();
				    Thread.sleep(3000);

				   //ürünü sepete ekliyor
				   addbasket.click();
				   //sepete tıklıyor.s
				   basket.click();
				  
				   Thread.sleep(3000);
				   	   
	}
	public String basketproductprices() throws InterruptedException {
		
		return basketproductprice.getText();
	}
	
	public String priceincreasing() throws InterruptedException {
		
		Thread.sleep(3000);
		   increase.click(); //ürün fiyatı arttırma
		Thread.sleep(3000);
		
	   return incraseaddcont.getAttribute("value");
	}

public String deleteProduct() throws InterruptedException {
	//sepeti boşaltıyor.
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		deletecntrl.click();
		Thread.sleep(3000);
	  
	  return basketempty.getText();
	}
	
	}