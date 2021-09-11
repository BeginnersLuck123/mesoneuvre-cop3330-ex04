package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a noun: ");
       String noun = input.nextLine(); //Input
       System.out.println("Enter a verb: ");
       String verb = input.nextLine(); //Input
       System.out.println("Enter an adjective: ");
       String adjective = input.nextLine(); //Input
       System.out.println("Enter an adverb: ");
       String adverb = input.nextLine(); //Input
       System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");//Output

    }
}
