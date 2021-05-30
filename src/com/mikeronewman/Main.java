package com.mikeronewman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Welcome to my pig latin converter!");
        System.out.println("Please enter any phrase you'd like to convert then press enter to see the magic!");

        String input = scanner.nextLine();

        System.out.println("Now converting your phrase to pig latin =)");

        String pigLatinPhrase = converter.convertToPigLatin(input);

        System.out.println(pigLatinPhrase);
    }
}
