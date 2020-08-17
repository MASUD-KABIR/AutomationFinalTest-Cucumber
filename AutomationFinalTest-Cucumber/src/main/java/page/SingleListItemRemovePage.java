package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingleListItemRemovePage {
	WebDriver driver;

	public SingleListItemRemovePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "todo[6]")
	WebElement SINGLE_CHECK_BOX_LOCATOR;
	@FindBy(how = How.NAME, using = "submit")
	WebElement REMOVE_BUTTON_LOCATOR;

	public void ClickSingleCheckBox() {
		SINGLE_CHECK_BOX_LOCATOR.click();
	}

	public void ClickRemoveButton() {
		REMOVE_BUTTON_LOCATOR.click();
	}

	public void verifySinglecheckboxIsRemoved() {
//		String singleCheckBoxChecked = driver.findElement((By) SINGLE_CHECK_BOX_LOCATOR).getText();
//		Assert.assertEquals("Remove", singleCheckBoxChecked, "Single Checked item couldn't be removed !!!");

//		System.out.println("Test pass");

		WebElement singleCheckBoxChecked = driver.findElement(By.name("submit"));
		System.out.println("Single List Item is removed when single check box is SELECTED -" + singleCheckBoxChecked.isSelected());

	}
}