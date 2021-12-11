package JavaSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	//Locators - id, Xpath, CSS Selector, name, classname, Tagname, Link Text, Partial Link Text

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Utilities\\ChromeDriver_V96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait to handle NoSuchElement Exception
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//By id, name, className
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); //Using id
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); //Using name
		driver.findElement(By.className("signInBtn")).click(); //Using classname
		
		//By CSS Selector Tagname.classname
		String result = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(result);

		//By LinkText
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		//By Xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("GuestUserJohn");
		
		//By Customized CSS Selector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@dummy.com");
		
		//By Xpath with Index
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//By CSS Selector with Index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John@dummygmail.com");
		
		//By Xpath Tagname
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9988776655");
		
		//By CSS Selector .classname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		//Form Login
		//By CSS Selector #tagValue
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("GuestJohn");
		
		//By CSS Selector with Regular Expression
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.id("chkboxTwo")).click();
		
		//By Customized Xpath with Regular Expression - Contains keyword
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
