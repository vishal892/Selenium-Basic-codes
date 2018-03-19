package Run;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTCACC {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:/Selenium Set up/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in");
		WebElement ddl=driver.findElement(By.partialLinkText("Tourism"));
		Actions act=new Actions(driver);
		act.moveToElement(ddl).perform();
		WebElement acc = driver.findElement(By.linkText("Accommodations"));
		act.moveToElement(acc).perform();
		driver.findElement(By.linkText("Hotels & Lounge")).click();
		driver.findElement(By.linkText("Lounge")).click();
		driver.close();


	}
}
