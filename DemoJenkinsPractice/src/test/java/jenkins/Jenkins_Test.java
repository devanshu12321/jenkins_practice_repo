 package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jenkins_Test 
{
	@Test
	public void test()
	{
		Reporter.log("jenkins test is executed ", true);
		Reporter.log("Jenkins test is updated ",true);
	}
	

}
