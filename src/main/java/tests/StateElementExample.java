package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class StateElementExample extends BaseTest{

	@Test
	public void staleExample() throws InterruptedException  {
		
		app.click(app.menu.shopLink);
		
		//incarca in memorie un webelement pe care il asociaza cu un id de sesiune
		WebElement sortingDropDown = driver.findElement(By.name("orderby"));
		Select select =  new Select(sortingDropDown);
		//se foloseste de webelementul de mai sus si selecteaza din lista
		select.selectByValue("date");
		//ca urmare a selectiei se face refresh la pagina
		//ca urmare a refreshului se ia alt id de sesiune
		Thread.sleep(5000);
		//FIX pentru StaleelementException este reidentificarea elementului
		//care a fost asociat cu vechea sesiune de browser
		//sortingDropDown = driver.findElement(By.name("orderby"));
		//select =  new Select(sortingDropDown);
		select.selectByIndex(2);
		
		
	}
	
	
	
}