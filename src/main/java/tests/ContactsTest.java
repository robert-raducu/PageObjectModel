package tests;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ContactsTest extends BaseTest {

	@Test(groups = "UserManagementFunctionality")
	public void sendMessageFromContactFormTest() {
	
		app.click(app.menu.contactsLink);
		//1
		app.sendKeys(app.contacts.nameField, "Harry Potter");
		app.sendKeys(app.contacts.emailField, "harry@howgarths.com");
		app.sendKeys(app.contacts.subjectField, "Addmision");
		app.sendKeys(app.contacts.msgField, "Can I join?");
		app.click(app.contacts.submitBtn);
		
		//2
		app.contacts.sendMessage("Ion", "ion@ion.com", "Salut", "Ce mai faci?");
	
	}
	
	
}