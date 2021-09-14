/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
    Scanner input= new Scanner(System.in); //new scanner
    System.out.println("Enter a quote:");//Asks user to enter the code 
    String q = input.nextLine();
    System.out.println("Enter the author of the quote:");//Asks user to enter the quote 
    String a = input.nextLine();
  System.out.println(a + " says, \""+q+"\""); //prints what user inputted
}
}
