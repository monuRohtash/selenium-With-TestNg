package TestngC43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;


public class AllAnnotations {
	
	
	@AfterSuite
	void as() 
	{
		System.out.println("This is @AfterSuite");
	}
	
	@BeforeSuite
	void bs() 
	{
		System.out.println("This is @BeforeSuite");
	}
	
	@BeforeTest
	void bt() 
	{
		System.out.println("This is @BeforeTest");
	}
	
	@AfterTest
	void at() 
	{
		System.out.println("This is @AfterTest");
	}

	@BeforeClass
	void BC()
	
	{		
		System.out.println("This Is @BeforeClass.....");
	}
	
	 @AfterClass
     void AC()

{	
	System.out.println("This Is @AfterClass.....");
}
	 
	 
	 
	 @BeforeMethod
		void BM()
		
		{		
			System.out.println("This Is @BeforeMethod.....");
		}
		
		 @AfterMethod
	     void AM()

	{	
		System.out.println("This Is @AfterMethod .....");
	}
		 @Test(priority=1)
		    void test1()
			
			{	
				System.out.println("This Is Test1.....");
			}
			
		    @Test(priority=2)
		    void Test2()

		{	
			System.out.println("This Is TEST2.....");
		}

		  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
