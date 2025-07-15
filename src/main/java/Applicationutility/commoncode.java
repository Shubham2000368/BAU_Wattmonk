package Applicationutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Baselibrary.BaseLibrary;

public class commoncode extends BaseLibrary {

	public void mouseHover(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		

	}

}
