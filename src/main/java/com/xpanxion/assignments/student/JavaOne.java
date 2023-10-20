package com.xpanxion.assignments.student;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //
    public Scanner sc = new Scanner(System.in);
    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Enter your name: ");
        System.out.println(sc.nextLine().toUpperCase());
    }

    public void ex2() {
        System.out.println("Enter a String: ");
        String string = sc.nextLine();
        int count = 0;

        for(int i = 0; i<string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))) count++;
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public void ex3() {
        System.out.println("Enter a String: ");
        String[] words = sc.nextLine().split(" ");
        boolean capital = true;

        for(int i = 0; i<words.length; i++) {
            if (capital) {
                words[i] = words[i].toUpperCase();
                capital = false;
            } else {
                words[i] = words[i].toLowerCase();
                capital = true;
            }

            System.out.print(words[i] + " ");
        }
    }

    public void ex4() {
        System.out.println("Input a an string: ");
        String word = sc.nextLine();
        boolean isPalindrome = true;
        int rightPointer = word.length()-1;

        for (int leftPointer = 0; leftPointer < word.length()/2; leftPointer++){
            if(word.charAt(leftPointer)!=word.charAt(rightPointer)){
                isPalindrome = false;
                break;
            }
            rightPointer--;
        }

        if(isPalindrome) System.out.println("YES");
        else System.out.println("NO");
    }

    public void ex5() {
        String string = "";
        int vowelsCount = 0;
        int consonantsCount = 0;
        do{
            System.out.println("Enter a string: ");
            string = sc.nextLine();
            if(string.equals("quit")) break;

            for(int i = 0; i<string.length(); i++){

                if((string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' ||
                string.charAt(i) == 'U' || string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' ||
                string.charAt(i) == 'o' || string.charAt(i) == 'u')) vowelsCount++;
                else if(Character.isLetter(string.charAt(i))) consonantsCount++;
            }

            System.out.println("Number of vowels: " + vowelsCount);
            System.out.println("Number of consonants: " + consonantsCount);
            vowelsCount = 0;
            consonantsCount = 0;

        } while(!string.equals("quit"));

    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
