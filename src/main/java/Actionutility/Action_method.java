package Actionutility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.BaseLibrary;

public class Action_method extends BaseLibrary {

	public Action_method() {
		PageFactory.initElements(driver, this);
	}

	public void ScrollElement() {
		try {

			WebElement element = driver.findElement(By.id("elementID"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);

			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Error in ScrollElement: " + e.getMessage());
		}
	}
}
