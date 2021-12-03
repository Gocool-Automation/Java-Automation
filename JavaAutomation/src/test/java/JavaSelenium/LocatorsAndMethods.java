package JavaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsAndMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Utilities\\ChromeDriver_V96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String uName = "GuestJohn";

		// Implicit wait to handle NoSuchElement Exception
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Calling Static Method
		String uPwd = getPassword(driver);

		// By id, name, className
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys(uName); // Using id
		driver.findElement(By.name("inputPassword")).sendKeys(uPwd); // Using name
		driver.findElement(By.className("signInBtn")).click(); // Using classname
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());

		// TestNG Assertion
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		// By customized CSS Selector
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + uName + ",");

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();

		// Closing the active driver window
		driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1];
		return password;

	}

}
