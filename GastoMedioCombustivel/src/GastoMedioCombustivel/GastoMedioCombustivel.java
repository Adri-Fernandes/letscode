package GastoMedioCombustivel;

import java.util.Scanner;

public class GastoMedioCombustivel {

    final static float CONSUMO_AUTOMOVEL = 12;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("*  Cálculo de Consumo Médio de Combustível  *");
        System.out.println("*********************************************");
        System.out.println("Informe o tempo decorrido da viagem em horas:");
        float tempoViagem = in.nextFloat();

        System.out.println("Informe a velocidade média da viagem em km/h:");
        float velocidadeMediaViagem = in.nextFloat();

        float distanciaCalculada = calculaDistanciaPercorrida (tempoViagem,velocidadeMediaViagem);
        //pergutar pq o InteliJ não recomendou o uso do método que já estava criado.

        float consumoViagem = calculaConsumoCombustivel(distanciaCalculada, CONSUMO_AUTOMOVEL);

        System.out.println("Velocidade média da viagem: "+velocidadeMediaViagem+" km/h");
        System.out.println("Tempo gasto: "+tempoViagem+" h");
        System.out.println("Distância percorrida: "+distanciaCalculada+" km");
        System.out.println("Combustível gasto: "+consumoViagem+" litros");

    }

    // DEU ERRO: java: non-static method calculaDistanciaPercorrida(float,float) cannot be referenced from a static context
    public static float calculaDistanciaPercorrida (float tempo, float velocidade){
        float distanciaPercorrida = tempo * velocidade;
        return distanciaPercorrida;
    }

    // DEU ERRO: java: non-static method calculaDistanciaPercorrida(float,float) cannot be referenced from a static context
    public static float calculaConsumoCombustivel (float distancia, float consumoMedio){
        float consumoFinal = distancia / consumoMedio;
        return consumoFinal;
    }
}
