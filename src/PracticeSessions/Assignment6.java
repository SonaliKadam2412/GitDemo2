package PracticeSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		// String checkboxval= driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getText();
		 //System.out.println(checkboxval);
		 	
		 driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		 String  checkboxval = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		 System.out.println(checkboxval);
		 WebElement dropdown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText(checkboxval);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(checkboxval);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		String alertest= driver.switchTo().alert().getText();
		
		if(alertest.contains(checkboxval))
		{
			System.out.println("Alert msg success");
		}
		else
			System.out.println("Something wrong with execution");
		

	}

}
