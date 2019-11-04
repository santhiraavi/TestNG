package testNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import one.LoginWebErp;

public class AnnotationTestAttributes {
	
	WebDriver driver;
	@BeforeClass
	
	@Test
	public void methodbeforeClass()
	{
	driver=new FirefoxDriver();
//	driver.navigate().to(LoginWebErp.WEBERPLINK);

	driver.manage().window().maximize();
	}
  @Test(enabled=false)
  public void failmethod() throws IOException {
	  
	  
	  driver.findElement(By.name(LoginWebErp.LOGIN)).sendKeys(LoginWebErp.LOGINDETAIL);

		driver.findElement(By.name(LoginWebErp.PASSWORD)).sendKeys("one");

		driver.findElement(By.name(LoginWebErp.SUBMIT)).click();
		
		
		TakesScreenshot fdriver=(TakesScreenshot) driver;
		File imageFile;
		imageFile= fdriver.getScreenshotAs(OutputType.FILE);

		
		FileUtils fileutils=new FileUtils();
		File destFile=new File("F://Screens");
		try
		{
		fileutils.copyFileToDirectory(imageFile, destFile);
		// fileutils.copyFileToDirectory(imageFile,destFile);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
  }
  
  @Test(dependsOnMethods={"failmethod"},alwaysRun=true,enabled=true,invocationCount=3)
  public void alwaysrun()
  
  {
	  
	  System.out.println("always run this method");
	  
  }
 

}

