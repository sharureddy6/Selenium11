package ExecutionOrder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleTestNGUses {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("order of execution Before Test");
	}

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Order of execution Before Suite");
	}
}
