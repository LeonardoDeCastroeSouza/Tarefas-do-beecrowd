/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividade_beecrowd;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Reajuste_de_Salario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;
        double percentual;
        double reajuste;
        double novoSalario;

        System.out.println("Insíra o seu salario para aquirir o aumento");
        salario = sc.nextDouble();

        if (salario <= 400.00) {
            percentual = 15;
        } else if (salario <= 800.00) {
            percentual = 12;
        } else if (salario <= 1200.00) {
            percentual = 10;
        } else if (salario <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        reajuste = salario * percentual / 100;
        novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %.0f %%\n", percentual);

        
    }
}
