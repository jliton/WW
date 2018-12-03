package Lib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WW {

	public static WebDriver driver;

	@Test(priority=1)
	public static void Verfication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// launch application
		driver.get("https://www.weightwatchers.com/us/");
		// verify title
		String title = driver.getTitle();
		Assert.assertEquals(title, "WW (Weight Watchers): Weight Loss & Wellness Help");
		System.out.println("Landing Page Title  Verified "+ title);
		// click on find location
		driver.findElement(By.id("ela-menu-visitor-desktop-supplementa_find-a-studio")).click();
		// verify title for find location page
		boolean titlematched = driver.getTitle().contains("Find a Studio & Meeting Near You | WW USA");
		;
		Assert.assertEquals(titlematched, true);
		System.out.println("Find a Studio & Meeting Near You | WW USA" +" Title  Verified ");
		// print out title from first result and distance
		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
		driver.findElement(By.xpath(
				"//button[@type='button' and contains(@ng-click,'mfsearch') and parent::SPAN[@class='input-group-btn']]"))
				.click();

		// Print the title of the first result and the distance
		List<WebElement> results = driver.findElements(By.className("meeting-locations-list__item"));
		WebElement firstResult = results.get(0);
		String locationTitle = firstResult.findElements(By.xpath(".//span[@ng-if='!linkName']")).get(0).getText();
		String distance = firstResult.findElements(By.xpath(".//div[@ng-if='showDistance']")).get(0).getText();

		System.out.println("The first location title is: " + locationTitle);
		System.out.println("And distance is: " + distance);
		firstResult.click();
			}	//Weekdays
	
		public static  void 	WeeeklySchedule(String Weekday) {
			
			if(Weekday.equalsIgnoreCase("SunDay")) {
				
//				List<WebElement> Schedule=driver.findElements(By.className("schedule-detailed-day"));
//				WebElement Schedules=Schedule.get(0);
//				String WeekdaysSchedule=Schedules.findElements(By.xpath("")).get(0).getText();
				System.out.println("Sunday Schedule....");
				//driver.close();
			}
				if(Weekday.equalsIgnoreCase("Monday")) {
					
//					List<WebElement> Schedule=driver.findElements(By.className("schedule-detailed-day"));
//					WebElement Schedules=Schedule.get(0);
//					String WeekdaysSchedule=Schedules.findElements(By.xpath("")).get(0).getText();
					System.out.println("Monday Schedule....");
					//driver.close();
				
				
	}
			
		}
	
	
}

