package Seleniumbasics;

import java.nio.channels.SelectableChannel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base {

	public void handlingDropdown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement singledropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(singledropdown);
		select.selectByIndex(2);
		WebElement element=select.getFirstSelectedOption();
		System.out.println(element.getText());
		
		select.selectByValue("Red");
		WebElement element1=select.getFirstSelectedOption();
		System.out.println(element1.getText());
		
		select.selectByValue("Yellow");
		WebElement element2=select.getFirstSelectedOption();
		System.out.println(element2.getText());
		
		WebElement multiselected=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select1=new Select(multiselected);
		boolean ismultiselected=select1.isMultiple();
		System.out.println(ismultiselected);
		select1.selectByIndex(0);
		select1.selectByIndex(2);
		
		
	/*	for(int i=0;i<2;i++)
		{
			select1.selectByIndex(i);
		}*/
		
		List<WebElement> selectedelementlist=select1.getAllSelectedOptions();
		for(int i=0;i<selectedelementlist.size();i++)
		{
			System.out.println(selectedelementlist.get(i).getText());
			
		}
		select1.deselectAll();
	}
	
	public void checkboxhandling()
	{
		driver.navigate().to("https://selenium.qabible.in/jquery-select.php");
		WebElement checkbox=driver.findElement(By.xpath("//select[@data-select2-id='select2-data-1-c0fu']"));
		Select select=new Select(checkbox);
		select.selectByIndex(2);
		WebElement element=select.getFirstSelectedOption();
		System.out.println(element.getText());
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dropdown dropdown=new Dropdown();
		dropdown.initialiseBrowser();
	
		dropdown.handlingDropdown();
		//dropdown.driverQuit();
	}

}
