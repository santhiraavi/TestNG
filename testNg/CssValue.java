package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CssValue {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("F:\\New folder\\table.html");
//		WebElement elemnt=driver.findElement(By.xpath("//div/h1[@jsselect='heading']"));
//		elemnt.getCssValue("h1");
//		if(driver.findElements(By.xpath("//a[text()='link1']")).size()!=0)
//		{
//			System.out.println("one");
//		}
		
		
		try{
			WebElement element=driver.findElement(By.xpath("//a[text()='link1']"));
			System.out.println("true");
			System.out.println(driver.findElements(By.xpath("//a[text()='link1']")).size());
			
			System.out.println(element.getAttribute("href"));
			
			System.out.println(element.getTagName());

			System.out.println(element.getText());

			return ;
			}
			catch(org.openqa.selenium.NoSuchElementException e)
			{
				System.out.println("false");
				return ;
			}
		
  }
}
