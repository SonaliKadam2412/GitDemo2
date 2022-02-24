import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("fsfb");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Miscelleanous.getScreenshot(driver);
		
	

	}

	public static void getScreenshot(WebDriver driver) {
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium webdriver");
		

		
	}

}
