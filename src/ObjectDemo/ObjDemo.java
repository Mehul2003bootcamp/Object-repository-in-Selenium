package ObjectDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Obj.Utility.ConfigFileReader;

public class ObjDemo {
	@Test
	public void ConfigRead() throws Exception{
		ConfigFileReader cconfig=new ConfigFileReader();
		File src =new File("D:\\selenium Programmes\\ObjectRepositoriesInSelenium\\src\\Apache test data\\Book 5.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		System.setProperty("webdriver.chrome.driver", cconfig.getChromePath());
		WebDriver driver=new ChromeDriver();
		
		driver.get(cconfig.geturl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id(cconfig.getUsername())).sendKeys(sheet1.getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.id(cconfig.getPassword())).sendKeys(sheet1.getRow(0).getCell(0).getStringCellValue());
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(cconfig.getSignin())).click();
		
		wb.close();
	}
}
