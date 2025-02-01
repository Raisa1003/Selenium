package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebelementCommands extends Base {

	public void locators()
	{
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		WebElement classsample=driver.findElement(By.className("form-control"));
		WebElement tagsample=driver.findElement(By.tagName("button"));
		
		WebElement value1=driver.findElement(By.id("value-a"));
		WebElement value2=driver.findElement(By.id("value-b"));
		WebElement message1=driver.findElement(By.id("message-one"));
		
		WebElement tagsample1=driver.findElement(By.tagName("text"));
		WebElement tagsample2=driver.findElement(By.tagName("div"));
		WebElement tagsample3=driver.findElement(By.tagName("label"));
		
		
		WebElement class1=driver.findElement(By.className("my-2"));
		
		WebElement namesample=driver.findElement(By.name("viewport"));
		WebElement linkedtext=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement partiallinkedtext=driver.findElement(By.partialLinkText("Simple Form"));
		
		WebElement xpath1=driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		driver.findElement(By.xpath("//button[text()='Show Message')]"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @class='btn btn-primary']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @class='btn btn-primary']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card-body']//child::button[@class='btn btn-primary']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card' ]"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card' ]"));
        driver.findElement(By.cssSelector("input#single-input-field"));//css=tag#id
        driver.findElement(By.cssSelector("input.form-control"));//css=tag.class
        driver.findElement(By.cssSelector("div[id=message-one]"));//css=tag[attribute=value]
        driver.findElement(By.cssSelector("div.my-2[id='message-one']"));//css=tag.classname[sttribute=value]
		
	}
		
	
	
	public void elementCommands()
	{
		WebElement singleinputfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputfield.sendKeys("Hello");
		singleinputfield.clear();
		singleinputfield.sendKeys("Hello");
        WebElement showmessagebutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		showmessagebutton.click();
		WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message=yourmessage.getText();
		System.out.println(message);
		boolean isshowmessagebuttondisplayed=showmessagebutton.isDisplayed();
		System.out.println(isshowmessagebuttondisplayed);
		boolean isshowbuttonenabled=showmessagebutton.isEnabled();
		System.out.println(isshowbuttonenabled);

		String fontsizeofshowmessagebutton=showmessagebutton.getCssValue("font-size");
		System.out.println(fontsizeofshowmessagebutton);
		int xaxis=showmessagebutton.getLocation().getX();
		System.out.println(xaxis);
		int yaxis=showmessagebutton.getLocation().getY();
		System.out.println(yaxis);
		
		WebElement entervalue1=driver.findElement(By.xpath("//input[@id='value-a']"));
		entervalue1.sendKeys("12");
		WebElement entervalue2=driver.findElement(By.xpath("//input[@id='value-b']"));
		entervalue2.sendKeys("5");
		WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotalbutton.click();
		WebElement totalmessage=driver.findElement(By.xpath("//div[@id='message-two']"));
		String total=totalmessage.getText();
		System.out.println(total);
		
		/*driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean ischeckboxselected=checkbox.isSelected();
		System.out.println(ischeckboxselected);*/
				
	}
	
	public void test()
	{
		 WebElement showmessagebutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		String actualresult=showmessagebutton.getCssValue("background-color");
		System.out.println(actualresult);
		String expectedresult="rgba(0, 107, 221, 1)";
		if(actualresult.equalsIgnoreCase(expectedresult))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebelementCommands elements =new WebelementCommands();
		elements.initialiseBrowser();
		//elements.locators();
		elements.elementCommands();
		elements.test();
		//elements.driverQuit();
	}

}
