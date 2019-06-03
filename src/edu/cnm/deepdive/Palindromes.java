package edu.cnm.deepdive;

public class Palindromes {

  public static boolean isPalindrome(String args) {
    return (args.length() <= 1 ||
        (
            args.charAt(0) == args.charAt(args.length() - 1)
                &&
                isPalindrome(args.substring(1, args.length() - 1))
        )
    );
  }

  public static String fixString(String args) {
    String lowString = args.toLowerCase();
    String bestString = lowString.replaceAll("[^a-z0-9]+", "");
    return bestString;
  }

  public static void main(String[] args) {

    String blah = args[0];
    blah = fixString(blah);

    isPalindrome(blah);
    System.out.println("" + isPalindrome(blah));
  }
}
