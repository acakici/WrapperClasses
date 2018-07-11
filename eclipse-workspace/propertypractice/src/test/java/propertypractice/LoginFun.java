package propertypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFun {

//	Create a maven project 
//
//
//	Create a properties file to store 
//	URL = http://automationpractice.com/index.php
//	User = waya@IOreak.net
//	Password = password
//
//	inside your test use the utility class to access URL , USER , PASSWORD
//
//	Create a test for login functionlity 

	// NAVIGATE TO THE PAGE 
	// ENTER USER NAME AND PASSWORD
	// VERIFY YOU ARE LOGGED IN SUCCESSFULLY 
	
	WebDriver driver;

	@BeforeClass // runs only one time

	public void setUpClass() {

		System.out.println("Runs once before everything in this class");
	}

	@BeforeMethod
	public void setUp() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void login() {
		driver.get(ConfigLoaderLogin.getMyValue("URL"));
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(ConfigLoaderLogin.getMyValue("User"));
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(ConfigLoaderLogin.getMyValue("Password"));
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		
		
		
}
}
