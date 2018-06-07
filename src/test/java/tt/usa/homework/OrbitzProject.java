package tt.usa.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzProject {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\munmu\\eclipse-workspace\\SELENIUMAUTOMATION\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		if (driver.getTitle().equalsIgnoreCase("https://www.orbitz.com/")) {
			
		System.out.println("Test passed");
		
			
		}
		
		else {
			System.out.println("Test failed");
		}
		
		WebElement account = driver.findElement(By.xpath("(//*[contains(@id,'header-account-menu')])[1]"));
		account.click();
		
		WebElement signIn = driver.findElement(By.xpath("//*[contains(@id,'header-account-signin-button')]"));
		signIn.click();
		
		WebElement email = driver.findElement(By.xpath("//*[contains(@id,'signin-loginid')]"));
		email.sendKeys("applicationtesttt@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[contains(@id,'signin-password')]"));
		password.sendKeys("application");
		
		WebElement submit = driver.findElement(By.xpath("//*[contains(@id,'submitButton')]"));
		submit.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
