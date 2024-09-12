package TestngC42;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//1) Open Applications
//2) Test Logo Present
//3) Login
//4) Close



public class OrangeHMTest {
	
	WebDriver driver;
	
  @Test(priority=1)
  public void OpenApp()
  {
    driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.linkedin.com/in/rohtash-raghav-98209b207/");
	driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  public void LogoTest() throws InterruptedException
  {
	  Thread.sleep(3000);
	  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("logo Displayed.."+status);	  
	  
  }
  
  @Test(priority=3)
  public void Login()
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	  
  }
  @Test(priority=4)
  public void Close()
  {
	driver.quit();
	  
	  
  }

}
