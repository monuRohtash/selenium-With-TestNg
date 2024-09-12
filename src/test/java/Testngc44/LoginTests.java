package Testngc44;

import org.testng.annotations.Test;


public class LoginTests {
	
	@Test(priority=1,groups= {"Sanity"})
	void facebooklogin() {
		
		System.out.println("this is facebook login");
	}

	

	@Test(priority=2,groups= {"Sanity"})
	void Udemylogin() {
		
		System.out.println("this is Udemy login");
	}


	@Test(priority=3,groups= {"Sanity"})
	void Rubylogin() {
		
		System.out.println("this is Ruby login");
	}

	
}
