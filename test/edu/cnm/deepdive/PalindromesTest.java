package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  @Test
  void isPalindrome() {
    boolean actual;
    actual = Palindromes.isPalindrome("radar");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("away");
    assertFalse(actual);

    actual = Palindromes.isPalindrome("racecar");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("eeee");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("a");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("eve");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("hi");
    assertFalse(actual);

    actual = Palindromes.isPalindrome("eve is eve");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("1234");
    assertFalse(actual);

    actual = Palindromes.isPalindrome("deified");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("92139455493129");
    assertTrue(actual);

    actual = Palindromes.isPalindrome("9070120709");
    assertFalse(actual);
  }

  @Test
  void fixString() {
    String actual;
    actual = Palindromes.fixString("ERTYHB$%^&");
    assertEquals("ertyhb", actual);

    actual = Palindromes.fixString("aawsdefrgtyhjuhbgvfcdf");
    assertEquals("aawsdefrgtyhjuhbgvfcdf", actual);

    actual = Palindromes.fixString("!@#$%^&");
    assertEquals("", actual);

    actual = Palindromes.fixString("AZESBHJ");
    assertEquals("azesbhj", actual);

    actual = Palindromes.fixString("");
    assertEquals("", actual);
  }
}