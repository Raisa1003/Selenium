package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Iframe_Hw extends Base {

	
	public void iframeactions()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		//Actions action=new Actions(driver);
		WebElement iframeelement=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		/* action.moveToElement(iframeelement).perform();
		    action.sendKeys(Keys.ARROW_DOWN).perform();*/
		    driver.switchTo().frame(iframeelement);
	   
		WebElement tryitfreeclick=driver.findElement(By.xpath("//img [@src='Jmeter720.png']"));
		tryitfreeclick.click();
		
		driver.switchTo().parentFrame();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iframe_Hw iframehomework=new Iframe_Hw();
		iframehomework.initialiseBrowser();
		iframehomework.iframeactions();
		//iframehomework.driverQuit();
		
		
	}

}
