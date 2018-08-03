package testaccount;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import account.App;

public class TestApp {

     @Test
	public void testHello(){
	App test = new App();
	assertEquals("Did not print",test.helloWorld(),"Hello world");
	
	}

}
