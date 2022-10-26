package CestaProdutos;

import java.util.List;
import java.util.ArrayList;

public class FuncoesCesta {

    public List<Produto> cestaProduto = new ArrayList<Produto>();
    int tamanhoCesta = 0;
    int indexProdutoCaro = 0;
    int indexProdutoBarato = 0;

    public void adicionarProduto(Produto produto){
        this.cestaProduto.add(produto);
        System.out.println("Produto "+produto.getNomeProduto()+" adicionado!");
    }

    public Produto listarProdutoMaisCaro(){
        indexProdutoCaro = 0;
        tamanhoCesta = cestaProduto.size();
        for (int i = 1; i < tamanhoCesta; i++){
            if (cestaProduto.get(i).getValorProduto() > cestaProduto.get(indexProdutoCaro).getValorProduto()) {
                indexProdutoCaro = i;
            }
        }
        return cestaProduto.get(indexProdutoCaro);
    }

    public Produto listarProdutoMaisBarato(){
        indexProdutoBarato = 0;
        tamanhoCesta = cestaProduto.size();
        for (int i = 1; i < tamanhoCesta; i++){
            if (cestaProduto.get(i).getValorProduto() < cestaProduto.get(indexProdutoBarato).getValorProduto()) {
                indexProdutoBarato = i;
            }
        }
        return cestaProduto.get(indexProdutoBarato);
    }
}
