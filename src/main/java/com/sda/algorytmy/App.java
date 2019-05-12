package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int wynik=0;


        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0 ; i < N; i++)
        {

            Scanner scanner1 =new Scanner(System.in);
            int A = scanner1.nextInt();
            System.out.println("wynik to "+ wynik + A  ) ;
        }
        wynik = wynik /N;
        System.out.println(wynik);
    }
}
