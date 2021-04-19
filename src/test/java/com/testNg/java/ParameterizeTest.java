package com.testNg.java;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeTest {
	@Test
	@Parameters({"username","password"})
	public void a(@Optional("vichu")String username,int password) {
		System.out.println("username-"+username);
		System.out.println("username-"+password);

	}
	@DataProvider
	public Object[][] b() {
		return new Object[][]{
			{"tharu",567},
			{"vichu",890},
			{"raji",765}
		};
	}
	
}
