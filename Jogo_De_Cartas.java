/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_beecrowd;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Jogo_De_Cartas {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     
        System.out.println("Insíra os numeros das cartas para descobrir a ordem");
        System.out.println(" C = Crescente " + " D = Decrescente " + " N = Não Ordenada " );
     
     int[] cartas = new int[5];
    for (int i = 0; i < 5; i++) {
        cartas[i] = sc.nextInt();
    }

    
    boolean crescente = true;
    boolean decrescente = true;
    for (int i = 1; i < 5; i++) {
        if (cartas[i] > cartas[i - 1]) {
            decrescente = false;
        } else if (cartas[i] < cartas[i - 1]) {
            crescente = false;
        }
    }

    
    if (crescente) {
        System.out.println("C");
    } else if (decrescente) {
        System.out.println("D");
    } else {
        System.out.println("N");
    }
        
        
    }
    
}
