package Testngc44;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SignupTests {
	
	

	@Test(priority=1,groups= {"Regresstion"})
	void  WhtasappSignup() {
		
		System.out.println("this is Signup Whtasapp ");
	}

	

	@Test(priority=2,groups= {"Regresstion"})
	void SignupFacebook() {
		
		System.out.println("this is Signup Facebook ");
	}


	@Test(priority=3,groups= {"Regresstion"})
	void SignupInstagram() {
		
		System.out.println("this is Signup Instagram");
	}


}
