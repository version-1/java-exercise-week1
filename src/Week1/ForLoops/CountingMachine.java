package Week1.ForLoops;
import java.util.Scanner;

public class CountingMachine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Count to:  ");
      String upto = scanner.next();
      if (isNumber(upto)) {
        int uptoAsInt = Integer.parseInt(upto);

        for (int i = 0; i <= uptoAsInt; i++) {
          System.out.print(i + " ");
        }
        System.out.println("");

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