import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//get the count of no of frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//swtich to frme using index
		driver.switchTo().frame(0);
		
		//sitch frame using webelement
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		driver.findElement(By.xpath("//div[@id='draggable']")).click();
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//drag n drop
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		//comeout of frame
		driver.switchTo().defaultContent();
		

	}

}
