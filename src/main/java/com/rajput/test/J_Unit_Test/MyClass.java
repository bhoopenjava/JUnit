package com.rajput.test.J_Unit_Test;

public class MyClass {
  public int multiply(int a, int b) {
    return a * b;
  }

  public int multiplyExc(int x, int y) {
    // the following is just an example
    if (x > 999) {
      throw new IllegalArgumentException("X should be less than 1000");
    }
    return x / y;
  }
}
