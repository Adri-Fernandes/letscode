package CestaProdutos;

public class Produto {
    private Double valorProduto = 0.0;
    private String nomeProduto = "";

    public Produto(Double valorProduto, String nomeProduto) {
        this.valorProduto = valorProduto;
        this.nomeProduto = nomeProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
