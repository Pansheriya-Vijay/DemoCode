import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		File file = new File("C:\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("vijaysvnit2005@yahoo.co.in");
		driver.findElement(By.cssSelector("#pass")).sendKeys("vijay008");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

}
