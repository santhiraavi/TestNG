package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import one.LoginWebErp;
@Listeners(testNg.ListenerClass.class)
public class ListenerClass implements ITestListener {
	WebDriver driver;
	
	@BeforeClass
		
		public void launchBrowse() 
		{
	       driver=new FirefoxDriver();
		  	driver.navigate().to(Flipkartpaths.BASEURL);


			driver.manage().window().maximize();	
			
		
		}
	
	
	@Test
	public void VerifyLogin() {
		  
		driver.findElement(By.xpath("//div[1]/div/ul/li[9]/a[contains(text(),'Log In')]")).click();


		driver.findElement(By.className("_2zrpKA")).sendKeys("9535796414");
		
		driver.findElement(By.className("_3v41xv")).sendKeys("flipkart@password");
		
		
		
		driver.findElement(By.xpath("//form/div[3]/button[contains(@class,'_7UHT_c')]")).click();

	}
@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult arg0) {
	

	System.out.println("screen shot"+arg0.toString());
	
}

@Override
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestStart(ITestResult arg0) {
	System.out.println("testcase started"+arg0.getName());

}

@Override
public void onTestSuccess(ITestResult arg0) {
	System.out.println("test case passed"+arg0.getName());
	
}


}
