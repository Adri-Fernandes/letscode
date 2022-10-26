package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("*  Calculadora                              *");
        System.out.println("*********************************************");
        System.out.println("Escolha a operação que deseja calcular:");
        System.out.println("1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
        int operacao = in.nextInt();

        System.out.println("Informe o primeiro número da operação");
        float numero1 = in.nextInt();
        System.out.println("Informe o segundo número da operação");
        float numero2 = in.nextInt();

        float resultadoCalculado = 0;

        System.out.println("Operação escolhida: "+operacao);

        switch (operacao){
            case 1:
                resultadoCalculado = somar(numero1, numero2);
                break;
            case 2:
                resultadoCalculado = subtrair(numero1, numero2);
                break;
            case 3:
                resultadoCalculado = multiplicar(numero1, numero2);
                break;
            case 4:
                resultadoCalculado = dividir(numero1, numero2);
                break;
        }

        System.out.println("Resultado da operação: "+resultadoCalculado);
    }

    private static float dividir(float numero1, float numero2) {
        float resultado = numero1 / numero2;
        return resultado;
    }

    private static float multiplicar(float numero1, float numero2) {
        float resultado = numero1 * numero2;
        return resultado;
    }

    private static float subtrair(float numero1, float numero2) {
        float resultado = numero1 - numero2;
        return resultado;
    }

    private static float somar(float numero1, float numero2) {
        float resultado = numero1 + numero2;
        return resultado;
    }
}
