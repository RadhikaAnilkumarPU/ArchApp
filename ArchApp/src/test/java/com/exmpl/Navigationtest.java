package com.exmpl;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Loginpage;


public class Navigationtest  
{
	WebDriver driver;
	  public void f(Integer n, String s) {
	}
	  
@BeforeMethod
public void beforeMethod() 
  	{
	  	// set path of Chromedriver executable
      	System.setProperty("webdriver.chrome.driver",
              "C:\\Users\\91756\\eclipse-workspace\\Maven1pjct\\src\\test\\resources\\drivers\\chromedriver.exe");

      	ChromeOptions options = new ChromeOptions();
      	options.addArguments("--remote-allow-origins=*");
      	//ChromeDriver driver = new ChromeDriver(options);
      
      	// initialize new WebDriver session
      	driver = new ChromeDriver(options);
      	driver.get("http://qabible.in/payrollapp/site/login");
      	Loginpage loginpageobject ;
  	}
  
 
  
 @Test(description = "TC_001_login homepage correctly", priority = 1, enabled = true)
 public void test_homepage_correct()
	{
		driver.get("http://qabible.in/payrollapp/site/login");
		Loginpage loginpageobject = new Loginpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpageobject.login2Care ("carol", "1q2w3e4r") ;
		
	}
  
 @Test(description = "TC_002_Verify login page with incorrect pswd", priority = 2, enabled = true)
 public void test_incorrectpwdlogin()
  	{
  		driver.get("http://qabible.in/payrollapp/site/login");
  		Loginpage loginpageobject = new Loginpage(driver);
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		loginpageobject.login2Care ("carol", "1q2w3e4") ;
  		String incorrectpwdCred = loginpageobject.getwrongpwdcred();
  		
  	}
  
 @Test(description = "TC_003_Verify login page with incorrect usernm", priority = 3, enabled = true)
 public void test_incorrectidlogin()
  	{
  		driver.get("http://qabible.in/payrollapp/site/login");
  		Loginpage loginpageobject = new Loginpage(driver);
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		loginpageobject.login2Care ("caro", "1q2w3e4") ;
  		String incorrectidCred = loginpageobject.getwrongidcred();
  		
  	}
  
 @Test(description = "TC_004_Verify login page without pwd", priority = 4, enabled = true)
 public void test_blankpwdlogin()
  	{
  	  	//driver.get("");
  		Loginpage loginpageobject = new Loginpage(driver);
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		loginpageobject.login2Care ("carol","") ;
  		String blankpwdCred = loginpageobject.getblankpwdcred();
  		
  	}

 @Test(description = "TC_005_Verify login page without usernm", priority = 5, enabled = true)
 public void test_blankidlogin()
  	{
  	  	//driver.get("");
  		Loginpage loginpageobject = new Loginpage(driver);
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		loginpageobject.login2Care ("","1q2w3e4") ;
  		String blankidCred = loginpageobject.getblankusernmcred();
  		
  	}
  
 @Test(description = "TC_006_Verify login page without pwd", priority = 6, enabled = true)
 public void test_blankuserpwdlogin()
  	{
	 	//driver.get("");
  		Loginpage loginpageobject = new Loginpage(driver);
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		loginpageobject.login2Care ("","") ;
  		String blankuserpwdCred = loginpageobject.getblankpwdcred();
  		
  	}

 @Test(description = "TC_007_Verify login page without usernm", priority = 7, enabled = true)
 public void test_incorrectuserpswdlogin()
  	{
  	  	//driver.get("");
  		Loginpage loginpageobject = new Loginpage(driver);
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		loginpageobject.login2Care ("car","1q2w3e") ;
  		String incorrectuserpswd = loginpageobject.getblankusernmcred();
  		
  	}
 
 @AfterMethod
 public void afterMethod() 
  	{
	 	// close and quit the browser
	 	driver.quit();
  	}

}


