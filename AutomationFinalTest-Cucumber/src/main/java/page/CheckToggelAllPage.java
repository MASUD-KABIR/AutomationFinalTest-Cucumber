package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckToggelAllPage {

	WebDriver driver;

	public CheckToggelAllPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "allbox") WebElement CHECK_BOX_LOCATOR;

	public void ClickCheckBox() {
		CHECK_BOX_LOCATOR.click();
	}

}
