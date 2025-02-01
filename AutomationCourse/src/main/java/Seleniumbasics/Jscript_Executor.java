package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Jscript_Executor extends Base {

	public void javascriptsample()
	{
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(0,350)",""); //x=0,y=350
		javascriptexecutor.executeScript("window.scrollBy(0,-350)","");
        WebElement showmessagebutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		javascriptexecutor.executeScript("arguments[0].click", showmessagebutton);
		
		WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		javascriptexecutor.executeScript("arguments[0].scrollIntoView()",gettotalbutton);
		javascriptexecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.navigate().to("https://www.javatpoint.com/");
		javascriptexecutor.executeScript("window.scrollBy(500,0)",""); //scroll to right side
		javascriptexecutor.executeScript("window.scrollBy(-500,0)","");//scroll to left side
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jscript_Executor javascriptex=new Jscript_Executor();
		javascriptex.initialiseBrowser();
		javascriptex.javascriptsample();
		
	}

}
