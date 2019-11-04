package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import one.LoginWebErp;

public class ParameterAttribute {
	
	
	WebDriver driver;
@BeforeClass
	
	public void launchBrowse()
	{
       driver=new FirefoxDriver();
       driver.navigate().to("https://www.flipkart.com/");
		


		driver.manage().window().maximize();	

	}
  @Test
  @Parameters({"username","password"})

  public void parameters(String username,String password) {
	 
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//html/body/div[1]/div/header/div[1]/div[1]/div/ul/li[9]/a[contains(text(),'Log In')]")).click();


		driver.findElement(By.className("_2zrpKA")).sendKeys(username);
		
		driver.findElement(By.className("_3v41xv")).sendKeys(password);
		
		System.out.println(username);
		System.out.println(password);

		
		driver.findElement(By.xpath("//form/div[3]/button[contains(@class,'_7UHT_c')]")).click();
  }
}
