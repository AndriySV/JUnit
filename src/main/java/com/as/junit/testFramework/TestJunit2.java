package com.as.junit.testFramework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit2 {

   String message = "Robert";	
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,message);
   }
}