package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Home;
import pages.Register;

public class Account {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://kamikubi.com/account/register");
		driver.manage().window().maximize();
	}
	@Test
	public void testregister()
	{
		Register ob1=new Register(driver);
		ob1.setvalues("Radhika", "Pramod", "radhikapramod151@gmail.com", "Radhu123*");
		ob1.RegisterAccount();
	}
	@Test
	public void testlogin()
	{
		Home ob2=new Home(driver);
		ob2.setvalues("radhikapramod151@gmail.com", "Radhu123*");
		ob2.login();
	}
}
