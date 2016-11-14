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
public class AncoraPariDispari {

    public static void main(String[] args) {
        String risultato="";
        boolean check=true;
        int i=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int num = s.nextInt();
        while (check==true){
            if (i<num){
                i+=2;
            }
            if (i==num){
                risultato="numero pari";
                check=false;
            }
            if (i>num){
                risultato="numeo dispari";
                check=false;
            }
            i+=2;
        }
        System.out.println(risultato);
    }
}
