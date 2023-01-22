package LocatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
	
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Browser is Launched");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Orange HRM url is opened");
		
		//driver.findElement(By.cssSelector("input.oxd-input oxd-input--active")).sendKeys("Admin"); //cssSelector by class tag.className
	    
		//cssSelector
		/*tag#id ===== using # symbol
		tag.className=====using . symbol
		tagName[attribute='value']===tagName[attributeName='value']
		[atributeName='value']
		[attribute1='val'][attribute='val']====and condition		
		[attribute1='val'],[attribute='val']====or condition
				
		
				example  id="txtUsername"  name="txtUsername" type= "text"
		[Attribute^='Prefix of Attribute value']====using ^symbol---- start with------------input[name^='txtU']
		[Attribute^='Suffix of Attribute value']====using$ symbol-----endWith-------------input[id$='name'
		[Attribute*='subString of Attribute value']====using *symbol ---------contains------input[id*='btn']*/
	}


	public static void main(String[] args) {
		
		CssSelectorDemo ld=new CssSelectorDemo();
		ld.launchBrowser();
		
		
	}

}
