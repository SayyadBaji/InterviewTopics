package com.practice.strings;

public class RemoveDups {
    public static void main(String[] args) {
        String input = "Bananas";
        String result = removeDups(input);
        System.out.println(result);
    }

    private static String removeDups(String input) {
        String result = ""+input.charAt(0);
        for (int i=1; i<input.length(); i++) {
            if (!result.contains(""+input.charAt(i))) {
                result += input.charAt(i);
            }
        }
        return result;
    }
}
