package Run_TestNG_Prog;
import org.testng.annotations.Test;

public class test1 {
	
	    @Test(priority=1)
	    public void testMethodOne() {
	        System.out.println("Test method one");
	    }
	 
	    @Test(priority=4)
	    public void testMethodTwo() {
	        System.out.println("Test method two");
	    }
	 
	    @Test(priority=3)
	    public void testMethodThree() {
	        System.out.println("Test method three");
	    }
	 
	    @Test(priority=2)
	    public void testMethodFour() {
	        System.out.println("Test method Four");
	    }
	}


