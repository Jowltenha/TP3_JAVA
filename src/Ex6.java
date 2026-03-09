public class Ex6 {
    public static class Produto {
        // --- Exercício 6 Adicionando Construtores à Classe “Produto” ---
        // Atributos
        String nome;
        double preco;
        int quantEstoque;

        // Contrutor
        public Produto(String nome, double preco, int quantEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantEstoque = quantEstoque;
        }

        public void exibirInformacoes() {
            System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantEstoque);
        }

        // Metodo Main para exemplificar o uso
        public static void main(String[] args) {
            // Criando o objeto em uma única linha usando o construtor
            Produto novoProduto = new Produto("Suco de Laranja 1L", 12.90, 24);

            // Exibindo para confirmar a atribuição
            novoProduto.exibirInformacoes();
        }
    }
}