package PracticeSessions;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Broken_Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PARICHA KADAM/eclipse-workspace/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Get all the  url's tied up to  the  link using selenium
		//Jaa methods will call the URLs and get you  the status code
		//if status code > 400 then URL is not working-->link which tied to URL is broken
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link  :links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection	conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rescode= conn.getResponseCode();
			System.out.println(rescode);
			a.assertTrue(rescode<400, "Trescodehe link with" + link.getText()+"is broken with code: " + rescode);
			
			/*if(rescode>400)
			{
				System.out.println("Trescodehe link with" + link.getText()+"is broken with code: " + rescode);
				Assert.assertTrue(false);
			}*/
		}
		a.assertAll();
	}
}
		
		
		
		
		
	


