package checkboxRadioDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonDemo {
	
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Browser is Launched");
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		System.out.println("Student registration url is opened");
	
	}
	public void demo() throws InterruptedException {
		WebElement radioBtn=driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
		radioBtn.click();
		System.out.println(radioBtn.isSelected());
		Thread.sleep(1000);
	}
	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		RadioButtonDemo obj=new RadioButtonDemo();
		obj.launchBrowser();
		obj.demo();
		obj.closeBrowser();

		

	}

}
