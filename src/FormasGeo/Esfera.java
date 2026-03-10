package FormasGeo;

public class Esfera {
// Atributo principal para definir o volume e a superfície da esfera
    double raio;

    double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (this.raio * this.raio * this.raio);
    }
}
