package account;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApp {
	
     @Test
	public void testHello(){
	App test = new App();
	assertEquals("Did not print",test.helloWorld(),"Hello world");
	
	}

}
