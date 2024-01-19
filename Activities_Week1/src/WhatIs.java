import java.util.Scanner;

public class WhatIs {
    public static void main(String[] args) throws Exception {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Escreva um número:");

        String pair = "par";
        String positive = "positivo";

        int number = numberScanner.nextInt();

        if (number<0) {
            positive = "negativo";
        }
        if (!(number%2==0)) {
            pair = "ímpar";
        }
        System.out.println(number + " é " + pair + " e " + positive);

    }
}
