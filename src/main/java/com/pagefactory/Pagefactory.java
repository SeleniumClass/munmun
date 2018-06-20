package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pagefactory {
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Account')])")
	private WebElement myAccount;

		@FindBy(how = How.XPATH, using = "(//*[contains(name,'email_address')])")
		private WebElement email_address;

			@FindBy(how = How.XPATH, using = "(//*[contains(name,'password')])")
			private WebElement password;
			
				@FindBy(how = How.XPATH, using = "(//*[contains(@class,'ui-button-text')][10]]")
				private WebElement SignIn;

				public WebElement getMyAccount() {
					return myAccount;
				}

				public WebElement getEmail_address() {
					return email_address;
				}

				public WebElement getPassword() {
					return password;
				}

				public WebElement getSignIn() {
					return SignIn;
				}

					
				
	
		
	}


	


