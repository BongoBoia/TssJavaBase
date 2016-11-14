/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2.esercizi;

import java.util.Scanner;

/**
 * Legge un numero intero da tastiera e stampa se è pari o dispari
 *
 * @author tss
 */
public class PariDispari {

    public static void main(String[] args) {
        //creo uno scanner per la lettura di un numero
        Scanner s = new Scanner(System.in);
        //richiedo il numero
        System.out.println("Inserisci un numero:");
        //leggo il numero in input
        int num = s.nextInt();
        //System.out.println(num);
        if (num % 2 == 0) {
            System.out.println("pari");
        } else {
            System.out.println("dispari");
        }
    }
}
