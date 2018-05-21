package edu.cnm.deepdive;

/**
 * This is the class containing the main entry point for the (eventual) RPN calculator.
 * 
 * @author ivane
 * @version 0.1
 */
public class Summation {

  /**
   * Command-line entry point for RPN interpreter.
   * 
   * @param args operands and operators.
   */
  public static void main(String[] args) {

    int sum = 0;

    int i = 0;
    while (i < args.length) {
      args[i] = args[i].trim();
      int val = Integer.parseInt(args[i]);
      sum = sum + val;
      i++;
    }
    System.out.println(sum);
  }

}
