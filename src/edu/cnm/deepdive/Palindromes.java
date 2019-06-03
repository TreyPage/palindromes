package edu.cnm.deepdive;

public class Palindromes {

  public static boolean isPalindrome(String args) {
    args = args.toLowerCase().replaceAll("[^a-z0-9]+", "");
    return (args.length() <= 1 ||
        (
            args.charAt(0) == args.charAt(args.length() - 1)
                &&
                isPalindrome(args.substring(1, args.length() - 1))
        )
    );
  }

  public static void main(String[] args) {

    String blah = args[0];

    isPalindrome(blah);
    System.out.println("Original String = " + args[0]);
    System.out.println("Fixed string = " + blah);
    if (isPalindrome(blah)) {
      System.out.println("IT IS A PALINDROME!!");
    } else {
      System.out.println("It is not a palindrome...... better luck next time.");
    }
  }
}
