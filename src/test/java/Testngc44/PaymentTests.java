package Testngc44;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PaymentTests {
	
	
	

	@Test(priority=1,groups= {"Sanity","Regresstion","Functional"})
	void  GitPayment() {
		
		System.out.println("this is Payment git ");
	}

	

	@Test(priority=2,groups= {"Sanity","Regresstion","Functional"})
	void HousePayment() {
		
		System.out.println("this is Payment House ");
	}

}
