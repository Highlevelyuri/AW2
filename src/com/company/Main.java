package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println( "Введите число:");

        for( int i = 0 ; i <= 20; i++){
            int x = scanner.nextInt();
            for ( int k = 0; k <=20; k++){

                int sum =0;
                sum += ((Math.pow(x,k))/k);
                System.out.println(sum);



            }
            return;
        }



    }
}

