package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
	
     By fname=By.xpath("//*[@id=\"create_customer\"]/div[1]/input");
     By lname=By.xpath("//*[@id=\"create_customer\"]/div[2]/input");
     By remail=By.xpath("//*[@id=\"create_customer\"]/div[3]/input");
     By rpass=By.xpath("//*[@id=\"create_customer\"]/div[4]/input");
     By create=By.xpath("//*[@id=\"create_customer\"]/button");
    public Register(WebDriver driver)
    {
    	this.driver=driver;
    }
    public void setvalues(String fna,String lna,String email,String passwrd)
    {
     driver.findElement(fname).sendKeys(fna);
     driver.findElement(lname).sendKeys(lna);
     driver.findElement(remail).sendKeys(email);
     driver.findElement(rpass).sendKeys(passwrd);
    }
    public void RegisterAccount()
    {
    	driver.findElement(create).click();
    }
}
