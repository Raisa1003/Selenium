package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Radiobutton extends Base {

	
	public void radiobuttonhandling()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement singleradioselectmale=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement singleradioselectfemale=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		
		if(singleradioselectmale.isSelected()) 
		{
			singleradioselectmale.click();
		}
			
		if(!singleradioselectfemale.isSelected())
		{
			singleradioselectfemale.click();
		}
		WebElement showselectedvaluebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showselectedvaluebutton.click();
		WebElement showmessage=driver.findElement(By.xpath("//div[@id='message-one']"));

		System.out.println(showmessage.getText());
	}
	
	public void groupradiobutton()
	{
		WebElement patientgendermale=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement patientgenderfemale=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		if(patientgendermale.isSelected())
		{
			patientgendermale.click();
		}
		if(!patientgenderfemale.isSelected())
		{
			patientgenderfemale.click();
		}
		WebElement patientage1to18=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement patientage19to44=driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement patientage45to60=driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		
		if(patientage1to18.isSelected())
		{
			patientage1to18.click();
		}
		if(!patientage19to44.isSelected())
				{
			       patientage19to44.click();
				}
		if(patientage45to60.isSelected())
		{
			patientage45to60.click();
		}

				
		WebElement getresultbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getresultbutton.click();
		
		WebElement getresultmessage=driver.findElement(By.xpath("//div[@id='message-two']"));
		System.out.println(getresultmessage.getText());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Radiobutton radiobutton=new Radiobutton();
		radiobutton.initialiseBrowser();
		radiobutton.radiobuttonhandling();
		radiobutton.groupradiobutton();
		//radiobutton.driverQuit();
		
	}

}
