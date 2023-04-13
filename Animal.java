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
public class Animal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra1;
        String palavra2;
        String palavra3;

        System.out.println("Glossário de palavrás");
        System.out.println("(vertebrado) (ave) (carnivoro) (onivoro) (herbivoro) (invetebrado) (hematofago) (anelideo) ");

        System.out.println("Insira a primera palavra");
        palavra1 = sc.nextLine();

        System.out.println("Insira a segunda palavra");
        palavra2 = sc.nextLine();

        System.out.println("Insira a terceira palavra");
        palavra3 = sc.nextLine();

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println(" Resultado = " + " aguia ");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

    }

}
