package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class On_Poll_Test {
	@Test
	public void onPoll()
	{
    Reporter.log("poll class is executed",true);
   }
}
