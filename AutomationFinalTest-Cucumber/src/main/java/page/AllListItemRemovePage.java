package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.After;
import util.BrowserFactory;

public class AllListItemRemovePage {
	WebDriver driver;

	public AllListItemRemovePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "allbox") WebElement CHECK_BOX_LOCATOR;
	@FindBy(how = How.NAME, using = "submit") WebElement REMOVE_BUTTON_LOCATOR;

	public void ClickCheckBox() {
		CHECK_BOX_LOCATOR.click();
	}
	public void ClickRemoveButton() {
		REMOVE_BUTTON_LOCATOR.click();
	}
	public void verifyAllListItemsAreRemoved() {
		List<WebElement> toggelAllCheckBoxChecked = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertTrue("AllCheckbox are not removed!", toggelAllCheckBoxChecked.isEmpty());
		System.out.println("Test pass");

}
	@After
	public void close() {
		BrowserFactory.tearDown();
	}

}
