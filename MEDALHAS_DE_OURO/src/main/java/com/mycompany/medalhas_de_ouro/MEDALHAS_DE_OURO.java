/*
Faça um programa em Java que leia a quantidade de medalhas de **ouro**, **prata** e **bronze** conquistadas por uma equipe.
O programa deverá calcular e exibir o total de medalhas e classificar o desempenho da equipe conforme os seguintes critérios:
* **Ótimo desempenho:** 10 ou mais medalhas de ouro;
* **Bom desempenho:** entre 5 e 9 medalhas de ouro;
* **Desempenho regular:** menos de 5 medalhas de ouro e 20 ou mais medalhas no total;
* **Desempenho fraco:** menos de 5 medalhas de ouro e menos de 20 medalhas no total.
*/

package com.mycompany.medalhas_de_ouro;

import java.util.Scanner;

public class MEDALHAS_DE_OURO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double ouro = 0, prata = 0, bronze = 0, totalMedalhas = 0;

        System.out.println("Digite a quantidade de medalhas de OURO:");
        ouro = scanner.nextDouble();

        System.out.println("Digite a quatidade de medalhas de PRATA:");
        prata = scanner.nextDouble();

        System.out.println("Digite a quantidade de medalhas de BRONZE:");
        bronze = scanner.nextDouble();

        totalMedalhas = ouro + prata + bronze;

        System.out.println("O total de medalhas foram" + totalMedalhas);

        if ( ouro >=10){
            System.out.println("OTIMO DESEMPENHO");
        }
        else if ( ouro >=5 && ouro <=10 ){
            System.out.println("BOM DESEMPENHO");
        }
        else if ( ouro <=5 && ouro + prata + bronze >= 20){
            System.out.println("DESEMPENHO REGULAR");
        }
        else if ( ouro + prata + bronze <=20 ){
            System.out.println("DESEMPENHO FRACO");
        }

        scanner.close();
    }
}
