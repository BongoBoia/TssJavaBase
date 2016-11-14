/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2.esercizi;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Fattoriale {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int risultato;
        int i;
        System.out.println("Inserire un numero: ");
        int num = s.nextInt();
        risultato=num;
        for (i=1;i<num;i++){
            risultato*=i;
        }
        System.out.println("il fattoriale di "+num+" è "+risultato);
    }
}
