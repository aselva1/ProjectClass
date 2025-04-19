package Org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	}

}
