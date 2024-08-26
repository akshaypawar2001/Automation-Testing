import org.testng.annotations.Test;

public class TestNgDependencyForGroups {
	
	//lower the number, higher the priority
	//without priority it will follow alphabetical order
	@Test(groups ="Smoke")
	public void add() {
		System.out.println("Addition");
	}
	
	@Test(groups ="Smoke")
	public void multiply() {
		System.out.println("multiplication");
	}

	
	@Test(dependsOnGroups = "Smoke")
	public void division() {
		System.out.println("Division");
	}


	


}