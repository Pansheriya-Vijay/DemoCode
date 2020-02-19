import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1 {

	public static void main(String[] args) {
		//System.setProperty("WebDriver.ie.driver", "C:\\selenium\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("http://google.com"); 
		
		/*System.setProperty("WebDriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.ca"); */
		/*
		File file = new File("C:\\selenium\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://facebook.com"); */
		
			
		File file = new File("C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com"); 
		driver.findElement(By.name("firstname")).sendKeys("Aavish");
		driver.findElement(By.name("lastname")).sendKeys("Pansh");
		driver.findElement(By.name("reg_email__")).sendKeys("6472302000");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Shilu009");
		driver.findElement(By.name("birthday_month")).sendKeys("11");
		driver.findElement(By.id("day")).sendKeys("1");
		driver.findElement(By.id("year")).sendKeys("1983");
		driver.findElement(By.id("u_0_7")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
				

	}

}
