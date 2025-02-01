package Seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class payrolldemo extends Base {

	public void initialiseBrowserpayroll()
	 {
		 driver=new ChromeDriver();
	    driver.get("https://www.qabible.in/payrollapp/site/login");
		 driver.manage().window().maximize();
		 //driver.manage().window().minimize();
	 }
	public void logincredentials()
	{
		 
		WebElement username=driver.findElement(By.xpath("//input[@id='loginform-username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@id='loginform-password']"));
		password.sendKeys("123");
		WebElement rememberme=driver.findElement(By.xpath("//input[@id='loginform-rememberme']"));
		rememberme.click();
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		
        WebElement errormessage=driver.findElement(By.xpath("//p[text()='Incorrect username or password.']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(errormessage));
		
		System.out.println(errormessage.getText());

	   /* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement username=driver.findElement(By.xpath("//input[@id='loginform-username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@id='loginform-password']"));
		password.sendKeys("admin123");
	    WebElement remembermecheckbox=driver.findElement(By.xpath("//input[@id='loginform-rememberme']"));
	    boolean ischeckboxselected=remembermecheckbox.isSelected();
	    System.out.println(ischeckboxselected);
	    WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login-button']"));
	    loginbutton.click();
	    
	    WebElement errormessage=driver.findElement(By.xpath("//p[text()='Incorrect username or password.']"));
	    System.out.println(errormessage.getText());*/
	   
	   
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		payrolldemo payroll=new payrolldemo();
		payroll.initialiseBrowserpayroll();
		payroll.logincredentials();
		//payroll.driverQuit();
		
	}

}
