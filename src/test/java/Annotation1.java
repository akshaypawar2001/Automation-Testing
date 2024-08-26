import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotation1 {

	@BeforeSuite
	public void test() {
		System.out.println("this execute before suite");
	}
	@BeforeClass
	public void test1() {
		System.out.println("this execute before suite");
	}
	@BeforeMethod
	public void test2() {
		System.out.println("this execute before suite");
	}

	@BeforeTest
	public void test3() {
		System.out.println("this execute before suite");
	}

	
	@AfterSuite
	public void test4() {
		System.out.println("this execute before suite");
	}
	@AfterClass
	public void test5() {
		System.out.println("this execute before suite");
	}
	@AfterMethod
	public void test6() {
		System.out.println("this execute before suite");
	}

	@AfterTest
	public void test7() {
		System.out.println("this execute before suite");
	}

}
