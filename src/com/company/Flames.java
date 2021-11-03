/*
* Flames class for our Flame game
* it has static methods which will be used in main method
 */
package com.company;

import java.util.Arrays;

public class Flames {

    // this method will use to delete a particular character from string
    public static String delete(String str,int index)
    {
        return str.substring(0,index-1)+str.substring(index);
    }

    // this static method works fine for non repeating character names
    // this return number of uncommon character in given strings **For non repeating**

    public static int common(String st1,String st2)
    {
        int x=st1.length(),count=0;
        for(int i =0;i<x;i++)
        {
            for(int j =0;j<st2.length();j++)
            {
                if(st1.toUpperCase().charAt(i)==st2.toUpperCase().charAt(j))
                {
                    System.out.println(st1.charAt(i)+" "+st2.charAt(j));
                   // delete(st2,j);
                    count+=2;
                }
            }
        }
        return (st1.length()+st2.length())-count;
    }



    // this methos is for all repeating or non repeating
    // this method returns number of common characters in given two strings
    public static int countPair(String s1,String s2)
    {
        int n1 = s1.length(),n2=s2.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        Arrays.fill(freq1, 0);
        Arrays.fill(freq2,0);
        int i, count =0;
        for(i=0;i<n1;i++)
            freq1[s1.charAt(i) - 'a']++;
        for(i =0;i<n2;i++)
            freq2[s2.charAt(i)-'a']++;
        for(i=0;i<26;i++)
            count += (Math.min(freq1[i],freq2[i]));
        return count;
    }

    // this method will print the result corresponding to obtained string from FLAMES
    public static void print(String str)
    {
        switch (str){
            case "F":
                System.out.println("Friends");
                break;
            case "L":
                System.out.println("Lover");
                break;
            case "A":
                System.out.println("Affair");
                break;
            case "M":
                System.out.println("Marriage");
                break;
            case "E":
                System.out.println("Enemy");
                break;
            case "S":
                System.out.println("Sister");
                break;
            default:
                System.out.println("Something went wrong:(");
        }
    }
}
