package assignments.exercise;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Deaja Murphy
 */


/*
 * Create String to store input
 * Create int to count strings
 * Print Statement asking for string
 * Take user input into String
 * loop through string to count characters
 * Print final output with the number of characters
 */

import java.util.Scanner;
public class Solution02 {
    public static void main(String[] args) {
        int num=0;
        Scanner userIn = new Scanner(System.in);
        System.out.println("What is the input string? ");
        String input = userIn.nextLine();

        for(int i = 0; i<input.length();i++){
            num ++;
        }

        System.out.println(input +" has "  +num +" characters");
    }
}
