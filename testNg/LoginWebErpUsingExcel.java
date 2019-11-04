package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import one.LoginWebErp;

public class LoginWebErpUsingExcel {
	
	WebDriver driver=new FirefoxDriver();

	
@BeforeTest
	
	public void launchBrowse() 
	{
	

	 driver.get(LoginWebErp.WEBERPLINK);


		driver.manage().window().fullscreen();	
	
	}

	@DataProvider
	
	public Object[][] extractDataFromExcel() throws EncryptedDocumentException, InvalidFormatException, IOException  
	{
		
		Object[][] obj=new Object[4][2];

		FileInputStream fin=new FileInputStream("F:\\Excel\\Book1.xlsx");  
		  
		Workbook wb=WorkbookFactory.create(fin);
	  
		Sheet sh=wb.getSheet("Sheet1");
	  
		int rowcount=0;
		Iterator<Row> rowiterator=sh.iterator();
		while(rowiterator.hasNext())
		{
			Row row=rowiterator.next();
			
			int cellcount=0;
			if(row.getRowNum()==0)
			{
				

			}
			Iterator<Cell> celliterator=row.iterator();

			while(celliterator.hasNext())
			{
				Cell cell=celliterator.next();
				
				System.out.println("printing row count"+rowcount);
				System.out.println("printing cell count"+cellcount);

				obj[rowcount][cellcount]=cell.getStringCellValue();
				
				System.out.println(obj[rowcount][cellcount]);

				cellcount++;
			}
			
			rowcount++;
		}
		
	  
	return  obj;

	}


  @Test(dataProvider="extractDataFromExcel")
  public void VerifyLogin(String username,String password) {
	 
	WebElement demo=driver.findElement(By.name(LoginWebErp.COMPANY));
		
		Select option=new Select(demo);
		
		option.selectByIndex(0);
	  
	  driver.findElement(By.name(LoginWebErp.LOGIN)).sendKeys(username);

		driver.findElement(By.name(LoginWebErp.PASSWORD)).sendKeys(password);

		driver.findElement(By.name(LoginWebErp.SUBMIT)).click();
  }
  
  @AfterClass
  
  public void logout()
  {
	  WebElement logout=driver.findElement(By.xpath(LoginWebErp.LOGOUTPATH));

	  logout.sendKeys();
	  
	  logout.click();
	  
	  Alert alert=driver.switchTo().alert();
	  
	  alert.accept();
  }
}
