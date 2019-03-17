package Railway;
import Constant.Constant;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends GeneralPage {
	//locator
	private final By cmbContinent=By.xpath("//select[@id='continents']");
	private final By txtUserName=By.name("firstname");

	//element
	public WebElement getCmbContinent() {
		return Constant.WEBDRIVER.findElement(cmbContinent);
	}
	public WebElement gettxtUserName() {
		return Constant.WEBDRIVER.findElement(txtUserName);
	}
	
	//methods
	
	public  FormPage register(String name,String continent,String sex,String year) {
		this.waitForElement(cmbContinent,10);
		this.gettxtUserName().sendKeys(name);
		Select drpContinent=new Select(this.getCmbContinent());
		drpContinent.selectByVisibleText(continent);
		drpContinent.getFirstSelectedOption().getText();
		
		List<WebElement>rdBtnSex=Constant.WEBDRIVER.findElements(By.xpath("//input[@name='sex']"));
		for (int i=0;i<=1;i++) {
			String value=rdBtnSex.get(i).getAttribute("value");
			if ( value.equals(sex)) {
				rdBtnSex.get(i).click();
			}
		}
		//Select rdBtnSex=new Select(Constant.WEBDRIVER.findElement(By.xpath("//input[@name='sex']")));
		List<WebElement>rdBtnYear=Constant.WEBDRIVER.findElements(By.xpath("//input[@name='exp']"));
		int ySize=rdBtnYear.size();
		for (int j=0;j<ySize;j++) {
			String yValue=rdBtnYear.get(j).getAttribute("value");
			if ( yValue.equals(year)) {
				rdBtnYear.get(j).click();
			}
		}
		
		
		return new FormPage();
	}
	public String getSelectedText(WebElement e) {
		Select drpElement=new Select(e); 
		String iValue=drpElement.getFirstSelectedOption().getText();
		return iValue;
	}

}
