/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution16 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        int num;


        System.out.println("What is your age?");
        num = input.nextInt();

        if(num >= 16) {
            System.out.println("You are old enough to drive.");
        }
        else {
            System.out.println("You are not old enough to drive.");
        }
    }

}
