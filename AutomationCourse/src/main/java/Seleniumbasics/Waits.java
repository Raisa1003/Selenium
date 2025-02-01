package Seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends Base {

	
	public void waitsample()
	{
		driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		
		WebDriverWait webdriverwait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		webdriverwait.until(ExpectedConditions.visibilityOf(loginbutton));
		webdriverwait.until(ExpectedConditions.elementToBeClickable(loginbutton));
		webdriverwait.until(ExpectedConditions.attributeContains(loginbutton,"name","login-button"));
		
		
		//Fluent Wait
		
		FluentWait<WebDriver>fluentwait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		fluentwait.until(ExpectedConditions.elementToBeClickable(loginbutton));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Waits wait=new Waits();
		wait.initialiseBrowser();
		wait.waitsample();
	}

}
