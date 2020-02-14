package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    while (true) {
      System.out.println("I will add up the numbers you give me.");
      System.out.print("Number: ");
      String num = scanner.next();
      if (num.equals("0")) {
        break;
      }
      if (isNumber(num)) {
        sum += Integer.parseInt(num);

        System.out.println("The total so far is " + sum);
      } else {
        System.out.println("Oops.");
      }
    }
    System.out.println("\nThe total is " + sum);

    scanner.close();
  }

  private static boolean isNumber(String val) {
    try {
      Integer.parseInt(val);
      return true;
    } catch (NumberFormatException nfex) {
      return false;
    }
  }
}