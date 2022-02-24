import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Actions a= new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement Hello = driver.findElement(By.id("twotabsearchtextbox"));
		
		//hovering the mouse/right click
		a.moveToElement(move).contextClick().build().perform();
		
		//composite action-hovering the elemnt(movinf to element)-click-type in cpas/selecttext(double click)
		a.moveToElement(Hello).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		

	}

}
