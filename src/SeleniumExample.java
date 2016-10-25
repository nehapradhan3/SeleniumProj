import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
public class SeleniumExample{
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","../home/neha/Downloads/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement ele:links)
			System.out.println(ele.getAttribute("href"));
	}
}