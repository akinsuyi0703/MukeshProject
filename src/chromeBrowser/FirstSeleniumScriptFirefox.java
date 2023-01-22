package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScriptFirefox {
	
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Browser is Launched");
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		System.out.println("Guru 99 url is opened");
	
	}
	
	public void login(String username, String password) {
		
	   driver.findElement(By.name("uid")).sendKeys(username);
	   driver.findElement(By.name("password")).sendKeys(password);
	   driver.findElement(By.name("btnLogin")).sendKeys(Keys.ENTER);
	   System.out.println("User is logged in");
		
	}
	
	public void title() {
		String title=driver.getTitle();
		System.out.println("The title of the page is " +title);
	}
	
	public void  loginToNewTour(String username1, String password1) {
		
		driver.findElement(By.xpath("//a[text()='New Tours']")).sendKeys(Keys.RETURN);
		   driver.findElement(By.xpath("//*[@type='text']")).sendKeys(username1);
		   driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password1);
		   driver.findElement(By.xpath("//*[@type='submit']")).sendKeys(Keys.ENTER);
		   System.out.println("User is logged in");
		System.out.println("Logged out from HRL browser");
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}

	public static void main(String[] args) {
		
		FirstSeleniumScriptFirefox obj=new FirstSeleniumScriptFirefox();
		obj.launchBrowser();
		obj.login("mngr454506", "nyzejAh");
		obj.title();
		obj.loginToNewTour("mngr454506", "nyzejAh");
		//obj.closeBrowser();
		
		

	}

}
