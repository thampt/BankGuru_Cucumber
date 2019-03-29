package common;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	public void clickElement(WebDriver driver, String locator) {

	}

	public void openUrl(WebDriver driver, String url) {
		driver.get(url);
	}

}
