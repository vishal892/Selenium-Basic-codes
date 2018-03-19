package Run;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTitle {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.firefox.marionette", "D:/Selenium Set up/geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in");
			String actualTitle = driver.getTitle();
			String expectedTitle = "IRCTC Next Generation eTicketing System";
			if(actualTitle.equals(expectedTitle)==true)
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Failed");
			}
			driver.close();
	}

}
