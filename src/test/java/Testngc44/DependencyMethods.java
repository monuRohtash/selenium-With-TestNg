package Testngc44;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	
	@Test(priority=1)
	void openapp() {
			
		AssertJUnit.assertTrue(true);
	}

	
	@Test(priority=2, dependsOnMethods= {"openapp"}) 	
	void Login() {
		
		AssertJUnit.assertTrue(true);
			
		
	}
	@Test(priority=3,  dependsOnMethods= {"Login"})
	void search() {
		
		AssertJUnit.assertTrue(true);
			
	}
	@Test(priority=4,  dependsOnMethods= {"search"})
	void Advsearch() {
		
		AssertJUnit.assertTrue(true);
			
		
	}
	@Test(priority=5,  dependsOnMethods= {"Advsearch"})
	void logout() {
			
		
	}

	
	
	
	
}
