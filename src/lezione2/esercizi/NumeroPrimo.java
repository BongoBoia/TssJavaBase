/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2.esercizi;

import java.util.Scanner;

/**
 * Ricerca di un numero primo
 * @author tss
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String appoggio;
        int count = 0;
        System.out.println("Inserire un numero: ");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            if (count > 2) break;
        }
        appoggio = (count > 2)||(num<=1) ? "numero non primo" : "numero primo";
        System.out.println(appoggio);
    }
}
