package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScriptChrome {
	
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Browser is Launched");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Orange HRM url is opened");
	
	}
	
	public void login() {
		
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   System.out.println("User is logged in");
		
	}
	
	public void title() {
		String title=driver.getTitle();
		System.out.println("The title of the page is " +title);
	}
	
	public void  logout() {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//*[text()='Logout']")).click();
		System.out.println("Logged out from HRL browser");
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}

	public static void main(String[] args) {
		
		FirstSeleniumScriptChrome obj=new FirstSeleniumScriptChrome();
		obj.launchBrowser();
		obj.login();
		obj.title();
		obj.logout();
		obj.closeBrowser();
		
		

	}

}
