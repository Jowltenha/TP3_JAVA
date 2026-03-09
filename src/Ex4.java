public class Ex4 {
    public static class Produto {
        String nome;
        double preco;
        int quantidadeEmEstoque;

        public void alterarPreco(double novoPreco) {
            this.preco = novoPreco;
        }

        public void alterarQuantidade(int novaQuantidade) {
            this.quantidadeEmEstoque = novaQuantidade;
        }

        public void exibirInformacoes() {
            System.out.println("Produto: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
        }
    }
}
