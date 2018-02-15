package ProjectFeb15.ProjectFeb15Arttifact;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PSSM2 {
	
	@Before 
	public void login()
	{
		System.out.println("LOgin window of web");
	}
	
	@Test
	public void addTocart()
	{
		System.out.println("Add to shopping cart");
	}

	@After
	public void logout()
	{
		System.out.println("Logout window of web");
	}
}
