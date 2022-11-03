package chapaMetalica;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Chapa {

    private final static BigDecimal TEMPERATURA_INICIAL = BigDecimal.ZERO;
    //private final static BigDecimal TEMPERATURA_INICIAL = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_EVEN);
    private boolean equilibrioTermico = false;
    private BigDecimal erro = BigDecimal.valueOf(0).setScale(2,RoundingMode.HALF_EVEN);


    int qtdLinhasChapa = 0;
    int qtdColunasChapa = 0;
    BigDecimal temperaturaPrimeiraColuna = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_EVEN);
    BigDecimal temperaturaUltimaColuna = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_EVEN);
    BigDecimal temperaturaPrimeiraLinha = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_EVEN);
    BigDecimal temperaturaUltimaLinha = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_EVEN);
    int nroMaximoIteracoes = 0;
    int contIteracoes = 0;
    BigDecimal erroMaximoAceitavel = BigDecimal.valueOf(0).setScale(2,RoundingMode.HALF_EVEN);
    int nroCasasDecimaisResultados = 0;

    List <List<BigDecimal>> matrizAtualChapa = new ArrayList<List<BigDecimal>>();
    List <BigDecimal> linhaAtualChapa = new ArrayList<BigDecimal>();

    List <List<BigDecimal>> matrizNovaChapa = new ArrayList<List<BigDecimal>>();
    List <BigDecimal> linhaNovaChapa = new ArrayList<BigDecimal>();

    public Chapa(int qtdLinhasChapa, int qtdColunasChapa, BigDecimal temperaturaPrimeiraColuna, BigDecimal temperaturaUltimaColuna, BigDecimal temperaturaPrimeiraLinha, BigDecimal temperaturaUltimaLinha, int nroMaximoIteracoes, BigDecimal erroMaximoAceitavel, int nroCasasDecimaisResultados) {
        this.qtdLinhasChapa = qtdLinhasChapa;
        this.qtdColunasChapa = qtdColunasChapa;
        this.temperaturaPrimeiraColuna = temperaturaPrimeiraColuna;
        this.temperaturaUltimaColuna = temperaturaUltimaColuna;
        this.temperaturaPrimeiraLinha = temperaturaPrimeiraLinha;
        this.temperaturaUltimaLinha = temperaturaUltimaLinha;
        this.nroMaximoIteracoes = nroMaximoIteracoes;
        this.erroMaximoAceitavel = erroMaximoAceitavel;
        this.nroCasasDecimaisResultados = nroCasasDecimaisResultados;

        BigDecimal pontoAuxiliar = BigDecimal.valueOf(0).setScale(2,RoundingMode.HALF_EVEN);
        List <BigDecimal> linhaTemp1 = new ArrayList<BigDecimal>();

        // Monta Matriz da Chapa
        for (int linha = 0; linha < qtdLinhasChapa; linha++) {

            // Define primeira linha da chapa
            if (linha == 0) {
                for (int i = 0; i < this.qtdColunasChapa; i++) {
                    pontoAuxiliar = getTemperaturaPrimeiraLinha();
                    linhaTemp1.add(pontoAuxiliar);
                }
                this.matrizAtualChapa.add(linhaTemp1);
                System.out.println("Pontos na linha "+linha+": "+this.linhaAtualChapa.size()+"");
                imprimirLinha(linha);
                continue;
            }

            // Define linhas internas da chapa
            if(linha > 0 && linha < this.qtdLinhasChapa-1) {
                linhaTemp1.clear();
                for (int i = 0; i < this.qtdColunasChapa; i++) {
                    if (i == 0) {
                        pontoAuxiliar = getTemperaturaPrimeiraColuna();
                        linhaTemp1.add(pontoAuxiliar);
                    } else if (i > 0 && i < qtdColunasChapa-1) {
                        pontoAuxiliar = TEMPERATURA_INICIAL;
                        linhaTemp1.add(pontoAuxiliar);
                    } else if (i == qtdColunasChapa-1){
                        pontoAuxiliar = getTemperaturaUltimaColuna();
                        linhaTemp1.add(pontoAuxiliar);
                    }
                }
                System.out.println("Pontos na linha "+linha+": "+this.linhaAtualChapa.size()+"");
                this.matrizAtualChapa.add(linhaTemp1);
                imprimirLinha(linha);
                continue;
            }

            // Define Última linha da chapa
            if (linha == qtdLinhasChapa-1) {
                linhaTemp1.clear();
                for (int i = 0; i < this.qtdColunasChapa; i++) {
                    pontoAuxiliar = getTemperaturaUltimaLinha();
                    linhaTemp1.add(pontoAuxiliar);
                }
                System.out.println("Pontos na linha "+linha+": "+this.linhaAtualChapa.size()+"");
                this.matrizAtualChapa.add(linhaTemp1);
                imprimirLinha(linha);
            }
        } // FIM MONTA MATRIZ
    } // FIM CONSTRUTOR CHAPA

    public BigDecimal getTemperaturaUltimaLinha() {
        return this.temperaturaUltimaLinha.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getTemperaturaPrimeiraLinha() {
        return this.temperaturaPrimeiraLinha.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getTemperaturaPrimeiraColuna() {
        return this.temperaturaPrimeiraColuna.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getTemperaturaUltimaColuna() {
        return this.temperaturaUltimaColuna.setScale(2, RoundingMode.HALF_EVEN);
    }

    public void atualizarTemperatura(){

    }

    public void calcularTemperaturaPonto (){

    }

    public void imprimirMatrizChapa (){
        System.out.println("\nMatriz Atualizada da Chapa Metálica: "+this.matrizAtualChapa.size()+" linhas");
        for(int l = 0; l < this.matrizAtualChapa.size(); l++){
            imprimirLinha(l);
        }
    }

    public void imprimirLinha(int linhaImpressao){
        System.out.println("");
        List <BigDecimal> linhaTemp2 = new ArrayList<BigDecimal>();
        linhaTemp2 = this.matrizAtualChapa.get(linhaImpressao);
        System.out.printf("Linha %d ", linhaImpressao);
        for (BigDecimal valorPontoChapa : linhaTemp2){
            System.out.printf("| %s ", valorPontoChapa.toString() );
        }
        System.out.printf("| %d itens", linhaTemp2.size());
    }

    public void imprimirStatusChapa (){
        System.out.println("Chapa em Equilibrio Térmico: "+this.equilibrioTermico);
    }

    public void calcularErro (){

    }

    public BigDecimal getErro (){
        return this.erro;
    }

    public void imprimirErro(){
        System.out.println("Erro do Round de Atualização Térmica: "+getErro());
    }


    public void imprimirIteracoes (){
        System.out.println("Quantidade de Iterações Processadas: "+this.contIteracoes);
    }

} // FIM CLASSE
