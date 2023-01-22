package webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//WebElements command
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
		//driver.findElement(By.linkText("Forgot your password? ")).click();
		//Thread.sleep(2000);
		
		String str=driver.findElement(By.linkText("Forgot your password? ")).getText(); //it return the visible text of this element
		System.out.println(str);
	    
		boolean d=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/h5")).isDisplayed();//return boolean value
		boolean e=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/h5")).isEnabled();//return boolean value
		boolean s=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/h5")).isSelected();//return boolean value
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(s);
		
		String id=driver.findElement(By.name("username")).getAttribute("id");
		System.out.println(id);
		
		String css=driver.findElement(By.name("username")).getCssValue("cssValue");//return the css of the element in the webpage
		System.out.println(css);
		
		driver.close();

	}

}
