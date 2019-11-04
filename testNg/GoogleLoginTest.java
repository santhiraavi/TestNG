package testNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleLoginTest {
	
	GoogleLogin googlelogin=new GoogleLogin();
	
  @Test
  public void first() throws InterruptedException {
	  GoogleLogin.driver=new FirefoxDriver();

	  googlelogin.browserLaunch();

  }
  
  @Test
  public void second() throws InterruptedException  
  {

	  googlelogin.loginGoogle();
	  GoogleLogin.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

  }
  
  @Test
  public void wrong()  
  {

	  GoogleLogin.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  googlelogin.wrongPassword();
		System.out.println(GoogleLogin.error.getText());

  }
}
