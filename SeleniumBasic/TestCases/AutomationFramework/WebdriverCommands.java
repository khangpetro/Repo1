package AutomationFramework;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
 import org.testng.Assert;
import Railway.FormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Common.Utilities;
import Constant.Constant;

public class WebdriverCommands {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Run before method");
		//System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath()+"/Executables/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		Constant.WEBDRIVER=new ChromeDriver();
		Constant.WEBDRIVER.manage().window().maximize();
	}
	//@AfterMethod
	public void afterMethod() {
		System.out.println("Run afterMethod");
		Constant.WEBDRIVER.quit();
	}
	@Test
	public void TC01() {
		WebDriver driver = new ChromeDriver();
		 
		// Put an Implicit wait
		Constant.WEBDRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		// Launch the URL
		//driver.get("https://translate.google.com/#en/vi/secretary");
		Constant.WEBDRIVER.navigate().to("http://toolsqa.wpengine.com/automation-practice-form");
		
		FormPage formpage=new FormPage();
		formpage.register("abc","Europe","Male","4");
		//Constant.WEBDRIVER.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		//String s=formpage.getSelectedText(formpage.getCmbContinet());
		
		String s=formpage.getSelectedText(formpage.getCmbContinent());
		System.out.println(s);

		
		//Boolean isSelected =rdBtnSex.get(0).isSelected();
				
	
	
	}	
}
