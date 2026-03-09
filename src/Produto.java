// No arquivo Produto.java
public class Produto {
    String nome;
    double preco;
    int quantEstoque;

    public void altPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void altQuantidade(int novaQuantidade) {
        this.quantEstoque = novaQuantidade;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantEstoque);
    }
}