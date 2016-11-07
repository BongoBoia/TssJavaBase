/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione1;

import javax.swing.*;
/**
 *
 * @author tss
 */
public class Main {
    public static void main(String[] args){
        //dichiarazione variabili
        String inputS;
        System.out.println("lezione1 started...");
        inputS=JOptionPane.showInputDialog("Inserire una frase:");
        JOptionPane.showMessageDialog(null, "la frase digitata è: \n"+inputS);
        JDialog f=new JDialog();
        f.setTitle("Benvenuto");
        f.setSize(500,500);
        f.setVisible(true);
        System.out.println("lezione1 ended...");
    }
}
