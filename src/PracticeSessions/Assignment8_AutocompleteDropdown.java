package PracticeSessions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment8_AutocompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.qaclickacademy.com");
			driver.findElement(By.xpath("//li/a[@href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();
		
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			System.out.println((driver.findElement(By.xpath("//input[@id='autocomplete']"))).getAttribute("value"));
			
			
			
	
	}

}
