package com.rajput.test.J_Unit_Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyParameterizedClassTest {
  int multiplierA, multiplierB, result;
  MyClass myClass;

  public MyParameterizedClassTest(int multiplierA, int multiplierB, int result) {
    this.multiplierA = multiplierA;
    this.multiplierB = multiplierB;
    this.result = result;
  }
  
  @Before
  public void initializer() {
    myClass = new MyClass();
  }

  @Parameters
  public static Collection<Object[]> parameters() {
    /*
     * return new ArrayList<Object[]>(){ { add(new Object[]{10, 0}); } };
     */
    return Arrays.asList(new Object[][] { { 0, 0 , 0 }, { 0, 10, 0 }, { 10, 0, 0 }, { 10, 10, 100 } });
  }

  @Test
  public void multiplicationOfZeroIntegersShouldReturnZero() {
    int result = myClass.multiply(multiplierA, multiplierB);
    Assert.assertEquals(this.result, result);
    System.out.println(multiplierA + " * " + multiplierB + "= " + result); 
  }
}
