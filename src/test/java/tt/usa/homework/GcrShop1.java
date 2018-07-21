package tt.usa.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class GcrShop1 {
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'My Account')]")
	private WebElement Account ;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'email_address')]")
	private WebElement email_address ;
	
	@FindBy(how = How.XPATH, using ="//*[contains(@name,'password')]")
	private WebElement password ;
	
	@FindBy(how = How.XPATH, using ="(//*[contains(text(),'Sign In')])[2]")
	private WebElement SignIn ;
	
	@FindBy(how = How.XPATH, using ="(//*[contains(text(),'Sign In')])[2]")
	private WebElement Submit ;
	
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'catalog')])")
	private WebElement catalog;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'new products')])")
	private WebElement NewProduct;
	
	
	

			
			

}
