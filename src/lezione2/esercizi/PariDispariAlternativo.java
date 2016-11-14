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
public class PariDispariAlternativo {

    public static void main(String[] args) {
        int risultato;
        String ritorno;
        Scanner s = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int num = s.nextInt();
        ritorno = (((num / 2) * 2) == num) ? "pari" : "dispari";
        System.out.println(ritorno);
    }
}
