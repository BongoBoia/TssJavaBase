/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2;

/**
 * Esempio di commenti in Java
 *
 * @author tss
 */
public class Main {

    /**
     * Da questo metodo parte l'esecuzione del programma
     *
     * @param args
     */

    /*dichiarazione variabili (campi statici) di classe. Quando definite a questo livello, le variabili vengono chiamate campi (fields) in modo
    da differenziarli ulteriormente dalle variabili */
    int j;//in questo punto la variabile sarà visibile in tutta la classe e non solo nel metodo main()

    //variabile statica
    public static int colore = 1;
    //variabile di istanza
    private int carattere = 2;

    public static void main(String[] args) {
        /**
         * commento javadoc: serve come descrizione del programma e viene tenuto
         * in considerazione per creare una sorta di manuale/documentazione.
         * Solitamente viene inserito prima della classe e prima di ogni metodo
         * per spiegare la loro funzionalità e la descrizione
         */
        //dichiarazione variabili locali
        int totale = 10;
        String frase;
        /* int x; nel caso dichiarassi qua la variabile x avrei un errore sulle due presenti in if / else in quanto sarebbero una ripetizione visto /
        che lo scope di questa variabile comprende anche l'interno dell' if. Se fosse dichiarata a quiesto punto la potrei usare all'interno di 
        if / else senza dichiararla nuovamento in quanto sarebbe visibile in tutta la classe
         */
        System.out.println("lezione2 started...");

        //commento su una riga
        /*
        commento
        su
        più
        righe
         */
        if (totale > 0) {
            int x = 5; //creo una variabile che ha visibilità solo all'interno dell' if
            System.out.println("totale > 0");
        } else {
            int x = 2; //se la riutilizzo qua dentro devo dichiararla una seconda volta in quanto fuori dallo scope della prima variabile x dichiarata
            System.out.println("totale < 0");
        }

        //if ternario
        frase = (totale > 0) ? "il totale è positivo" : "il totale è negativo";
        System.out.println(frase);

        System.out.println("Parametri: " + args); //args è un parametro e conta come variabile locale del metodo main
    }

}
