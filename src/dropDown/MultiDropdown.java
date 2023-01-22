package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown {
	
WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Browser is Launched");
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		System.out.println("Student registration url is opened");
	
	}
	
	public void multiSelectDemo() throws InterruptedException {
		
		WebElement multiSelectList=driver.findElement(By.id("multi-select"));
		Select sel=new Select(multiSelectList);
		sel.selectByValue("Florida");
		sel.deselectByValue("Florida");
		sel.selectByVisibleText("New Jersey");
		sel.selectByIndex(4);
		sel.deselectByIndex(4);
		
		List<String> expectedList=new ArrayList<>();
		expectedList.add("Florida");
		expectedList.add("New Jersey");
		expectedList.add("Califonia");
		
		List<String> actualList=new ArrayList<>();
		
		List<WebElement> allSelectedOptions=sel.getAllSelectedOptions();
		
		  for(WebElement ele:allSelectedOptions) {
			  
			  actualList.add(ele.getText());
			  System.out.println(ele.getText());
			  
		  }
		  //how to sort unorder list
		  Collections.sort(expectedList);
		  Collections.sort(actualList);
		  
		  boolean result=actualList.equals(expectedList);
		  System.out.println("The result of Comparison id: "+result);
		
	}

	public static void main(String[] args) {
		

	}

}
