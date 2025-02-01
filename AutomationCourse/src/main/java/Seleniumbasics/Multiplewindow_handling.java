package Seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Multiplewindow_handling extends Base {

	
	public void multiplewindow()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement likeusbuttton=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		likeusbuttton.click();
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
		Set<String>sets=driver.getWindowHandles();
		Iterator<String>iterator1=sets.iterator();
		while(iterator1.hasNext())
		{
			String childwindow=iterator1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				WebElement likeusbuttton1=driver.findElement(By.xpath("(//input[@name='email'])[2]"));
				likeusbuttton1.sendKeys("aabbcc@gmail.com");
				//driver.close();
				
			}
			driver.switchTo().window(mainwindow);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Multiplewindow_handling multiplewindow=new Multiplewindow_handling();
		multiplewindow.initialiseBrowser();
		multiplewindow.multiplewindow();
		
	}

}
