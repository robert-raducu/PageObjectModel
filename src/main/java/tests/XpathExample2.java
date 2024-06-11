package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class XpathExample2 extends BaseTest{

	@Test
	public void xpathExample() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//parent
		/*
		 * selectam un element pe baza elementului copil
		 * .1 --> folosind  parent::
		 * .2 --> folosind  /..
		 * 
		 */
		
		//.1 --> folosind  parent::
		driver.findElement
			(By.xpath("//a[@href='#popup_login']/parent::li[@class='menu_user_login']")).click();
		//.2 --> folosind  /..
		WebElement loginForm = driver.findElement
				(By.xpath("//ul//div[contains(@class, 'login_field')]/.."));
		
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid orange')", 
				loginForm);
		
		//child --> folosing child::  sau  /
		WebElement user = driver.findElement(By.xpath("//ul//form/child::div/child::input[@name='log']"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				user);
		
		user.sendKeys("Testceva");
		
		/*
		 * child : selecteaza elementu imediat urmator de la nodul curent pe care ma aflu
		 * 
		 * descendant: selecteaza toate elementele care se afla in interiorul nodului curent
		 * deci o relatie de parent-child continua
		 * 
		 * following: selecteaza tot dupa nodul curent (nu intra in nodul curent de la care plec
		 * ignora orice element din nod chiar daca este matching cu ce caut eu)
		 *
		 * 
		 */
		
		
		//following-sibling --> selecteaza urmatorul element care se afla in relatie de
		//rudenie de tip frate/sora (adica este la acelasi nivel ierarhic)		
		WebElement pass =  driver.findElement
				(By.xpath("//ul//input[@name='redirect_to']/following-sibling::div[contains(@class, 'pass')]/child::input"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				pass);
		
		pass.sendKeys("Nimic");
		
		
		//preceding-sibling --> selecteaza elementul de dinainte care se afla in relatie de
		//rudenie de tip frate/sora (adica este la acelasi nivel ierarhic)	
		
		WebElement forgotPass = driver.findElement
				(By.xpath("//ul//div[contains(@class, 'submit_field')]/preceding-sibling::div/child::a[@class='forgot_password']"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				forgotPass);
		
		//following: selecteaza tot dupa nodul curent (nu intra in nodul curent de la care plec
		//ignora orice element din nod chiar daca este matching cu ce caut eu)
		
		WebElement rememberMe = driver.findElement
				(By.xpath("//a[text()='123-456-7890']/following::input[@id='rememberme']"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				rememberMe);
		
		rememberMe.click();
		
		
		//preceding: selecteaza desupra nodului curent (nu intra in nodul curent de la care plec
		//ignora orice element din nod chiar daca este matching cu ce caut eu)
		
		WebElement loginBtn = driver.findElement
				(By.xpath("//div[@class='top_panel_middle']/preceding::input[@value='Login']"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				loginBtn);
		
		loginBtn.click();
	}
	
	
	
	
}