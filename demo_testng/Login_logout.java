package demo_testng;

import java.io.IOException;

import utilities_salesforce.Apputilities;

public class Login_logout {

	public static void main(String[] args) throws IOException {
		Apputilities ap = new Apputilities();
		//ap.Setup();
		ap.LaunchApp();
		ap.Login("A");
		ap.Logout();

	}

}
