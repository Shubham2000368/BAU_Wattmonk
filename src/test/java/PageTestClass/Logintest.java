
package PageTestClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselibrary.BaseLibrary;
import PageUtility.login_page;

public class Logintest extends BaseLibrary {
	private login_page ob;

	@BeforeTest
	public void getLaunchURLs() throws InterruptedException {
		Thread.sleep(5000);
		getLaunchURL();
		ob = new login_page();
	}

	@Test(priority = 0)
	public void testLoginPage() throws InterruptedException {
		ob.login();
	}

	@Test(priority = 1)
	public void testGetTitle() {
		ob.verifyTitle();
	}
}
