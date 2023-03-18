import java.util.Scanner;

public class App {
   public static void main(String[] args) {

      int num, originalNum, remainder, result = 0, n = 0;

      try (// create Scanner object to read input from user
    Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a positive integer: ");
          num = sc.nextInt();
    }
      originalNum = num;

      // count number of digits in the number
      while (originalNum != 0) {
         originalNum /= 10;
         ++n;
      }

      originalNum = num;

      // calculate result
      while (originalNum != 0) {
         remainder = originalNum % 10;
         result += Math.pow(remainder, n);
         originalNum /= 10;
      }

      // check if the number is an Armstrong number or not
      if (result == num)
         System.out.println(num + " is an Armstrong number.");
      else
         System.out.println(num + " is not an Armstrong number.");
   }
}
