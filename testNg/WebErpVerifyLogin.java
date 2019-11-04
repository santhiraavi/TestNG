package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import one.LoginWebErp;

public class WebErpVerifyLogin {
	WebDriver driver;
	
	
	@BeforeClass
	
	public void launchBrowse()
	{
       driver=new FirefoxDriver();
	  	driver.navigate().to(LoginWebErp.WEBERPLINK);


		driver.manage().window().maximize();	

	}
  @Test
  public void Login() {
	  
	  	WebElement demo=driver.findElement(By.name(LoginWebErp.COMPANY));
		
		Select option=new Select(demo);
		
		option.selectByIndex(1);
		
		
		
		driver.findElement(By.name(LoginWebErp.LOGIN)).sendKeys(LoginWebErp.LOGINDETAIL);

		driver.findElement(By.name(LoginWebErp.PASSWORD)).sendKeys(LoginWebErp.PASSWORDDETAIL);

		driver.findElement(By.name(LoginWebErp.SUBMIT)).click();
		
		  WebElement verifyNameUsername=driver.findElement(By.xpath(LoginWebErp.VERIFYNAME));

		  System.out.println(verifyNameUsername.getText()+ " Checking Whether the user is Demonstration user or not " +verifyNameUsername.isDisplayed());
			
		  System.out.println("Title of the page "+driver.getTitle());
  }
  
  @AfterClass
  
  public void logout()
  {
	  WebElement logout=driver.findElement(By.xpath(LoginWebErp.LOGOUTPATH));

	  logout.click();
	  
	  Alert alert=driver.switchTo().alert();
	  
	  alert.accept();
  }
}
