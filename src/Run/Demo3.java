package Run;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


@Test
public class Demo3 {
	public void test()
	{
		System.setProperty("webdriver.firefox.marionette", "D:/Selenium Set up/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.fb.com");
		String Js_Command="Windows.Scroll(0.500)";
		JavaScriptExecutor jSDriver = (JavaScriptExecutor) driver;	
        jSDriver.ExecuteScript(Js_Command);
        driver.close();
        
	}


	}

