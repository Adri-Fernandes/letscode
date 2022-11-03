package chapaMetalica;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ChapaMetalicaMain {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("*      CHAPA METÁLICA                       *");
        System.out.println("*********************************************");
        System.out.println("Escolha a questão que deseja resolver: 1, 2 ou 3");

        Scanner in = new Scanner(System.in);
        int funcao = in.nextInt();
        if (funcao == 1){
            System.out.println("Função 1 - Chapa 6 x 5");
        } else if (funcao == 2) {
            System.out.println("Função 2 - Iterações Determinadas");
            System.out.println("Informe o numero de iterações: ");
            int nroIteracoes = in.nextInt();
            System.out.println("Informe o Número Máximo de Erro Aceitável");
            int nroMaximoErroAceitavel = in.nextInt();
        } else if (funcao == 3) {
            System.out.println("Função 3 - Chapa Completa");
            System.out.println("Informe a quantidade de linhas da Chapa Metálica:");
            int qtdLinhasChapa = in.nextInt();
            System.out.println("Informe a quantidade de colunas da Chapa Metálica:");
            int qtdColunasChapa = in.nextInt();
            System.out.println("Informe a temperatura da Primeira Linha:");
            int temperaturaPrimeiraLinhaInt = in.nextInt();
            BigDecimal temperaturaPrimeiraLinha = BigDecimal.valueOf(temperaturaPrimeiraLinhaInt).setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("Informe a temperatura da Última Linha:");
            int temperaturaUltimaLinhaInt = in.nextInt();
            BigDecimal temperaturaUltimaLinha = BigDecimal.valueOf(temperaturaUltimaLinhaInt).setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("Informe a temperatura da Primeira Coluna:");
            int temperaturaPrimeiraColunaInt = in.nextInt();
            BigDecimal temperaturaPrimeiraColuna = BigDecimal.valueOf(temperaturaPrimeiraColunaInt).setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("Informe a temperatura da Última Coluna:");
            int temperaturaUltimaColunaInt = in.nextInt();
            BigDecimal temperaturaUltimaColuna = BigDecimal.valueOf(temperaturaUltimaColunaInt).setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("Informe a quantidade de iterações:");
            int nroMaximoIteracoes = in.nextInt();
            System.out.println("Informe o Erro Máximo Aceitável:");
            String erroMaximoString = in.next();
            BigDecimal erroMaximoAceitavel = new BigDecimal(erroMaximoString).setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("Informe o número de casas decimais dos resultados:");
            int nroCasasDecimaisResultados = in.nextInt();

            Chapa chapaMetalica = new Chapa(qtdLinhasChapa,qtdColunasChapa,temperaturaPrimeiraColuna, temperaturaUltimaColuna, temperaturaPrimeiraLinha, temperaturaUltimaLinha, nroMaximoIteracoes, erroMaximoAceitavel, nroCasasDecimaisResultados);

            chapaMetalica.imprimirMatrizChapa();

            chapaMetalica.imprimirLinha(4);
            chapaMetalica.imprimirLinha(5);

        } else {
            System.out.println("Funcão inválida! Fim do programa.");
        }
    }

    public void criaChapa(){

    }
}
