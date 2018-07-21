/*
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginfunctionTest{

	public WebDriver login(WebDriver driver) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\munmu\\eclipse-workspace\\SELENIUMAUTOMATION\\Driver\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
			driver.get("http://www.gcrit.com/build3/");
			driver.manage().window().maximize();
		    WebElement myaccount= driver.findElement(By.xpath("//*[@id=\"tdb3\"]/span[2]"));
		    myaccount.click();
		   
		    WebElement email= driver.findElement(By.xpath("(//*[@name='email_address'])[1]"));
		    email.sendKeys("sarowerny@gmail.com");		
		    WebElement password= driver.findElement(By.xpath("(//*[@name='password'])"));
		    password.sendKeys("student");	
		    
		    WebElement signin= driver.findElement(By.xpath("(//*[@class='ui-button-text'])[1]"));
		    signin.click();
		    
		   
		    		
		    		
		    		
		    		
		    
		    
		    
		   
		    

	}

}
*/