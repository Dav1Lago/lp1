/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class JavaApplication74 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite a quantidade de livros desejados: ");
        int quantidadeLivros = scanner.nextInt();

        
        double custoA = 0.25 * quantidadeLivros + 7.50;

        // Calcula o custo total para o Critério B
        double custoB = 0.50 * quantidadeLivros + 2.50;

       
        if (custoA < custoB) {
            System.out.println("Opção A é a melhor. Custo total: R$ " + custoA);
            System.out.println("Opção B é desvantajosa. Custo total: R$ " + custoB);
        } else if (custoB < custoA) {
            System.out.println("Opção B é a melhor. Custo total: R$ " + custoB);
            System.out.println("Opção A é desvantajosa. Custo total: R$ " + custoA);
        } else {
            System.out.println("Ambas as opções têm o mesmo custo. Escolha qualquer uma. Custo total: R$ " + custoA);
        }

        scanner.close();
    } 
    }
    

