package ConverteDolarReal;

import java.util.Scanner;

public class ConverteDolarReal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("*  Conversão de Dólar para Real             *");
        System.out.println("*********************************************");
        System.out.println("Informe a cotação do dólar:");
        double cotacaoDolar = in.nextDouble();

        System.out.println("Informe o valor em dólar que será convertido:");
        double montanteDolar = in.nextDouble();
                
        double valorReal = converteDolarReal(cotacaoDolar, montanteDolar);
        System.out.println("Valor convertido: R$ "+valorReal);

    }

    private static double converteDolarReal(double cotacaoDolar, double montanteDolar) {

        double valorRealConvertido = cotacaoDolar * montanteDolar;

        return valorRealConvertido;
    }

}
