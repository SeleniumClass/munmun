package tt.usa.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GcrShop {
	/*
	private static final TimeUnit TimeUnit = null;
	private static final String Seconds = null;*/

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munmu\\eclipse-workspace\\SELENIUMAUTOMATION\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		WebElement account = driver.findElement(By.xpath("(//*[contains(@class,'ui-button-text')])[6]"));
		account.click();
		
		/*WebElement signIn = driver.findElement(By.xpath("((//*[contains(@ type,'text')])[13]"));
		signIn.click();*/		
		WebElement email = driver.findElement(By.xpath("//*[contains(@ name,'email_address')]"));
		email.sendKeys("sarowerny@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[contains(@ name,'password')]"));
		password.sendKeys("student");
		
		WebElement submit = driver.findElement(By.xpath("(//*[contains(@ class,'ui-button-text')])[10]"));
		submit.click();
		
		WebElement catalog = driver.findElement(By.xpath("(//*[contains(@ class,'headerNavigation')])[2]"));
		catalog.click();
		
		
		WebElement newProduct = driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a/u"));
		newProduct.click();
	
		WebElement displaying = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div/div/div/span[2]"));
		displaying.click();
	
		
		
	} 

	
}
