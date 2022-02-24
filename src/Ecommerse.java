import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver , 5);

		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		//Explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}

		
		
	
	
	
	
	
	public static void addItems (WebDriver driver,String[] itemsNeeded)
		{
		List <WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
		//System.out.println(products);
		
		for(int i=0;i<products.size();i++)
		{
			
			String[] name=products.get(i).getText().split("-");
			//format it to get actual vegetable name
			String formattedName = name[0].trim();
			//convert array into array list for easy search
			List itemsNeededlist = Arrays.asList(itemsNeeded);
		//  check whether name you extracted is present in arrayList or not-
			int j=0;
			if (itemsNeededlist.contains(formattedName))
			{
				j++;
				//click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j== itemsNeeded.length)
				{
					break;
				}
				
			}
		}
		
		}
		
		
		
		

	}


