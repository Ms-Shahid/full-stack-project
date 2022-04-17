import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUtil {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		String message = "Junit testing";
		assertEquals(message, messageUtil.printMessage());
	}
	
}
