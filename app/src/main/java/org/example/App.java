package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number to find prime factors for.");
    int input = scanner.nextInt();

    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> factors = factorizer.primeFactors(input);

    System.out.println("Prime factors: " + factors);

    scanner.close();
  }
}
