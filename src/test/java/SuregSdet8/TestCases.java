package SuregSdet8;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCases {  
	
	WebDriver driver;

	
	  @BeforeTest
	  public void openapp() throws InterruptedException
	  
	  {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    
			    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
		  }
	  
	  
	  
	
	  @Test(priority=0)
	  public void TitleLogin() throws InterruptedException
	  {
			
     	String title = driver.getTitle();
     	System.out.println("My current title" + title);
     	
     	
        WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1"+ "]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
     	email.clear();
        email.sendKeys("Admin");
        System.out.println("email");
   
        WebElement password = driver.findElement(By.name("password")); 
        password.clear();
        password.sendKeys("admin123");

        
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
        System.out.println("login");   
        
        	
       	
     	AssertJUnit.assertEquals(title, "OrangeHRM");	
	  }
	  
	  
	  
	  @Test(priority=1)
	  public void Test()
	  
	  
	  {
		  WebElement profile = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/span[1]/img[1]"));
	        profile.click();
	        System.out.println("profile");
	        
	        WebElement Admin = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
	        Admin.click();
	        System.out.println("Admin");
	        
	       WebElement crose = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"));
	       crose.click();
	       System.out.println("crose");
	     	
	     	
	       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")).click();
	     	System.out.println("Admin MENU");
	     	
	      WebElement Username = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
	      	Username.sendKeys("Admin");
	      	
	      WebElement Sbtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]"));
	      Sbtn.click();
	      System.out.println("Result display");
	      
	      
	      WebElement reset= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]"));
	      reset.click();
	      
	      WebElement profile2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/span[1]/img[1]"));
	      profile2.click();
	      System.out.println("profile");
	     
	  }
	  
	  
	  
	
	  
	  @AfterTest
	  public void open3() throws InterruptedException
	  
	  
	  {
		  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	      System.out.println("Logout Success");
		  driver.quit();	 
	  }
	  
	  
	  

	  
	  

}

