package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{

	public WebDriver driver;
	
	
	public ShopPage(WebDriver driver) {
		this.driver =driver;
	}
	
	
	public By sortingList = By.name("orderby");
	public By filterSliderInitialPosition = By.cssSelector("span[style='left: 0%;']");
	public By filterSliderFinalPosition = By.cssSelector("span[style='left: 100%;']");
	
	
	public void selectByValue(String value) {
		WebElement element = driver.findElement(sortingList);
		Select select = new Select(element);
		select.selectByValue(value);
		
	}
	
	public void selectByVisbileText(String value) {
		WebElement element = driver.findElement(sortingList);
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	public void selectByIndex(int index) {
		WebElement element = driver.findElement(sortingList);
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}
	
	
	
	public String getSelectedOption() {
		WebElement element = driver.findElement(sortingList);
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}
	
	
	
}