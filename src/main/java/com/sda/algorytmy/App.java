package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj bok A : ");
        double A = scanner.nextDouble();

        System.out.println("podaj bok B : ");
        double B = scanner.nextDouble();

        System.out.println("pole prostokata to " + A * B);
        System.out.println("obwod prostokata to " + (A + A + B + B ));

    }
}
