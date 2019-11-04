package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PdfReportDemo
{
	WebDriver driver=null;
	
	@BeforeTest
	public void intialize()
	{
	 driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");	

	}
	
	@Test

	public void login()
	{
		driver.findElement(By.xpath("//div[1]/div/ul/li[9]/a[contains(text(),'Log In')]")).click();


		driver.findElement(By.className("_2zrpKA")).sendKeys("9535796414");
		
		driver.findElement(By.className("_3v41xv")).sendKeys("flipkart@password");
		
		
		
		driver.findElement(By.xpath("//form/div[3]/button[contains(@class,'_7UHT_c')]")).click();

	}
		
	@Test
	public void clickonElectronics()
	{	 
		driver.findElement(By.xpath("//div[1]/div/ul/li[9]/a[contains(text(),'Log In')]")).click();

		driver.findElement(By.className("_2zrpKA")).sendKeys("9535796414");
		
		driver.findElement(By.className("_3v41xv")).sendKeys("flipkart@password");
		
		driver.findElement(By.xpath("//form/div[3]/button[contains(@class,'_7UHT_c')]")).click();

        driver.findElement(By.xpath("//div/ul/li/a/span[text()='Electronics']")).click();
    
	}	
	
	@Test(dependsOnMethods = { "login" })
	
	public void vclose()
	{
		driver.quit();
	}
}
