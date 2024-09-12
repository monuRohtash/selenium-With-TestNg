package TestngC43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//1). login --- @BeforeMethod
//2). Search --- @Test
//3). logout --- @AfterMethod
//4). login
//5). Advance Search --- @Test
//6). logout ---




public class AnnotationDemo1 {
	
//	@BeforeMethod
//	void Login()
//	
//	{		
//		System.out.println("This Is Login.....");
//	}
//	
//	@Test(priority=1)
//    void Search()
//	
//	{	
//		System.out.println("This Is Search.....");
//	}
//	
//       
//     @AfterMethod
//     void logout()
//
//{	
//	System.out.println("This Is logout.....");
//}
//
//     @Test(priority=2)
//      void AdvanceSearch()
//
//{	
//	System.out.println("This Is AdvanceSearch.....");
//}

	
	@BeforeMethod
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

       
     @AfterMethod
     void logout()

{	
	System.out.println("This Is logout.....");
}

 
	

}
