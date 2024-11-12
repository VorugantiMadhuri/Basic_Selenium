package testNG_annotations;

import org.testng.annotations.Test;

import pom.LoginPage;

public class LoginTest extends BaseClassForLogin{
@Test
public void login() {
	login.setEmail("admin");
	login.setPassword("admin");
	login.loginCheckbox();
	login.logibBtn();
	
}
}
