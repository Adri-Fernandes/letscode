package CalculaTaboada;

import java.util.Scanner;

public class CalculaTaboada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("*  Calcula Taboada                          *");
        System.out.println("*********************************************");
        System.out.println("Informe o número para cálculo da taboada:");

        int numeroTaboada = in.nextInt();

        calculaTaboada(numeroTaboada);
    }

    public static void calculaTaboada(int numeroTaboada){
        for (int i = 1; i <=10; i++){
            int valorMultiplicado = numeroTaboada * i;
            System.out.println(numeroTaboada+ " * "+ i+" = "+ valorMultiplicado);
        }
        return;
    }
}
