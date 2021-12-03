package JavaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoadWebDriver {

	public static void main(String[] args) throws Exception {

		//Chrome Driver Loading
		System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Utilities\\ChromeDriver_V96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Edge Driver Loading
		//System.setProperty("webdriver.edge.driver", "E:\\Learning\\Utilities\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		//Firefox Driver Loading
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
