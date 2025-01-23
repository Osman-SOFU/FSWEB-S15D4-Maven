package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

    }

    public static boolean checkForPalindrome(String text) {
        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);
        LinkedList<Character> charList = new LinkedList<>();

        for (char c: cleanedStr.toCharArray()){
            charList.add(c);
        }

        while (charList.size() > 1){
            if (!charList.pollFirst().equals(charList.pollLast())){
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        // Continue dividing the decimal number by 2 until it becomes 0
        while (decimal > 0) {
            // Get the remainder when dividing by 2
            int remainder = decimal % 2;
            // Prepend the remainder of the binary representation
            binary.insert(0, remainder);
            // Update the quotient for the next iteration
            decimal = decimal / 2;
        }
        // If the input decimal was 0, return "0"
        if (binary.length() == 0) {
            binary.append("0");
        }
        return binary.toString();
    }
}