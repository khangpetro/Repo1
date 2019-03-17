package Railway;


import org.openqa.selenium.*;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralPage {
	//Locator
	//Element
	//Methods
	public WebElement waitForElement( By by,int timeout) {
			WebDriverWait wait= new WebDriverWait(Constant.WEBDRIVER,timeout);
			return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	
		}	
	
}
