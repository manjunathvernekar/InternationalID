package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;	
	
	public WebDriver InitializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\BMSAutomation\\International\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		
	if(browsername.contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BMSAutomation\\International\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	else if(browsername.contains("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\BMSAutomation\\International\\Browser\\geckodriver.exe");
		driver = new ChromeDriver();
	}
	else
	{
		System.setProperty("webdriver.gecko.driver", "D:\\BMSAutomation\\International\\Browser\\geckodriver.exe");
		driver = new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	return driver;
	}
	
	

}
