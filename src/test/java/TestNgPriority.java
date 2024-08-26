import org.testng.annotations.Test;

public class TestNgPriority {
	
	//lower the number, higher the priority
	//without priority it will follow alphabetical order
	@Test(priority = 3)
	public void add() {
		System.out.println("Addition");
	}
	
	@Test(priority = 1)
	public void multiply() {
		System.out.println("multiplication");
	}

	
	@Test(priority = 2)
	public void division() {
		System.out.println("Division");
	}


}
