package org.rahulshettyacademy.ExtentReports;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World 1 " );
        System.out.println( "Hello jayesh" );
        System.out.println( "Hello gaurav" );
   
    }
    
    
	
	@Test
	public void intialDemo() {
		
		
	ExtentTest test =	extent.createTest("initial Demo");
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
	//	test.fail("Result Do Not Match");
		
		extent.flush();
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
