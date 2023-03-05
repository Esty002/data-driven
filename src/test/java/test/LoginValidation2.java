package test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;
import utils.ReadFile;

public class LoginValidation2 extends BaseTest{
	
	String fileName = "users.yaml";
	private HashMap<String, Object> map;
	
	@BeforeClass
	public void beforeClass() {
		ReadFile rf = new ReadFile();
		map = rf.readYamlFile(fileName);
	}

	
	@Test
	public void michelleUserValidation() {
		HashMap<String, String> u1 = (HashMap<String, String>) map.get("user1");
		String username = u1.get("username");
		String password = u1.get("password");
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}	
	
	@Test
	public void benUserValidation() {
		HashMap<String, String> u2 = (HashMap<String, String>) map.get("user2");
		String username = u2.get("username");
		String password = u2.get("password");
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}	
}

















