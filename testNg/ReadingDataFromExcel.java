
package testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import one.LoginWebErp;

public class ReadingDataFromExcel {
	WebDriver driver;
@SuppressWarnings("deprecation")
@DataProvider
	
	public Object[][] extractDataFromExcel() throws EncryptedDocumentException, InvalidFormatException, IOException 

	{
		
		Object[][] obj=new Object[2][9];
		FileInputStream fin=new FileInputStream("F:\\TestSuite\\Book1.xlsx");  
		  
		Workbook wb=WorkbookFactory.create(fin);

		Sheet sh=wb.getSheet("Sheet1");
//		HashMap<String, HashMap<String, String>>  map1=new HashMap<String, HashMap<String,String>>();
//
//		HashMap<String, String> map2=map1.get(0);
//
//		String key=map2.get(0);
		
		int rowcount=0;

       
		Iterator<Row> rowiterator=sh.iterator();
	

		while(rowiterator.hasNext())
		{
			Row row=rowiterator.next();
			int cellcount=0;	
			
			if(row.getRowNum()==0)
			{
				
				continue;		
			}
			
			else
			{

			Iterator<Cell> celliterator=row.iterator();

			while(celliterator.hasNext())
			{
				Cell cell=celliterator.next();
				
//				System.out.println("printing row count"+rowcount);
//				System.out.println("printing cell count"+cellcount);

//				obj[rowcount][cellcount]=cell.getStringCellValue();
				
				System.out.println(cell.getStringCellValue());

//				System.out.println(obj[rowcount][cellcount]);
				


				cellcount++;
//			if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
//			{
//				
//			}

				
				

			
			
			}
//			

//			
			rowcount++;
			

		}	
		

		}
		
		
//
	return  obj;

	}



@Test(dataProvider="extractDataFromExcel",alwaysRun=true)
  public void VerifyLogin(String a,String b,String c,String d,String e,String f,String g,String h,String i)
  {
	
	
	
//	  driver.findElement(By.name(LoginWebErp.LOGIN)).sendKeys(username);
//
//		driver.findElement(By.name(LoginWebErp.PASSWORD)).sendKeys(password);
//
//		driver.findElement(By.name(LoginWebErp.SUBMIT)).click();
  }
  

}
