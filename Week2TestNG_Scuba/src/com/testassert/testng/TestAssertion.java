package com.testassert.testng;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertion {
	private static final boolean True = false;
	String message = "Mageswaran";
    MessageUtil messageUtil = new MessageUtil(message);
    
    @Test
    public void testPrintMessage() {
       Assert.assertEquals("Mageswaran", messageUtil.printMessage());
       Assert.assertTrue(false);
       Assert.assertFalse(True);
       Assert.assertNotEquals("Mageswaran", messageUtil.printMessage());
       
       
    }

}
