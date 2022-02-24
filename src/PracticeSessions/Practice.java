package PracticeSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		//get links count on the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//get links ount only on footer section-->limit the scope of driver to footer section by creating subdriver
		WebElement Subdriver =driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(Subdriver.findElements(By.tagName("a")).size());
		
		//get the links count only on first column
		WebElement columndriver= Subdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on each link in column and check if all the pages are working
		for(int i=1; i< columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			 
			
		}//opens all the tabs
		
		Set<String> handles= driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
			
		
		
	}

}
