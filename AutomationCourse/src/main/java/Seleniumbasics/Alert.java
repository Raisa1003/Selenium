package Seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert extends Base{

	
	public void alerthandling() throws InterruptedException
	{
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement clickme1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme1.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		WebElement clickme2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		WebElement clickme3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickme3.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Warning");
		String alerttext=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alerttext);
		
		WebElement message=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		System.out.println(message.getText());
	}
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alert alert=new Alert();
		alert.initialiseBrowser();
		try {
			alert.alerthandling();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//alert.driverQuit();
	}

}
