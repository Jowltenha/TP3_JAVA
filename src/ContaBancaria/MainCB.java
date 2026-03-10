package ContaBancaria;

public class MainCB {
    // --- Exercício 9 Vamos testar nossa classe ---
    void main() {
        Conta conta = new Conta("João Pedro B", 430, "Inter", 1500, "18/07/2023");

        System.out.println("---- Dados da sua Conta! ----");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo Inicial: R$" + conta.saldo);

        conta.saca(500.0);
        System.out.println("\n Saldo atual após o saque: R$" + conta.saldo);

        conta.deposita(3000);
        System.out.println("\n Saldo atual após o deposito: R$" + conta.saldo);

        double rendeu = conta.calculaRendimento();
        System.out.println("\n Rendimento mensal atual: R$" + rendeu);

        System.out.println("\n----- DADOS DA CONTA -----");
        System.out.println("Agência: " + conta.agencia + " | Conta: " + conta.numero);
        System.out.println("Data de Abertura: " + conta.dataAbertura);
    }
}
