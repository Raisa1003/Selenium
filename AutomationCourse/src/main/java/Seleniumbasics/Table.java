package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base{

	public void tableactions()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println("Full table" +table.getText());
		
	}
	
	public void headings()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablehead=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead"));
		System.out.println("Table head" +tablehead.getText());
		
	}
	
	public void selectrow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody/tr[1]"));
		System.out.println("Table row" +tablerow.getText());
		
	
	}
	
	public void selectelement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tabledataselect=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody/tr[1]//td[2]"));
		System.out.println("Select table data" +tabledataselect.getText());
		
		
	}
	
	public void list()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> listname=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr//td[2]"));
		for(WebElement lists:listname)
		{
			System.out.println(lists.getText());
		}
	}
		
		public void elementsearch()
		{
			
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			String input="Garrett Winters";
			List<WebElement>list2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
			int flag=0;
			for(WebElement lists1:list2)
			{
				if(lists1.getText().equalsIgnoreCase(input))
				{
					System.out.println(lists1.getText());
					flag=1;
					break;
			    }
			}
				if(flag==1)
				{
					System.out.println("Element found");
				}
				else
				{
					System.out.println("Element not found");
				}
				
		}	
		
		      public void salary()
				{
			      driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			      List <WebElement>listsalary=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tr//td[6]"));
			      for(WebElement lists2:listsalary)
			      {
			    	  System.out.println(lists2.getText());
			      }
			System.out.println();
				}
		      
		      public void elementsearch_position()
		      {
		    	  driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
					String input1="Javascript Developer";
					List<WebElement>listsearch=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
					int flag=0;
					for(WebElement lists3:listsearch)
					{
						if(lists3.getText().equalsIgnoreCase(input1))
						{
							System.out.println(lists3.getText());
							flag=1;
							break;
					    }
					}
						if(flag==1)
						{
							System.out.println("Element found");
						}
						else
						{
							System.out.println("Element not found");
						}
		      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table table=new Table();
		table.initialiseBrowser();
		table.tableactions();
		table.headings();
		table.selectrow();
		table.selectelement();
		table.list();
		table.elementsearch();
		table.salary();
		table.elementsearch_position();
	}

}
