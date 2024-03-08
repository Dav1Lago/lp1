
package javaapplication73;

import java.util.Scanner;


public class JavaApplication73 {

    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("digite a nota da prova 1");
        double prova1 = scanner.nextDouble();
        System.out.println("digite a nota da prova 2");
        double prova2 = scanner.nextDouble();
        System.out.println("digite a nota da prova 3");
        double prova3 = scanner.nextDouble();
        double media= (prova1 + prova2 + prova3)/3;
        if(media >= 7.0){
            System.out.println("media:"+media);
            System.out.println("aprovado");
        }
        else{
            System.out.println("media:"+media);
            System.out.println("você está de recuperação");
            System.out.println("digite a nota da recuperação");
            double recuperacao= scanner.nextDouble();
            double mediaFinal= (media + recuperacao)/2;
            if(mediaFinal >=5){
                System.out.println("media final" + mediaFinal);
                System.out.println("aprovado após recuperação");
            }
            else{
                System.out.println("media final"+ mediaFinal);
                System.out.println("reprovado");
            }
        }
    }
    
}
