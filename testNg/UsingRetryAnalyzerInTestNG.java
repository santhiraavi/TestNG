package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingRetryAnalyzerInTestNG {




        @Test(retryAnalyzer=IretryAnalyzer.class)

        public void verifySeleniumTitle()

        {  





                        WebDriver driver=new FirefoxDriver();

                        driver.manage().window().maximize();

                        driver.get("http://www.learn-automation.com");



                     // Here we are verifying that title contains QTP or not. This test will fail because title does not contain QTP

                        Assert.assertTrue(driver.getTitle().contains("QTP"));



        }



	}


