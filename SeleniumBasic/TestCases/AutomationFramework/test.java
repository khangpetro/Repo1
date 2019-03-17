package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.*;

import Common.Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.*;
import org.testng.*;
import org.testng.annotations.Test;
public class test {

	@Test
	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
 
		// Launch the Online Store WebSite
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
 
		// Click on "Partial Link Text" link
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Test Pass");
 
		// Convert element in to a string 
		String sClass = driver.findElements(By.tagName("button")).toString();
		System.out.println(sClass);
 
		// Click on "Link Text" link
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Link Test Pass");
		}
	}


