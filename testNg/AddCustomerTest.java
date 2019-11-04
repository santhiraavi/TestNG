package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddCustomerTest 
{	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] nnm=new Object[5][2];

	FileInputStream fis = new FileInputStream("F:\\Excel\\Book1.xlsx");
	

    	Workbook wb=WorkbookFactory.create(fis);
    	Sheet sheet =wb.getSheet("sheet1");
    	int rowCount=0;
    	
    	Iterator<Row> rowiterator=sheet.iterator();
    	if(rowiterator.hasNext())
    	{
    	Row row= rowiterator.next();	
    	int cellCount=0;
    	Iterator<Cell> cellIterator=row.iterator();
    	if(row.getRowNum()==0)
    	{}
    	             
    	if (cellIterator.hasNext())
    	{
    		Cell cell=cellIterator.next();
    		cellCount++;
    	}
    	rowCount++;
    	}
    	 	
    	    	    	  	
		return nnm;
    	}
    	
	@Test(dataProvider="getData")
	public void addCustomer(String un,String pwd)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://flipkart.com/");
		
		driver.findElement(By.xpath("//div/ul/li[8]/a[@class='_2k0gmP']")).click();
		driver.findElement(By.xpath("//div/form/div[1]/input[@class='_2zrpKA']")).sendKeys(un);
		driver.findElement(By.xpath("//div/form/div[2]/input[@type='password']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//div/form/div[3]/button[@type='submit']")).submit();		
	}
	}