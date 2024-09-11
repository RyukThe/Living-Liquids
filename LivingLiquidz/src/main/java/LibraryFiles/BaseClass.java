package LibraryFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public WebDriver driver;
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	
	
	public void openBrowser(String BrowserName)
	{
		if(BrowserName.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if(BrowserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(BrowserName.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("");
		
	}

}
