package FormasGeo;

public class TestaFiguras {
    public static void main() {
        Circulo meuCirculo = new Circulo();
        meuCirculo.raio = 3.0;

        Esfera minhaEsfera = new Esfera();
        minhaEsfera.raio = 5.0;

        double areaCalculada = meuCirculo.calcularArea();
        double volumeCalculado = minhaEsfera.calcularVolume();

        System.out.println("----- Teste de Figuras Geométricas -----");

        System.out.println("Círculo:");
        System.out.println(" - Raio: " + meuCirculo.raio);
        System.out.println(" - Área calculada: " + areaCalculada);

        System.out.println("\nEsfera:");
        System.out.println(" - Raio: " + minhaEsfera.raio);
        System.out.println(" - Volume calculado: " + volumeCalculado);

        System.out.println("----------------------------------------");
    }
}
