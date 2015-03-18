package com.qtpselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
*/
/**
 * Unit test for simple App.
 */
public class AppTest 
    //extends TestCase
{

	@Test
	public void testNGTest(){		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.quit();
		System.out.println("\n\nHello TestNG Test \n\n");
	}
	
	/* *//**
     * Create the test case
     *
     * @param testName name of the test case
     *//*
    public AppTest( String testName )
    {
        super( testName );
    }

    *//**
     * @return the suite of tests being tested
     *//*
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    *//**
     * Rigourous Test :-)
     *//*
    public void testApp()
    {
        assertTrue( true );
    }*/
}
