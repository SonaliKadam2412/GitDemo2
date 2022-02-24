import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		////Sibling-  parent to child , child to child
		System.out.println(driver.findElement(By.xpath("//header//div//button[1]/following-sibling::button[1]")).getText());
		//parent to child, child to parent,parent to child
		System.out.println(driver.findElement(By.xpath("//header//div/button[1]/parent::div/button[2]")).getText());
		
	}

}
