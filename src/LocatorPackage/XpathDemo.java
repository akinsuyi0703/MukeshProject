package LocatorPackage;

public class XpathDemo {

	public static void main(String[] args) {
		
		/*syntax of xpath
		 * Absolute xpath ---starting from the root node start with single /
		 * Relative xpath-----start from the middle node and start with //
		 * 
		 * e.g-- tagname[@attribute='value']----//div[@id='txtUsername']
		 *tagname[@attribute='value']/tagname--- //div[@id='txtUsername']/input-----combination of absolute and relative expect
		 * 
		 * Contains() is a function used in xpath expression when the value of attribute changes dynamically 
		 * e.g //*[contains(@type, 'user')]
		 * or operator
		 * tagname[@attribute='value' or @attribute='value'] using two attribute any of the two should be correct
		 *--//input[@id,'txtUsername'][//input[@name='txtUsername'] two attribute seperated with pipeline operator
		 *
		 *and operator
		 *----//input[@id='txtPassword' and @type='password'] this two should be satify for it to work correctly
		 *
		 *start with function
		 *---//*[starts-with(@id,'txtPass')]
		 *
		 *text() function
		 *----//a[text()='Forgot your password?']
		 *
		 *
		 */
	

	}

}
