package projectpractice123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.leafground.com/select.xhtml");
WebElement dbElement = driver.findElement(By.className("ui-selectonemenu"));
Select option = new Select(dbElement);
option.selectByIndex(2);

	}

}
