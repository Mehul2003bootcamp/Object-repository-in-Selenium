package Obj.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	Properties pro;
	
	public ConfigFileReader() {
		
		try {
			File src =new File("D:\\selenium Programmes\\ObjectRepositoriesInSelenium\\PropertiesFile\\config.property");
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public String getChromePath() {
		String path=pro.getProperty("ChromeDriver");
		return path;
	}
	
	public String getEdgePath() {
		String path=pro.getProperty("EdgeDriver");
		return path;
	}
	
	public String getFirefoxPath() {
		String path=pro.getProperty("FirefoxDriver");
		return path;
	}
	
	public String geturl() {
		String path=pro.getProperty("baseurl");
		return path;
	}
	
	public String getUsername() {
		String path=pro.getProperty("Uname");
		return path;
	}
	
	public String getPassword() {
		String path=pro.getProperty("pass");
		return path;
	}
	
	public String getSignin() {
		String path=pro.getProperty("Signin");
		return path;
	}
	
	public String getExcelPath() {
		String path=pro.getProperty("ExcelPath");
		return path;
	}
}
