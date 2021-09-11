package org.example;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double EU = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double RoE = input.nextDouble();

        double USD = Math.round((EU * RoE) * 100.0) / 100.0;

        System.out.print(EU + " euros at an exchange rate of " + RoE + " is\n" + USD + " U.S. dollars.");

    }

}
