package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest extends TestNGBase {
	@Test
	public void elementCommands() {
		String input = "Hello";
		WebElement singleinputfield = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputfield.sendKeys(input);
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[text()='Show Message']"));
		showmessagebutton.click();
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualresult = yourmessage.getText();
		System.out.println(actualresult);

		String expectedresult = "Your Message : " + input;
		Assert.assertEquals(expectedresult, actualresult,
				"Expected Result is :" + expectedresult + " but it is " + actualresult);

		boolean isshowmessagedisplayed = showmessagebutton.isDisplayed();
		Assert.assertTrue(isshowmessagedisplayed, "Show message is not available");

		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobuttonmale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean isradiobuttonselectedforceclick = radiobuttonmale.isSelected();
		Assert.assertFalse(isradiobuttonselectedforceclick, "radio button is seleted before click");
		radiobuttonmale.click();
		boolean isradiobuttonselectedafterclick = radiobuttonmale.isSelected();
		// Assert.assertFalse(isradiobuttonselectedafterclick,"radio button is not
		// selected");
		Assert.assertTrue(isradiobuttonselectedafterclick, "radio button is not selected");

		int a = 10;
		int b = 20;
		Assert.assertNotEquals(a, b, "a and b are equal");

		String s = null;
		Assert.assertNull(s, "string is not null");
		// String sh="hello";
		// Assert.assertNull(sh,"string is null");
	}

	@Test
	public void verifysoftAssert() {
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[text()='Show Message']"));
		boolean isshowmessagedisplayed = showmessagebutton.isDisplayed();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(isshowmessagedisplayed, "Show mwssage button is not displayed");
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobuttonmale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean isradiobuttonselectedforceclick = radiobuttonmale.isSelected();
		softassert.assertFalse(isradiobuttonselectedforceclick, "radio button is not selected");
		softassert.assertAll();

	}
}