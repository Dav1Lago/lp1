/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

      
        System.out.println("Digite o primeiro intervalo de tempo:");
        System.out.print("Horas: ");
        int horas1 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos1 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos1 = scanner.nextInt();

     
        System.out.println("Digite o segundo intervalo de tempo:")  ;
        System.out.print("Horas: ");
        int horas2 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos2 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos2 = scanner.nextInt();

       
        int somaHoras = horas1 + horas2;
        int somaMinutos = minutos1 + minutos2;
        int somaSegundos = segundos1 + segundos2;

    
        int diferencaHoras = Math.abs(horas1 - horas2);
        int diferencaMinutos = Math.abs(minutos1 - minutos2);
        int diferencaSegundos = Math.abs(segundos1 - segundos2);

  
        somaMinutos += somaSegundos / 60;
        somaSegundos %= 60;

        somaHoras += somaMinutos / 60;
        somaMinutos %= 60;

     
        System.out.println("\nSoma dos intervalos de tempo:");
        System.out.printf("%02d:%02d:%02d\n", somaHoras, somaMinutos, somaSegundos);

        System.out.println("\nDiferença dos intervalos de tempo:");
        System.out.printf("%02d:%02d:%02d\n", diferencaHoras, diferencaMinutos, diferencaSegundos);

        scanner.close();
    }
    }
    

