package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void test2() {
		System.out.println("hellooooooooo");
		String expectedResult = "Google";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");

		String actualResult = driver.getTitle();
		System.out.println("Before assert statement");
		Assert.assertEquals(actualResult, expectedResult, "Error in page title");
		System.out.println("End of program");
	}

}
