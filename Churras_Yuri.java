/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_beecrowd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Churras_Yuri {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome das carnes e data de validade.");
        
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            List<String> carnes = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String nome = sc.next();
                int validade = sc.nextInt();
                carnes.add(nome + " " + validade);
            }
            Collections.sort(carnes, Comparator.comparingInt(s -> Integer.parseInt(s.split(" ")[1])));
            System.out.println(String.join(" ", carnes));
        }
    }
}


