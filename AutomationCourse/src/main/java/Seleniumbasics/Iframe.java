package Seleniumbasics;

import org.openqa.selenium.WebElement;

public class Iframe extends Base{

	public void iframehandling()
	{
		driver.navigate().to("https://demoqa.com/frames");
		
		//step1:Switch to frame
		
		//driver.switchTo().frame("frame1");
	//	WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		//driver.switchTo().frame(iframe);
		
		//Step :2 perform action
		
		//WebElement frameheading=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		//System.out.println(frameheading.getText());
		
		//step:3-back to main frame
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent(); //leave frame and switch to default content
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iframe iframe=new Iframe();
		iframe.initialiseBrowser();
		iframe.iframehandling();
		//iframe.driverQuit();
		
	}

}
