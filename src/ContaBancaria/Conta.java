package ContaBancaria;

// --- Exercício 7 Modelando uma Conta Bancária ---
public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    // --- Exercício 8 Criando Métodos ---
    void saca(double valor) {
        this.saldo -= valor;
        System.out.println("\n---- Saque  ----");
        System.out.println("Saque feito de: R$" + valor);
    }

    void deposita(double valor) {
        this.saldo += valor;
        System.out.println("\n---- Deposito ----");
        System.out.println("Deposito feito de: R$" + valor);
    }

    double calculaRendimento() {
        return this.saldo *= 0.1;
    }

    // Fiz um construtor para facilitar
    public Conta(String titulo, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titulo;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;

    }
}

