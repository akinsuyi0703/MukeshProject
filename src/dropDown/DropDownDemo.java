package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	
WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Browser is Launched");
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		System.out.println("Student registration url is opened");
	
	}
	
	public void dropDownDemo() throws InterruptedException {
		
		WebElement ele=driver.findElement(By.id("Birthday_Day"));
		WebElement ele1=driver.findElement(By.id("Birthday_Month"));
		WebElement ele2=driver.findElement(By.id("Birthday_Year"));
		
		Select sel=new Select(ele);
		Select sel1=new Select(ele1);
		Select sel2=new Select(ele2);
		
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel1.selectByValue("February");
		Thread.sleep(2000);
		sel2.selectByVisibleText("1990");
		Thread.sleep(2000);
		
		WebElement firstSelectedItem=sel1.getFirstSelectedOption();
		System.out.println(firstSelectedItem.getText());
		
		 
		
		//print all value from dropdown
		List<WebElement>monthList=sel1.getOptions();
		
		System.out.println("Totalmonth " +monthList.size());
		
		 for(WebElement ele3:monthList) {
			 System.out.println(ele3.getText());
			 
		 }
	}
	
	public void tearDown() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		DropDownDemo obj = new DropDownDemo();
		obj.launchBrowser();
		obj.dropDownDemo();
		obj.tearDown();
	
 
	}

}
