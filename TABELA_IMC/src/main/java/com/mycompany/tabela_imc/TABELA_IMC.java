/*
Faça um programa em Java que leia o peso de uma pessoa, em quilogramas, e sua altura, em metros.
Em seguida, calcule o Índice de Massa Corporal (IMC) utilizando a fórmula:
**IMC = peso ÷ altura²**
Após o cálculo, classifique o resultado conforme a tabela:
* IMC abaixo de 18,5: **Abaixo do peso**;
* IMC entre 18,5 e 24,9: **Peso normal**;
* IMC entre 25,0 e 29,9: **Excesso de peso**;
* IMC entre 30,0 e 34,9: **Obesidade classe I**;
* IMC entre 35,0 e 39,9: **Obesidade classe II**;
* IMC igual ou superior a 40,0: **Obesidade classe III**.
*/

package com.mycompany.tabela_imc;

import java.util.Scanner;

public class TABELA_IMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso = 0, altura = 0, imc = 0;

        System.out.println("Digite o seu peso em KG:");
        peso = scanner.nextDouble();

        System.out.println("Digite a sua altuta em METROS:");
        altura = scanner.nextDouble();

        imc = peso / (altura*altura);

        if( imc < 18.8 ){
            System.out.println("ABAIXO DO PESO");
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.print("PESO NORMAL");
        }
        else if ( imc >= 25 && imc <= 29.9){
            System.out.println("EXCESSO DE PESO");
        }
        else if ( imc >=30 && imc <=34.9){
            System.out.print("OBESIDADE CLASSE I");
        }
        else if ( imc >=35 && imc <=39.9){
            System.out.print("OBESIDADE CLASSE II");
        }
        else if ( imc >=40){
            System.out.println("OBESIDADE CLASSE III");
        }

        scanner.close();
    }
}
