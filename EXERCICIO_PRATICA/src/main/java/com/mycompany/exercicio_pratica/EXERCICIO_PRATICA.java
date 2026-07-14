/*
Faça um programa em Java que leia três notas de um aluno, calcule a média aritmética e informe sua situação.
Caso a média seja maior ou igual a **6,0**, o programa deverá exibir a mensagem **“APROVADO”**. 
Caso contrário, deverá exibir **“REPROVADO”**.
Ao final, o programa deverá mostrar a média obtida pelo aluno.
*/
package com.mycompany.exercicio_pratica;

import java.util.Scanner;

public class EXERCICIO_PRATICA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3)/ 3;

        if(media >=6){
            System.out.println("APROVADO");
        }

        else{
            System.out.println("REPROVADO");
        }

        System.out.println("Sua média vai ser de " + media);

        scanner.close();
    }
}
