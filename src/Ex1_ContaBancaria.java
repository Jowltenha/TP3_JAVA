public class Ex1_ContaBancaria {
    //  Conceitos de Classe, Objeto, Campos e Métodos
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito de R$" + valor + " realizado para " + titular);
    }

    public static void main(String[] args) {
        Ex1_ContaBancaria minhaConta = new Ex1_ContaBancaria();

        minhaConta.titular = "Alex Silva";
        minhaConta.saldo = 500.00;

        minhaConta.depositar(150.00);

        System.out.println("Saldo atual: R$" + minhaConta.saldo);

    }
}
