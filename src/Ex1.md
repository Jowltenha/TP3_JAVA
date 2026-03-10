# 1. Conceitos Fundamentais
- ***Classe:*** É a "planta" (blueprint). Ela define quais características e comportamentos algo deve ter, mas não é o objeto em si.
- ***Atributos (Campos):*** São as características ou dados da classe. Eles definem o estado de um objeto (o que ele "tem").
- ***Métodos:*** São as ações ou funções. Eles definem o comportamento do objeto (o que ele "faz").
- ***Objeto:*** É a instância real da classe.

# 2. Exemplo Prático em Java: Classe Bicicleta
Utilizando o exemplo de uma bicicleta para ilustrar como os campos e métodos interagem:
    
    // 1. Declaração da Classe
    public class Bicicleta {
    
        // 2. Atributos (Campos)
        public String marca;
        public double velocidadeAtual;
    
        // 3. Método que manipula os campos
        public void acelerar(double incremento) {
            velocidadeAtual = velocidadeAtual + incremento;
            System.out.println("A bicicleta " + marca + " agora está a " + velocidadeAtual + " km/h.");
        }
    
        public static void main(String[] args) {
            // 4. Criação de um Objeto (Instanciação)
            Bicicleta minhaBike = new Bicicleta();
            
            // Atribuindo valores aos campos do objeto
            minhaBike.marca = "Caloi";
            minhaBike.velocidadeAtual = 10.0;
    
            // Chamando o método
            minhaBike.acelerar(5.0);
        }
    }
# 3. Relação Teoria x Prática

- ***Classe (Bicicleta):*** Define que toda bicicleta no nosso sistema terá uma marca e uma velocidade.

- ***Atributos (marca, velocidadeAtual):*** Armazenam os dados específicos. No exemplo, o objeto guarda o texto "Caloi" e o número 10.0.

- ***Método (acelerar):*** É a lógica que altera o estado do objeto. Ele pega o valor atual da velocidade e soma o novo incremento.

- ***Objeto (minhaBike):*** É o representante real. Podemos criar vários objetos (como bikeDoAmigo), e cada um terá sua própria marca e sua própria velocidade independente.