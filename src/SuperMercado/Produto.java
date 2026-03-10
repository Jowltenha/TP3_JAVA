package SuperMercado;

// No arquivo Produto.java
public class Produto {
    // --- Exercício 2 Criando a Classe “Produto” (Com Contexto de Usuário) ---
    String nome;
    double preco;
    int quantEstoque;

    // --- Exercício 3 Métodos Básicos da Classe “Produto” ---
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

    // --- Exercício 5: Exercício 5 Criando Métodos de Propriedade (Getters e Setters) ---
    // --- MÉTODOS GET ---
    public String getNome() {return nome;}
    public double getPreco() {return preco;}
    public int getQuant() {return quantEstoque;}

    // --- MÉTODOS SET ---
    public void setNome(String nome) {this.nome = nome;}
    public void setPreco(double preco) {this.preco = preco;}
    public void setQuant(int quantEstoque) {this.quantEstoque = quantEstoque;}

    // --- Exercício 6 Adicionando Construtores à Classe “Produto” ---
    // Com o contrutor facilita muito porque faz um pedido obrigatório, assim ja armazenando os dados.
    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }
}

