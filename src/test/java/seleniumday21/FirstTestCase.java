package seleniumday21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		 WebDriver driver;
		// TODO Auto-generated method stub
	

//	1) Launch Browser (chrome)	
//	 ChromeDriver driver=new ChromeDriver();
	 driver=new ChromeDriver();
	 
//	 2) Open Url
	 driver.get("https://mvnrepository.com/");
	 
//	 3) Validate titke should be "your Store"
	  String title=driver.getTitle();
		 
		 if(title.equals("Maven Repository: Search/Browse/Explore"))
		 {
			 System.out.println("Test Pass");
		}
		 else {
			 System.out.println("Test Failed");
		 }
	 //		 4).args Close browser
            driver.close();
//            driver.quit();
		 
	 
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
