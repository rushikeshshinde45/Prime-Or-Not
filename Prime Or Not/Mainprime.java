public class Mainprime {

    public static void main(String[] args) {
  
      int num = 31; // The number to be checked for primality.
      boolean flag = false; // A flag to track if the number is prime or not.
  
      // Iterate through numbers from 2 to half of 'num'.
      for (int i = 2; i <= num / 2; ++i) {
        // Check if 'num' is divisible by 'i'.
        if (num % i == 0) {
          flag = true; // If divisible, set the flag to true.
          break; // Exit the loop since we found a divisor.
        }
      }
  
      // Check the flag to determine if 'num' is prime or not.
      if (!flag)
        System.out.println(num + " is a prime number."); // 'num' is prime.
      else
        System.out.println(num + " is not a prime number."); // 'num' is not prime.
    }
  }
  