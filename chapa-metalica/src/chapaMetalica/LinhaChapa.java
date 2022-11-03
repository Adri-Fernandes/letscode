package chapaMetalica;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LinhaChapa {
    List<BigDecimal> linhaAtualChapa = new ArrayList<BigDecimal>();
    List<BigDecimal> linhaNovaChapa = new ArrayList<BigDecimal>();

    public LinhaChapa(List<BigDecimal> linhaAtualChapa) {
        this.linhaAtualChapa = linhaAtualChapa;
    }

    public void addPontoChapa (BigDecimal pontoChapa){
        this.linhaAtualChapa.add(pontoChapa);
    }
}

