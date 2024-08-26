import org.testng.annotations.Test;

public class TestNGDependencyformethods {
	
	//lower the number, higher the priority
	//without priority it will follow alphabetical order
	@Test
	public void add() {
		System.out.println("Addition");
	}
	
	@Test
	public void multiply() {
		System.out.println("multiplication");
	}

	
	@Test(dependsOnMethods = "multiply")
	public void division() {
		System.out.println("Division");
	}


	


}
