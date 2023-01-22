package checkboxRadioDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxDemo {
	
WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Browser is Launched");
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		System.out.println("Student registration url is opened");
	
	}
	public void demo(String hobby) throws InterruptedException {
	//public void demo() throws InterruptedException {
		/*WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox' and @value='Drawing']"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
		Thread.sleep(1000);*/
		List<WebElement>list=driver.findElements(By.xpath("//input[@type='checkbox' and @name='Hobby']"));
		
		for(int i=0; i<list.size();i++) {
			WebElement ele=list.get(i);
			String checkboxValue=ele.getAttribute("value");
			//System.out.println("All the values are: "+checkboxValue);
			//if(checkboxValue.contains("Dancing")) {
			if(checkboxValue.contains(hobby)) {
				ele.click();
				break;
			}
			
		}
	}
	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		CheckboxDemo obj=new CheckboxDemo();
		obj.launchBrowser();
		obj.demo("Singing");// checkbox dynamically through parameterised
		//obj.demo();
		obj.closeBrowser();

		

	
		
		

	}

}
