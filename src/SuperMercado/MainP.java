package SuperMercado;

public class MainP {
    void main() {
        // --- Exercício 4 Testando a Classe “Produto” ---
        Produto produto1 = new Produto("Bolo Ana Maria", 3.00, 40);
        produto1.nome = "Bolo Ana Maria";
        produto1.preco = 3.00;
        produto1.quantEstoque = 40;

        produto1.altPreco(3.50);
        produto1.altQuantidade(100);

        System.out.println("\n---- Produto Atual: -----");
        produto1.exibirInfo();

        // --- Exercício 5: Exercício 5 Criando Métodos de Propriedade (Getters e Setters) ---
        produto1.setNome("Bolo Ana Maria de Baunilia");
        produto1.setPreco(4.00);
        produto1.setQuant(80);

        System.out.println("\n ----- Produto Reescrito! -----");
        System.out.println("Novo nome do produto: " + produto1.getNome() +
                "\n Novo preço: " + produto1.getPreco() +
                "\n Nova quantidade no estoque: " + produto1.getQuant());


    }

}
