package com.rajput.test.J_Unit_Test;

import org.junit.Assert;
import org.junit.Test;

public class MyTestFirst {
  @Test
  public void multiplicationOfZeroIntegersShouldReturnZero() {

    // MyClass is tested
    MyClass tester = new MyClass();

    // Tests
    Assert.assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
    Assert.assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
    Assert.assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExceptionIsThrown() {
    MyClass tester = new MyClass();
    tester.multiplyExc(1000, 5);
  }
}
