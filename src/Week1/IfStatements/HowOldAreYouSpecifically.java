package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
    String name = scanner.next();
    System.out.println("");

    while (true) {
      System.out.print("Ok, " + name + "!  How old are you? ");
      String age = scanner.next();
      System.out.println("");
      if (isNumber(age)) {
        int ageAsInt = Integer.parseInt(age);
        if (ageAsInt < 16) {
          System.out.println("You can't drive.");
        } else if (ageAsInt >= 16 && ageAsInt <= 17) {
          System.out.println("You can drive but not vote.");
        } else if (ageAsInt >= 18 && ageAsInt <= 24) {
          System.out.println("You can vote but not rent a car.");
        } else {
          System.out.println("You can do pretty much anything.");
        }
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
}