package Week1.KeyboardInput;
import java.util.Scanner;

public class AgeInFiveYears {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Hello.  What is your name?  ");
    String name = scanner.next();
    System.out.println("");

    while (true) {
      System.out.print("Hi, " + name + "!  How old are you? ");
      String age = scanner.next();
      System.out.println("");
      if (isNumber(age)) {
        int ageAsInt = Integer.parseInt(age);

        System.out.println("Do you know that in five years you will be " + (ageAsInt + 5) + " years old?");
        System.out.println("And five years ago you were " + (ageAsInt - 5) + "! Imagine that!");
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