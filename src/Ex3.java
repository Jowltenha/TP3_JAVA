public class Ex3 {
    public static class Produto {
        String nome;
        double preco;
        int quantEstoque;

        // --- Exercício 3 Métodos Básicos da Classe “Produto” ---
        // Metodo para atualizar o preço
        public void alterarPreco(double novoPreco) {
            this.preco = novoPreco;
        }

        // Metodo para atualizar a quantidade em estoque
        public void alterarQuantidade(int novaQuantidade) {
            this.quantEstoque = novaQuantidade;
        }

        // Metodo para exibir as informações do produto
        public void exibirInformacoes() {
            System.out.println("Produto: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Quantidade em Estoque: " + quantEstoque);
            System.out.println("---------------------------");
        }
    }
}
