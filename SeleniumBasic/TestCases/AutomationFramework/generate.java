package AutomationFramework;

import org.openqa.selenium.*;

public class generate {
	
	
	
//	String locator=generateXpath("Sài Gòn","Nha Trang");
//	public final By link=By.xpath(locator);
		
	public WebElement getlink(String depart,String arrive) {
		String path="//td[text()='"+depart+"']//following-sibling::td[text()='"+arrive+"']/..//a[contains(@href,'Price')]";
		WebElement link=Constant.Constant.WEBDRIVER.findElement(By.xpath(path));
		return link;
	}
	
//	public static String generateXpath(String depart,String arrive) {
//	
//	
//	String xpath="//td[text()='"+depart+"']//following-sibling::td[text()='"+arrive+"']/..//a[contains(@href,'Price')]";
//		return xpath;	
//	}
//	
	
	
	//td[text()='Nha Trang']//following-sibling::td[text()='Sài Gòn']/..//a[contains(@href,'Price')]
	
	
	
	// Methods
	
}
