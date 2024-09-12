package TestngC43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//1). login --- @BeforeClass
//2). Search --- @Test
//3). Advance Search --- @Test
//4). logout --- @Afterclass





public class AnnotationClass {
	

	
	@BeforeClass
	void Login()
	
	{		
		System.out.println("This Is Login.....");
	}
	
	@Test(priority=1)
    void Search()
	
	{	
		System.out.println("This Is Search.....");
	}
	
    @Test(priority=2)
    void AdvanceSearch()

{	
	System.out.println("This Is AdvanceSearch.....");
}

       
     @AfterClass
     void logout()

{	
	System.out.println("This Is logout.....");
}

 
	

}
