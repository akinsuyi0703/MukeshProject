package browserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandDemo {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize(); // return nothing but maximize the window
		
		//Delete Cookies
		driver.manage().deleteAllCookies(); //return nothing but delete all cookies before start any test on browser
		
		//Get command
		
		driver.get("http://www.seleniumframework.com/Practiceform/"); //return nothing but navigate to new browser window
		
		//Get title
		String title=driver.getTitle();//return the title of the current page
		System.out.println(title);
		
		//Get currentUrl
		String currenturl=driver.getCurrentUrl();//return the url of page currently loaded in a browser
		System.out.println(currenturl);
		if(currenturl.equals("http://www.seleniumframework.com/Practiceform/")) { //verify currentURL with if condition
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
		
		//Get PageSource
		String pageSource=driver.getPageSource(); //return pagesourse of the current webpage
		System.out.println("Page Source "+pageSource);
		Thread.sleep(3000);
		driver.findElement(By.id("button1")).click();
		
		//Close Command
		//driver.close();// it return nothing but close the current window
		
		//Quit command
		driver.quit();//it return nothing but close all the associated windows open
		
		
		

	}

}
