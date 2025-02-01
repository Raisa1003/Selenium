package Seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
 public WebDriver driver;
 public void initialiseBrowser()
 {
	 driver=new ChromeDriver();
	 //driver=new FirefoxDriver();
    driver.get("https://selenium.qabible.in/simple-form-demo.php");
	// driver.get("https://www.selenium.dev");
	 driver.manage().window().maximize();
	 driver.manage().window().minimize();
 }
 
 public void driverQuit()
 {
	 driver.quit();
	//driver.close();
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Base base=new Base();
   base.initialiseBrowser();
	}

}
