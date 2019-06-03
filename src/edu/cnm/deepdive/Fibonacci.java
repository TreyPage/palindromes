package edu.cnm.deepdive;

import java.math.BigInteger;

public class Fibonacci {

  public static BigInteger fibonacci(int n) {
    BigInteger prev = BigInteger.ONE;
    BigInteger current = BigInteger.ZERO;
    for (int i = 0; i < n; i ++) {
      BigInteger temp = prev.add(current);
      prev = current;
      current = temp;
    }
    return current;
  }
}
