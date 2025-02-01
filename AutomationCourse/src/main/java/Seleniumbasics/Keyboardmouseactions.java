package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboardmouseactions extends Base{

	
	public void actions()
	{
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		Actions action=new Actions(driver);
		WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickme.click();
		
		WebElement rightclick=driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		action.contextClick(rightclick).perform();//right click -use contextClick
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		action.doubleClick(doubleclick).perform(); //double click-use doubleclick
		
		//MouseOver
		action.moveToElement(clickme).perform();
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		//Mouseover and move down 
		WebElement textboxmouseover=driver.findElement(By.xpath("//a[@href='text-box.php']"));
		action.moveToElement(textboxmouseover).perform(); 
		action.sendKeys(Keys.ARROW_DOWN).perform();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Keyboardmouseactions keyboardactions=new Keyboardmouseactions();
		keyboardactions.initialiseBrowser();
		keyboardactions.actions();
		//keyboardactions.driverQuit();
	}

}
