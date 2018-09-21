package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "abcdefg";
        System.out.println("input = "+input);
        System.out.println("oddCharacters = "+oddCharacters(input));
        System.out.println("evenCharacters = "+evenCharacters(input));
        System.out.println("evenFirstOddSecond "+evenFirstOddLast(input));
    }

    private static String evenFirstOddLast(String input) {
        return evenCharacters(input) + oddCharacters(input);
    }

    private static String evenCharacters(String input) {
        int index = 2;
        String output = "";
        while(index < input.length())
        {
            output = output + input.substring(index, index +1);
            index = index +2;
        }
        return output;
    }

    private static String oddCharacters(String input) {
        int index = 1;
        String output = "";
        while(index < input.length())
        {
            output = output + input.substring(index, index +1);
            index = index +2;
        }
        return output;
    }
}
