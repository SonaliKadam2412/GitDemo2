package PracticeSessions;

import java.time.Duration;
//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//need to put wait as calende take few seconds to display after cliking on it
		//explicit wait
		new WebDriverWait(driver,Duration.ofSeconds(5)).until
		(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datepicker-days']")));
		selectdate(driver,"2","June","2023");
		
	}
	
	public static String[] getmonthyear(String MothyearVal)
	{
		return MothyearVal.split(" ");
	}
	
	
	public static void selectdate(WebDriver driver,String exday,String exmonth,String exyear)
	{
		if(exmonth.equals("February")&& Integer.parseInt(exday)>29)
		{
			System.out.println("Wrong date:" + exmonth + ":" + exday);
			return;
		}
		if (Integer.parseInt(exday)>31)
		{
			System.out.println("Wrong date:" + exmonth + ":" + exday);
			return;
		}
		String MothyearVal= driver.findElement(By.xpath("(//div/table/thead/tr/th[@class='datepicker-switch'])[1]")).getText();
		System.out.println(MothyearVal);
				
		while(!(getmonthyear(MothyearVal)[0].equals(exmonth)
				&& 
				getmonthyear(MothyearVal)[1].equals(exyear))){
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			MothyearVal= driver.findElement(By.xpath("(//div/table/thead/tr/th[@class='datepicker-switch'])[1]")).getText();
					 //System.out.println(MothyearVal);
					 
				}
		try {
				driver.findElement(By.xpath("//td[text()='"+exday+"']")).click();
		   }catch(Exception e)	{
			   System.out.println("Wrong date:" + exmonth + ":" + exday);
		   
		   }
			}
	

}
