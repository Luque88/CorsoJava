/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez03;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Confronto {

    // leggere in input due numeri interi e stampare il più grande
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        int op1 = s.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int op2 = s.nextInt();

        if (op1 == op2) {
            System.out.println("i due numeri sono uguali");

        } else {
            if (op1 > op2) {
                System.out.println("prendo il numero 1 che è più grande" + op1);
            } else {
                if (op1 < op2) {
                    System.out.println("prendo il numero 2 che è più grande" + op2);
                }

            }
        }
 
   }
}   