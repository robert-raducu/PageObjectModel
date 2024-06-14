package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class HomePage extends SeleniumWrappers{

	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By chooseBookText = By.xpath("//h4[em='Choose']");
}
