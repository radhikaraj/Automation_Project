package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Home;
import pages.Kurti;


public class HomeLogin {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://kamikubi.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testlogin() throws InterruptedException
	{
		Home ob2=new Home(driver);
		ob2.setvalues("radhikapramod151@gmail.com", "Radhu123*");
		ob2.login();
		//Thread.sleep(1500);
		ob2.newcollection();
		
		
	}
	@Test
	public void testkurtas() throws IOException
	{
		Kurti ob3=new Kurti(driver);
		ob3.kurtas();
		ob3.dress();
		ob3.topsscreenshot();
	}
}
