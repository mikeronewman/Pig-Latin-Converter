package com.mikeronewman;

public class Converter {

    public String convertToPigLatin(String input) {
        String convertedString = "";

        String[] words = input.split(" ");

        for(String word : words) {
            if(word.length() > 1) {
                char firstChar = word.charAt(0);
                char secondChar = word.charAt(1);
                char lastChar = word.charAt(word.length() - 1);
                boolean hasPunctuation = false;

                if(isPunctuation(lastChar)) {
                    word = word.substring(0, word.length() - 1);
                    hasPunctuation = true;
                }

                if(isVowel(firstChar)) {
                    word = word + "way";
                }
                else if(!isVowel(firstChar) && isVowel(secondChar)) {
                    word = word.substring(1) + word.substring(0, 1) + "ay";
                }
                else if(!isVowel(firstChar) && !isVowel(secondChar)) {
                    word = word.substring(2) + word.substring(0, 2) + "ay";
                }

                if(hasPunctuation) {
                    word += lastChar;
                }

                if(Character.isUpperCase(firstChar)) {
                    word = word.toLowerCase();
                    char newCapsFirstChar = Character.toUpperCase(word.charAt(0));
                    word = newCapsFirstChar + word.substring(1);
                }
            }
            convertedString += word + " ";
        }

        return convertedString;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isPunctuation(char ch) {
        return ch == ',' || ch == '.' || ch == '!' || ch == '?' || ch == ':' || ch == ';';
    }

}
