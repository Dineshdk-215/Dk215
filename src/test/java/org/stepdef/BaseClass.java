package org.stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void Browser(String browser) {

		switch (browser) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;	

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "internet explorer":

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
	}


	public static void getUrl(String url) {
		driver.get(url);


	}

	public static String excelRead(String name, int rownum, int cellnum) throws IOException {
		Workbook wb = new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\sachi\\eclipse-workspace\\FrameworkLearning\\TestData\\Dk.xlsx")));
		return wb.getSheet(name).getRow(rownum).getCell(cellnum).getStringCellValue();

	}



	public void dropByValue(WebElement txt, String value) {
		Select s = new Select(txt);
		s.selectByValue(value);
	}


}
