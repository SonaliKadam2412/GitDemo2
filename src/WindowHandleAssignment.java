import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//li/a[@href='/windows']")).click();
		driver.findElement(By.xpath("//div/a[@href='/windows/new']")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		//driver.findElement(By.xpath("//div/a[@href='/windows/new']")).click();
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		

	}

}
