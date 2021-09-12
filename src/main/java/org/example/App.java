package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){

        int current_age, target_age, difference, curr_year, retirement_year;

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy");

        LocalDateTime curr_time = LocalDateTime.now();

        curr_year = String_to_int(format.format(curr_time));

        String stor;

        Scanner s = new Scanner(System.in);

        System.out.println("What is your current age? ");

        stor = s.nextLine();

        current_age = String_to_int(stor);

        System.out.print("At what age would you like to retire? ");

        stor = s.nextLine();

        target_age = String_to_int(stor);

        difference = target_age - current_age;

        retirement_year = curr_year + difference;

        System.out.print("You have " + difference + " years left until you can retire.");

        System.out.print("\nIt's " + curr_year + ", so you can retire in " + retirement_year + ".");

        s.close();

    }

    public static int String_to_int(String s){

        int res = 0;

        for(int i = 0; i < s.length(); i++){

            res += (s.charAt(i)-'0')*pow(10, s.length()-1-i);

        }

        return res;

    }

    public static int pow(int base, int exp){

        int res = 1;

        for(int i = 0; i < exp; i++){

            res *= base;

        }

        return res;

    }


}
