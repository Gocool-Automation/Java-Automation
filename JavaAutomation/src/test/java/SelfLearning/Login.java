package SelfLearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class Login {

	//Declaring Global variables
	public static String s_email;
	public static String s_pwd;
	public static String s_userid;
	
	public static void main(String[] args) throws IOException, Exception {
		
		//Load the file
		Properties objProp = new Properties();
		objProp.load(new FileInputStream("data.properties"));
		
		//Reading the file data into the Global variables
		s_email = objProp.getProperty("Email");
		s_pwd = objProp.getProperty("Pwd");
		s_userid = objProp.getProperty("Username");
				
		// Web driver initialization
		//System.setProperty("webdriver.ie.driver", "C:\\SDET_Training\\Selenium_Learning\\IEDriverServer.exe");
		WebDriver driver; //= new InternetExplorerDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		//Load URL & Navigate
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		//Click on Sign in button
		driver.findElement(By.xpath("//a [@href= 'https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/']")).click();
		Thread.sleep(3000);
		
		//Enter Email
		driver.findElement(By.xpath("//input [@type = 'email']")).sendKeys(s_email);
		System.out.println("Email id entered");
		
		//Click on Next button
		driver.findElement(By.xpath("//div[@role='button' and @id='identifierNext']")).click();
		System.out.println("Next button clicked");
		Thread.sleep(3000);
		
		//Enter Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(s_pwd);
		System.out.println("Passwored entered");
		
		//Click on Next button
		driver.findElement(By.xpath("//div[@role='button' and @id='passwordNext']")).click();
		System.out.println("Login is successful");
		Thread.sleep(3000);
		
		//Click on Account button
		driver.findElement(By.xpath("//a [@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://www.google.com/']")).click();
		System.out.println("Clicked on Account button");
		
		//Validation
		String userName = driver.findElement(By.xpath("//div [@class='gb_Fb gb_Hb']")).getText();
		if(userName.equalsIgnoreCase(s_userid)) {
			System.out.println("Authenticated Login");
		} else {
			System.out.println("Failed");
		}
		
		//Close the browser
		driver.quit();

	}

}
