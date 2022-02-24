package PracticeSessions;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab_NewWindow_SameDriverInstance {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//Still driver scope is in same pge only even aftwr opwning new tab
		
		
		Set<String> Handles = driver.getWindowHandles();
		Iterator<String> it = Handles.iterator();
		String ParentId= it.next();
		String ChildId= it.next();
		driver.switchTo().window(ChildId);
		driver.get("https://rahulshettyacademy.com/");
		String Element =driver.findElements(By.cssSelector("h2 a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(0).getText();
		driver.switchTo().window(ParentId);
		WebElement  name = driver.findElement(By.cssSelector("form div input[name='name']"));
		name.sendKeys(Element);
		
		//get the weelement screenshot 
		File file =name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new  File("logo.png"));
		//driver.quit();

		
		//get Height and width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		driver.quit();
	}

}
