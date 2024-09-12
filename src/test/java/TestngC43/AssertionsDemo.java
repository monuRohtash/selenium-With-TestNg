package TestngC43;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionsDemo {

	@Test
	void testTitle() 
	{
		
		String exp_title="Raghav";
		String act_title="Raghav";
		
//		if(exp_title.equals(act_title))
//		{
//		   System.out.println("Test Passed");
//		   
//		}
//		else {
//			System.out.println("Test failed");
//		}
			
		Assert.assertEquals(exp_title, act_title);
		 
	}
	
	
}
