package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList<>());
  }
  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(1), new ArrayList<>());
  }
  @Test
  void itReturnsAnEmptyListForNegative() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(-10), new ArrayList<>());
  }
    @Test
  void itReturnsFor9() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expectedResult = new ArrayList<>();
    expectedResult.add(3);
    expectedResult.add(3);
    assertEquals(factorizer.primeFactors(9), expectedResult);
  }
   @Test
  void itReturnsFor10() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expectedResult = new ArrayList<>();
    expectedResult.add(2);
    expectedResult.add(5);
    assertEquals(factorizer.primeFactors(10), expectedResult);
  }
   @Test
  void itReturnsFor1001() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expectedResult = new ArrayList<>();
    expectedResult.add(7);
    expectedResult.add(11);
    expectedResult.add(13);
    assertEquals(factorizer.primeFactors(1001), expectedResult);
  }
}

