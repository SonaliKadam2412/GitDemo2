import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "sonali";
		String Password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello " + name + ",");
		driver.findElement(By.xpath("//button[text()= 'Log Out']")).click();
		driver.close();
	}
	public static String getpassword(WebDriver driver)
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext=(driver.findElement(By.cssSelector("form p ")).getText());
		//passwordtext= Please use temporary password 'rahulshettyacademy' to Login.
		String[] passarrey1= passwordtext.split("'");
		//passarreay1:[0]= Please use temporary password
		//passarreay1:[1]= rahulshettyacademy' to Login.
		String [] passarrey2= passarrey1[1].split("'");
		String Password = passarrey2[0];
		return Password;
		
		
		
	
		
	}

}
