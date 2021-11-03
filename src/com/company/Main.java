/*
* Hello, My name is Ankit kumar
* FLAMES is very famous game among teenagers
* This program will give you output of Flames for given names
* copyright of Ankit Kumar
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
            Making scanner class to get names from user
            have to trim the names to removes any white space entered by user
            Make sure to update name1 and name2 after trimming
         */
        System.out.println("            FLAMES CALCULATOR           ");
        System.out.println("ARE YOU READY TO KNOW RELATIONSHIP BETWEEN YOU AND YOUR LOVED ONES");
        System.out.println("If YES choose 1:\nIf NO  choose 2:\n");
        Scanner sc1 = new Scanner(System.in);
        int choose = sc1.nextInt();
        if(choose==1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First name of first person");
            String name1 = sc.nextLine();
            name1 = name1.trim().toLowerCase();
            System.out.println("Enter First name of second person");
            String name2 = sc.nextLine().toLowerCase();
            name2 = name2.trim();

            String str = "FLAMES";// decleared FLAMES string

            // declaring n which is number of uncommon character in the names
            // countpair returns number of common characters of the given names
            // here i subtract total length of both name with 2 times common character
            int n = (name1.length() + name2.length()) - (2 * Flames.countPair(name1, name2)), x;

            // In this while loop by using  modulo i find out which word from Flames should cut off
            // for the last value the modulo will come 0 but we need its real value that is why i use if(x==0) condition
            while (str.length() != 1) {
                x = n % str.length();
                if (x == 0) {
                    x = str.length();
                }
                // deleting the counted character from string
                str = Flames.delete(str, x);
            }
            System.out.print(name1.toUpperCase()+" and "+name2.toUpperCase()+" is ");
            Flames.print(str);
        }
        System.out.println("\n\t\tThankYou for using FLAME calculator");

    }
    }

