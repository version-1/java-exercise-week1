package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello.  What is your name?");
    String name = scanner.next();
    System.out.println("");

    while (true) {
      System.out.println("Hi, " + name + "!  How old are you?");
      String age = scanner.next();
      System.out.println("");
      if (isNumber(age)) {
        System.out.println("So you're " + age + ", eh?  That's not old at all!");
        break;
      } else {
        System.out.println("Oops.");
      }
    }

    while (true) {
      System.out.println("How much do you make," + name + "?");
      String saraly = scanner.next();
      System.out.println("");
      if (isDouble(saraly)) {
        System.out.println(saraly + "!  I hope that's per hour and not per year! LOL!");
        break;
      } else {
        System.out.println("Oops.");
      }
    }
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

  private static boolean isDouble(String val) {
    try {
      Double.parseDouble(val);
      return true;
    } catch (NumberFormatException nfex) {
      return false;
    }
  }
}