import java.util.*;

public class PowerOf2 {
 
 public static void main(String[] args) {
    
    System.out.println("enter a number to check: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if (checkNumber(number)) {
      System.out.println("is a power of 2");
    } else {
      System.out.printf("is not a power of 2");
    }
  }

  private static boolean checkNumber(int number) {

    if (number % 2 != 0) {
      return false;
    } 
    else 
       {
        for (int i = 0; i <= number; i++) {
        if (Math.pow(2, i) == number) {
          return true;
        }
      }
    }
    return false;
  }
}
