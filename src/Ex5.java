public class Ex5 {
    public static class Produto {
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

        // --- Exercício 5: Exercício 5 Criando Métodos de Propriedade (Getters e Setters) ---

        // --- MÉTODOS GET (Leitura) ---
        public String getNome() {return nome;}
        public double getPreco() {return preco;}
        public int getQuant() {return quantEstoque;}

        // --- MÉTODOS SET (Atualização) ---
        public void setNome(String nome) {this.nome = nome;}
        public void setPreco(double preco) {this.preco = preco;}
        public void setQuant(int quantEstoque) {this.quantEstoque = quantEstoque;}


        public void exibir() {
            System.out.println(getNome() + " | R$ " + getPreco() + " | Estoque: " + getQuant());
        }

        static void main() {
            Produto prod = new Produto("Arroz", 5.60, 100);
            System.out.println("Estado inicial");
            prod.exibir();

            // set para atualizar os atributos
            prod.setPreco(9.75);
            prod.setNome("Arroz branco Deluxe");
            prod.setQuant(85);

            // get para confirmar a atualização
            System.out.println("Confirmação de alteração");
            System.out.println("Novo nome:" + prod.getNome());
            System.out.println("Novo Preço: R$" + prod.getPreco());

            System.out.println("Estado final!");
            prod.exibir();
        }
    }
}
