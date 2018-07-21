package tablestepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import tablepagefactory.WebtablePageFactory;

public class Premierleague {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munmu\\eclipse-workspace\\Webtableautomations\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.premierleague.com/tables");
		
		WebtablePageFactory btn = PageFactory.initElements(driver, WebtablePageFactory.class);
		
		int num = btn.getClub().size();
		System.out.println("Total club count is: "+ num);
		
		for (int i=0; i<num; i++) {
			System.out.println(btn.getPosition().get(i).getText()+". "+ btn.getClub().get(i).getText());
		}
		for (int i=0; i<num; i++) {
			if (btn.getClub().get(i).getText().equalsIgnoreCase("Chelsea")) {
				System.out.println("Chelsea is present in the list");
			}
			if (btn.getPosition().get(i).getText().equalsIgnoreCase("6")) {
				System.out.println("Chelsea is in position: " + btn.getPosition().get(i).getText());
			}
			
		}
		
		driver.close(); 
		
		
		

	}

}
