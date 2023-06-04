package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	public static void capturescreenshot(WebDriver driver,String testname) throws IOException {
		Date time=Calendar.getInstance().getTime();
		TakesScreenshot take=(TakesScreenshot)driver;
		File path=take.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Velocity\\Selenium"+testname+" Test.jpeg");
		FileHandler.copy(path, dest);	
	}
	
	public static String fetchdata(String sheet,int row,int cell) throws IOException  {
		String path="C:\\Users\\Abhijeet Yadav\\Desktop\\UserData.xlsx";
		FileInputStream file=new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(data);
		return data;
	}
	

	//Hii
	//Hiii
	//4th June

}
