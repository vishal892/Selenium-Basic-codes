package Run;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CurrentURL {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette", "D:/Selenium Set up/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		String Current_URL=driver.getCurrentUrl();
		System.out.println(Current_URL);
		driver.close();
	}
}
