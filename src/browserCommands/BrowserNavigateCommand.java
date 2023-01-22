package browserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigateCommand {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    //Navigate to
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//webdriver will wait until the page loaded
        Thread.sleep(2000);
		//Backward
		driver.navigate().back(); //return nothing but move backward
		Thread.sleep(2000);
		//Forward
		driver.navigate().forward();//return nothing but goes forward
		Thread.sleep(2000);
		//Refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
	}

}
