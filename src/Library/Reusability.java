package Library;
import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Reusability {
	public static void capturedscreenshots(WebDriver driver, String ScreenShotName) {
		
		 try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			 File source = ts.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(source, new File("./ScreenShots/" + ScreenShotName + getCurrentDateTime() + ".png"));
		 }
		
		 catch (Exception e) {
			 System.out.println("Exception While Taking Screen Shot" + e.getMessage());
		 }
	}
	
	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate=new Date(0);
		return customFormat.format(currentdate);
	}
}




