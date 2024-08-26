import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumforTestNgParameter {
@Test
@Parameters({"a","b"})

public void sum(int c,int d) {
	int sum=c+d;
	System.out.println(sum);
}
}
