import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		File file = new File("C:\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		WebElement address=driver.findElement(By.xpath(".//*[@id='gh-cat']"));
		
		Select ab = new Select(address);  //more method available for drop down menu finding
		ab.selectByVisibleText("Books");
		//ab.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();
		
		}

}
