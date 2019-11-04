package testNg;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class GoogleLogin {
	public static WebDriver driver;
	public static WebElement error;
	public void browserLaunch()
	{
				
		String appurl="https://accounts.google.com/";
		driver.get(appurl);
	}
	
	public void loginGoogle() throws InterruptedException 
	{
		driver.findElement(By.id("Email")).sendKeys("santhiraavi123");
		Thread.sleep(1000);

		//click next button
		
		
		driver.findElement(By.id("next")).click();;
		
		Thread.sleep(1000);

	driver.findElement(By.id("Passwd")).sendKeys("priya@mural");
		
				Thread.sleep(1000);

		//click on sign in
		driver.findElement(By.id("signIn")).click();


	}	

	public void wrongPassword() 
	{

		 error=driver.findElement(By.id("errormsg_0_Passwd"));
		 



		
		
		
	}

}
