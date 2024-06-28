package ExecutionOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
	@Test
	public void first(){
		System.out.println(" Order of execution - first Test");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println(" Order of execution - BeforeMethod");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println(" Order of execution - afterMethod");
		}
	
	@BeforeClass
	public void beforeclass(){
		System.out.println(" Order of execution - beforeclass");
	}
	
	@AfterClass
	public void afterclass(){
		System.out.println(" Order of execution - afterclass");
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println(" Order of execution - aftertest");
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println(" Order of execution - aftersuite");
	}
}
