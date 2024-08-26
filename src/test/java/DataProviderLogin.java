
	 
	import org.testng.Reporter;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	 
	public class DataProviderLogin {
		@DataProvider
		public Object[][] getData()
		{
				Object[][] Data=new Object[2][2];
				Data[0][0]="UserA";
				Data[0][1]="PassA";
				Data[1][0]="UserB";
				Data[1][1]="PassB";
	 
			return Data;
		}
		@Test(dataProvider="getData")
		public void test(Object un,Object pw)
		{
			Reporter.log(un + "" + pw,true);
		}

}
