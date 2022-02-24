import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		WebElement adult = driver.findElement(By.xpath("//select[@class='bc-neutral-100 bg-transparent']"));
		Select dropdown = new Select(adult);
		dropdown.selectByIndex(3);
		 WebElement children = driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
		 Select dd2 = new Select(children);
		 dd2.selectByVisibleText("1");
		 WebElement Infant = driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[3]"));
		 Select dd3 = new Select(Infant);
		 dd3.selectByValue("1");
		 //calender
		 driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected DayPicker-Day--today']")).click();
		 String Text= "Indigo";
		 driver.findElement(By.xpath("//a[@class='td-none hover:td-underline px-4 mt-1 weak']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys(Text);
		 driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)");
		 
		 String errormsg = driver.findElement(By.xpath("//span[text()='Select Departure and Arrival airports/cities.']")).getText();
		 System.out.println(errormsg);
		 
		 
		
		
		

	}

}
