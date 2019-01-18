/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez05;

/**
 *
 * @author tss
 */
public class Lez05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeri = {23, 25, 67, 90, 56, 15};

        stampa(numeri);
        int massimo = max(numeri);
        System.out.println(massimo);
    }

    public static void stampa(int[] array) {
        //foreach
        for (int numero : array) {
            System.out.println(numero);
        }
    }

    //trovare il massimo in un array di numeri
    public static int max(int[] array) {
        int massimo = array[0];
        for (int el : array) {
            if (el > massimo) {
                massimo = el;
            }

        }
        return massimo;
    }

    //ricerca di un numero
    public static boolean cerca(int[] array, int numero) {
        boolean trovato = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                trovato = true;
            }

        }

        return trovato;
        
        //estrarre i numeri pari
    public static int[] pari(int[] array) {
        int []risultato = new int[pari(array)];
        int idx=0;
        for (int numero : array){
            if (Pari(numero)){
                
            }
        }
          return risultato
      }
            
   
       
    
        
        //ordina 
    public static void ordina(int[] array) {

    }

}
