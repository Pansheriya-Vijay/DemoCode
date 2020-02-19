import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PopUp {

	public static void main(String[] args) {
		File file = new File("C:\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.book.indigo.in");
		driver.findElement(By.xpath(".//..")).click(); // radio button select and click then on popup will open
		Alert al=driver.switchTo().alert();
		
		al.accept(); // any positive response then use this method (yes, ok)
		al.dismiss(); // any negative response then use this method (no, cancel)
		
		}

}
