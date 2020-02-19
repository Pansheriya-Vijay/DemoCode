import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {

	public static void main(String[] args) {
		
		File file = new File("C:\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver d1 = new FirefoxDriver();
		
		d1.get("http://www.facebook.com");
		
		d1.findElement(By.xpath(".//*[@id='email']")).sendKeys("vijaysvnit2005@yahoo.co.in"); 
		d1.findElement(By.xpath(".//*[@id='pass']")).sendKeys("vijay008");
		d1.findElement(By.xpath(".//*[@value='Log In']")).click();  
		
		
		/*d1.get("http://www.google.com");
		d1.findElement(By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div/a")).click();
		d1.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("Aavish");
		d1.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click(); */
		
	}

}
