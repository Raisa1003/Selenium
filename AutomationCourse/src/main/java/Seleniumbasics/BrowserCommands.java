package Seleniumbasics;

public class BrowserCommands extends Base {

	
	public void browsercommands()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String src=driver.getPageSource();
		System.out.println(src);
	}
	
	public void navigationcommands()
	{
		driver.navigate().to("https://www.javatpoint.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserCommands command=new BrowserCommands();
		command.initialiseBrowser();
		//command.browsercommands();
		//command.navigationcommands();
		//command.driverQuit();
	}

}
