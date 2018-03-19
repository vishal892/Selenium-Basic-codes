package Run;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette", "D:/Selenium Set up/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("vishalkc91@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9709366233", Keys.ENTER);
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.partialLinkText("Log out")).click();
		driver.close();
	}

}
 