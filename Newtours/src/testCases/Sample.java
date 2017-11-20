package testCases;

import org.testng.annotations.Test;

public class Sample {

	@Test
	public void test1() {
		Hello.addTwoNumbers(10, 20);
	}

	@Test
	public void test2() {
		System.out.println("not specified");
		System.out.println("My First Change");
	}

}
