/*
Desenvolva um programa em Java que simule o funcionamento de um semáforo durante **600 segundos**.
O semáforo deverá operar em ciclos de **80 segundos**, distribuídos da seguinte forma:
* **30 segundos no verde**;
* **5 segundos no amarelo**;
* **45 segundos no vermelho**.
A cada **15 segundos**, um novo carro deverá chegar à fila do semáforo. A fila poderá armazenar, no máximo, **10 carros**.
Durante o sinal verde, deverá passar **um carro por segundo**, desde que existam carros na fila. 
Caso um novo carro chegue quando a fila já estiver cheia, ele deverá ser contabilizado como congestionado.
Durante a simulação, o programa deverá mostrar o estado atual do semáforo e informar quando um carro passar.
Ao final, deverá exibir:
* O total de carros que passaram pelo semáforo;
* O total de carros que ficaram congestionados.
*/

package com.mycompany.atividade_simulacao_transito;

public class ATIVIDADE_SIMULACAO_TRANSITO {

    public static void main(String[] args) {

        int tempoTotal = 600, carrosCongestionados = 0, carrosPassaram = 0, filaCarros = 0, cicloSemaforo = 80;

        for (int tempoAtual = 1; tempoAtual <= tempoTotal; tempoAtual++) {

            int estadoSemaforo = (tempoAtual - 1) % cicloSemaforo;

            if (estadoSemaforo < 30) {
                System.out.println("Segundo " + tempoAtual + ": Semáforo Verde");

                if (filaCarros > 0) {
                    filaCarros--;
                    carrosPassaram++;
                    System.out.println("Um carro passou.");
                }

            } else if (estadoSemaforo < 35) {
                System.out.println("Segundo " + tempoAtual + ": Semáforo Amarelo");

            } else {
                System.out.println("Segundo " + tempoAtual + ": Semáforo Vermelho");
            }

            if (tempoAtual % 15 == 0) {
                if (filaCarros < 10) {
                    filaCarros++;
                    System.out.println("Um carro chegou. Carros na fila: " + filaCarros);
                } else {
                    carrosCongestionados++;
                    System.out.println("Fila cheia. Um carro ficou congestionado.");
                }
            }
        }

        System.out.println("\n===== RESULTADO DA SIMULAÇÃO =====");
        System.out.println("Total de carros que passaram: " + carrosPassaram);
        System.out.println("Carros que não conseguiram entrar na fila: "
                + carrosCongestionados);
        System.out.println("Carros que permaneceram na fila: " + filaCarros);
        
    }
}

