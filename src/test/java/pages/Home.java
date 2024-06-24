package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
    WebDriver driver;
    By myacc=By.xpath("//*[@id=\"section-header\"]/div/div[3]/a[3]");
    By lemail=By.xpath("//*[@id=\"customer_login\"]/div[1]/input");
    By lpass=By.xpath("//*[@id=\"customer_login\"]/div[2]/input");
	By log=By.xpath("//*[@id=\"customer_login\"]/button");
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String pass)
	{
		driver.findElement(myacc).click();
		driver.findElement(lemail).sendKeys(email);
		driver.findElement(lpass).sendKeys(pass);
	}
	public void login()
	{
		driver.findElement(log).click();
		driver.findElement(By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[1]/a")).click();
	}
	public void newcollection()
	{
		driver.findElement(By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Huratips-Loop\"]/div[1]/div/div/div[2]/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"product_form_7599037612221\"]/div[2]/div[1]/ul/li[3]/label")).click();
		WebElement addtobag= driver.findElement(By.xpath("//*[@id=\"product_form_7599037612221\"]/div[4]/button"));
		//Scrolldown
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",addtobag );
		addtobag.click();
		//driver.navigate().back();
		driver.switchTo().defaultContent();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"qikify-stickycart-v2-app\"]/div/div[1]/div[2]/div/div[4]/div/button")));
		driver.findElement(By.xpath("//*[@id=\"qikify-stickycart-v2-app\"]/div/div[1]/div[2]/div/div[4]/div/button")).click();
		driver.navigate().back();
		
			
	}
}
