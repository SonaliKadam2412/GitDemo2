package PracticeSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com");
		/*driver.findElement(By.xpath("//li/a[@href=\"https://www.rahulshettyacademy.com/AutomationPractice\"]")).click();
		List<WebElement> rows =driver.findElements(By.xpath("//fieldset/table/tbody/tr"));
		System.out.println("Total Row count is: "+ rows.size() );
		List<WebElement> column = driver.findElements(By.xpath("//fieldset/table/tbody/tr/th"));
		System.out.println("Tota o of Colums are: " + column.size());
		
		List<WebElement> data = driver.findElements(By.xpath("(//fieldset/table/tbody/tr/following-sibling::tr)[2]"));
		for (int i =0 ; i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}*/
		
		//other way-limit the driver scope to that table only
		driver.findElement(By.xpath("//li/a[@href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();
		WebElement product = driver.findElement(By.xpath("//table[@name='courses']"));
		System.out.println(product.findElements(By.tagName("tr")).size());
		System.out.println(product.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> secondrow=product.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
	}

}
