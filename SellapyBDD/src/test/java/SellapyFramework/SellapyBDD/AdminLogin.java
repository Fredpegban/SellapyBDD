package SellapyFramework.SellapyBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AdminLogin {
	
	
	WebDriver driver = new SafariDriver();
	
	@Given("^User enters correct URL$")
	public void user_enters_correct_URL() throws Throwable {
	    
    driver.get("https://sellapy.com/admin/login"); 
    driver.manage().window().maximize();
    
    driver.manage().deleteAllCookies();
    
    Thread.sleep(3000);
   
		
  //  \"(.*)\" and \"(.*)\"$"
  //  ("^User enters correct email and password$")
	}
	@When("^User enters correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_correct_and(String email, String password) throws Throwable {
	    
	
		driver.findElement(By.xpath(" /html/body/div/div[2]/div[2]/form/div[1]/input")).sendKeys(email);
		
		driver.findElement(By.xpath(" /html/body/div/div[2]/div[2]/form/div[2]/input")).sendKeys(password);
		
		
		
	}

	@When("^Click sign In$")
	public void click_sign_In() throws Throwable {
	    

		driver.findElement(By.xpath(" \n"+ "		\n"+ "		/html/body/div/div[2]/div[2]/form/div[3]/div/button")).click();
		
		
		
		
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() throws Throwable {
	   
		 
	    String title = driver.getTitle();
	    System.out.println("Page Title is " + driver.getTitle());	
	    
	    //System.out.println(title);
			  Thread.sleep(1000);
			
		Assert.assertEquals("Sellapy | Log in", title);


			 
		//driver.getTitle();
	//	System.out.println("Page Title is " + driver.getTitle());
		
		  Thread.sleep(3000);
		
	
	}

	@Then("^User close the browser$")
	public void user_close_the_browser() throws Throwable {
	   
     driver.close();
		
		
	}

	@Given("^User click on product feature$")
	public void user_click_on_product_feature() throws Throwable {
	    
		 driver.get("https://sellapy.com/admin/login"); 
		    driver.manage().window().maximize();
		    
		    driver.manage().deleteAllCookies();
		    
		    Thread.sleep(3000);
				
		    driver.findElement(By.xpath(" /html/body/div/div[2]/div[2]/form/div[1]/input")).sendKeys("adegbuyifred@gmail.com");
			
			driver.findElement(By.xpath(" /html/body/div/div[2]/div[2]/form/div[2]/input")).sendKeys("developmentteam");
			
			
			 Thread.sleep(2000);
			driver.findElement(By.xpath(" \n"+ "		\n"+ "		/html/body/div/div[2]/div[2]/form/div[3]/div/button")).click();
			
			 
		    Thread.sleep(3000);
		
		    driver.findElement(By.xpath(" /html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[5]/a/p")).click();
		
		
		
		
		
	}

	@When("^User click on add product$")
	public void user_click_on_add_product() throws Throwable {
		
		 Thread.sleep(2000);
	    
		 driver.findElement(By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[5]/ul/li[1]/a/p\n"	+ "		")).click();
			
			
		
		
		
	}

	@When("^User clicks on select categories and choose a category$")
	public void user_clicks_on_select_categories_and_choose_a_category() throws Throwable {
	   
		 Thread.sleep(3000);
		Select categories = new Select(driver.findElement(By.xpath("//*[@id=\"parent_category\"]	")) );
		
           // categories.selectByVisibleText(" Apparel ");
            
            categories.selectByIndex(3);
		
		
	}

	@When("^User clicks on select subcategories and choose a subcategory$")
	public void user_clicks_on_select_subcategories_and_choose_a_subcategory() throws Throwable {
	    
		 Thread.sleep(2000);
		Select subcategories = new Select(driver.findElement(By.xpath("\n"+ "		//*[@id=\"subcategory\"]	")) );
		     
         subcategories.selectByIndex(3);
         
    	// Thread.sleep(2000);
         
         driver.close();
		
			
	}

	@Given("^User is already on add product field$")
	public void user_is_already_on_add_product_field() throws Throwable {
	   
		 driver.get("https://sellapy.com/admin/login"); 
		    driver.manage().window().maximize();
		    
		    driver.manage().deleteAllCookies();
		    
		    Thread.sleep(3000);
				
		    driver.findElement(By.xpath(" /html/body/div/div[2]/div[2]/form/div[1]/input")).sendKeys("adegbuyifred@gmail.com");
			
			driver.findElement(By.xpath(" /html/body/div/div[2]/div[2]/form/div[2]/input")).sendKeys("developmentteam");
			
			Thread.sleep(3000);

			driver.findElement(By.xpath(" \n"+ "		\n"+ "		/html/body/div/div[2]/div[2]/form/div[3]/div/button")).click();
			
			//driver.findElement(By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[5]/ul/li[1]/a/p\n"	+ "		")).click();
			
			
			
			
			
			
			

		    Thread.sleep(3000);
		    driver.findElement(By.xpath(" /html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[5]/a/p")).click();
		    
		    driver.findElement(By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[5]/ul/li[1]/a/p\n"	+ "		")).click();
			
		
		    Thread.sleep(3000);
		    
			Select categories = new Select(driver.findElement(By.xpath("//*[@id=\"parent_category\"]	")) );
			
	           // categories.selectByVisibleText(" Apparel ");
	            
	            categories.selectByIndex(3);
			
	            Thread.sleep(2000);
	    		Select subcategories = new Select(driver.findElement(By.xpath("\n"+ "		//*[@id=\"subcategory\"]	")) );
	    		     
	             subcategories.selectByIndex(3);
	    		
	    			
			
		
	}
		
    @When("^User enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String productName, String description, String specification, String size, String color) throws Throwable {
		    

    	
    	
    	 driver.findElement(By.xpath("//*[@id=\"exampleInputfnm\"]")).sendKeys(productName);

    	 driver.findElement(By.xpath(" /html/body/div/div[1]/section[2]/div/div/div/div/form/div/div[1]/div[3]/div[1]/div/textarea")).sendKeys(description);
    	 
    	 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div/form/div/div[1]/div[3]/div[2]/div/textarea")).sendKeys(specification);

    	
    	 
    	 driver.findElement(By.name("size")).sendKeys(size);

    	 driver.findElement(By.name("colors")).sendKeys(color);
    	 
    	 driver.close();

    	 
    	 
	
    	 
		
		
		
	}

	
	
	
	

}
