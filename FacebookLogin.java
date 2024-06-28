import org.testng.annotations.Test;


public class FacebookLogin {
	
	@Test
	public void LoginWithValidCredentials() {
		System.out.println("Logged in Succesfully");
		
	}
	
	@Test
	public void LoginWithInvalidCredentials(){
		System.out.println("Login is Unsuccessfull");
	}

}
