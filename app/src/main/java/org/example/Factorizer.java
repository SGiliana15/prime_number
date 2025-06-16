package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    // Implement your code here!
   ArrayList<Integer> factors = new ArrayList<>();

    int divisor = 2;
    while (n > 1){
      while (n % divisor == 0){
        n /= divisor;
        factors.add(divisor);
      }
      divisor++;
    }
    return factors;
  }
}
