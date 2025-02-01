package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base{

	public void checkboxhandling()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singlecheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if(!singlecheckbox.isSelected())
		{
			singlecheckbox.click();
		}
		
		if(singlecheckbox.isSelected())
		{
			singlecheckbox.click();
		}
		
		List <WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		for(WebElement checkbox:checkboxes)
		{
			if(!checkbox.isSelected())
			{
				checkbox.click();
			}
			
		}
		
		
		WebElement unselectallbutton=driver.findElement(By.xpath("//input[@value='Unselect All']"));
		unselectallbutton.click();
	
List <WebElement> checkboxes2=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		for(WebElement checkbox2:checkboxes2)
		{
			if(checkbox2.isSelected())
			{
				checkbox2.click();
			}
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Checkbox checkbox=new Checkbox();
		checkbox.initialiseBrowser();
		checkbox.checkboxhandling();
		//checkbox.driverQuit();
	}

}
