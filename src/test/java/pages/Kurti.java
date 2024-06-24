package pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Kurti {

	WebDriver driver;
	public Kurti(WebDriver driver)
	{
		this.driver=driver;
	}
	public void kurtas()
	{
		driver.findElement(By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collection-filters-sidebar-form\"]/div[2]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"sidebar-filter-v-option-colorblue\"]")).click();
		
		//Action class
		driver.findElement(By.xpath("//*[@id=\"shopify-section-template--16086644850877__main\"]/section/header/div[2]/div/button[2]")).click();
		Actions act=new Actions(driver);
		WebElement best=driver.findElement(By.xpath("//*[@id=\"collection-sort-popover\"]/div/div/button[2]"));
		act.moveToElement(best).perform();
		
	}
	public void dress()
	{
		
		driver.findElement(By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[4]/a")).click();
		//scrolldown
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				//window handle
			    String parentwindow=driver.getWindowHandle();
			    driver.findElement(By.xpath("//*[@id=\"section-footer\"]/div[1]/div/ul/li[1]/a/span")).click();
			    Set<String>allwindow=driver.getWindowHandles();
			   for(String handle:allwindow)
			   {
				   if(!handle.equalsIgnoreCase(parentwindow))
		                 {
		                	 driver.switchTo().window(handle);
		                	//driver.findElement(By.xpath("//*[@id=\"mount_0_0_rH\"]/div/div/div[2]/div/div/div[1]/div[2]/section/main/div/header/section/div[1]/div[2]/div/div[1]/button/div/div")).click();
		                    driver.close();
		                 
		                 }
				   driver.switchTo().window(parentwindow);
			   }
			  
	}
	 public void topsscreenshot() throws IOException
	   {
		 driver.findElement(By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[6]/a")).click();
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshot, new File("./screenshot//bottom.png"));
	   }
	    	
}
