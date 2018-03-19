package Run;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;


public class ActionGmailLink {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette", "D:/Selenium Set up/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.id("identifierId")).sendKeys("vishalkc91",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("Vicky_007",Keys.ENTER);
		driver.findElement(By.partialLinkText("Drafts ")).click();
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
		driver.close();
	}

}
