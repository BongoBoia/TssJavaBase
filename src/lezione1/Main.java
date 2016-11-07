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
        int inputI=0;
        System.out.println("lezione1 started...");
        inputS=JOptionPane.showInputDialog("Inserire un numero:");
        try{
            inputI=Integer.parseInt(inputS);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "il numero inserito non è intero");
        }
        JOptionPane.showMessageDialog(null, "il numero inserito è: \n"+inputI);
        JDialog f=new JDialog();
        f.setTitle("Benvenuto");
        f.setSize(500,500);
        f.setVisible(true);
        System.out.println("lezione1 ended...");
    }
}
