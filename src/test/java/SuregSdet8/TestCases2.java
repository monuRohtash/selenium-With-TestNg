package SuregSdet8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases2 {

	
	
	
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
	  
	  
	  
	
	  @Test
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
	  
	
}
