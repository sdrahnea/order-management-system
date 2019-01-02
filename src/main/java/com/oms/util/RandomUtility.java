package com.oms.util;

import java.util.Random;

public class RandomUtility {

  private final static String [] vocaleChars = {"e", "y", "u", "i", "o", "a"};
  private final static String [] consonantChars = {"q", "w", "r", "t", "p", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};

  public static String generatePhone(){
    return generatePhone(0);
  }

  public static String generatePhone(int length) {
    length = (length == 0) ? 12 : length;

    String number = "";
    for (int i = 0; i < length; i++){
      number += generateNumber(0, 9);
    }
    return number;
  }

  public static String generatWord() {
    return generatWord(0, 0);
  }

  public static String generatWord(int minLength, int maxLength) {
    minLength = (minLength == 0) ? 3 : minLength;
    maxLength = (maxLength == 0) ? 11 : maxLength;
    int wordLength = generateNumber(minLength, maxLength);
    int vlength = vocaleChars.length;
    int clength = consonantChars.length;

    String word = "";
    for (int i = 0; i < wordLength; i++){
      int vi = generateNumber(0, vlength);
      int ci = generateNumber(0, clength);
      word += (consonantChars[ci] + vocaleChars[vi]);
    }
    return word;
  }

  public static String generateEmail(){
    String email = generatWord();
    String address = generatWord();
    String domain = generatWord(2, 3);
    return email + "@" + address + "." + domain;
  }

  public static String generateSentence() {
    int max = generateNumber(5, 10);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < max; i++) {
      sb.append(generatWord()).append(" ");
    }
    return sb.toString();
  }

  public static int generateNumber(int min, int max) {
    max = max - 1;
    Random r = new Random();
    int number = r.nextInt((max - min) + 1) + min;
    return number;
  }

}
