package eWise;

import java.util.*;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dataScraper {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		WebDriverWait waitElement = new WebDriverWait(driver, 10);
		
		waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Silence of the lamb\n");
		element.submit();

		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

		List<WebElement> findElements = driver.findElements(By.xpath("//h3/a"));

		int limit = 0;
		for (WebElement webElement : findElements)
		{
			if(limit < 10){
				System.out.println(webElement.getAttribute("href"));
				limit++;
			} else
				break;
		}

	}	

}