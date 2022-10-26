package CestaProdutos;

import java.util.Scanner;

public class CestaProdutosMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FuncoesCesta cestaProduto = new FuncoesCesta();


        System.out.println("**************************************");
        System.out.println("*   Cesta de Produtos                *");
        System.out.println("**************************************");

        int funcao = 0;

        do {

            System.out.println("Escolha uma função: 1- Adicionar Produto / 2 - Finalizar");
            funcao = in.nextInt();

            if (funcao == 1) {
                System.out.println("Informe o nome do produto:");
                String nomeProduto = in.next();

                System.out.println("Informe o valor do produto:");
                double valorProduto = in.nextDouble();

                Produto novoProduto = new Produto(valorProduto, nomeProduto);

                cestaProduto.adicionarProduto(novoProduto);

            } else{
                Produto produtoMaisCaro = cestaProduto.listarProdutoMaisCaro();
                System.out.println("O produto mais caro é: \nNome do Produto: "+produtoMaisCaro.getNomeProduto()+" / Valor: "+produtoMaisCaro.getValorProduto());

                Produto produtoMaisBarato = cestaProduto.listarProdutoMaisBarato();
                System.out.println("O produto mais barato é: \nNome do Produto: "+produtoMaisBarato.getNomeProduto()+" / Valor: "+produtoMaisBarato.getValorProduto());

                System.out.println("\nCesta Finalizada!");
                break;
            }

        }while (funcao != 2);
    }
}
