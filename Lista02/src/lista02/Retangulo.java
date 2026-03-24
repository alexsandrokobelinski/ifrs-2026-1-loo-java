package lista02;

public class Retangulo {

    double base;
    double altura;

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return 2 * (base + altura);
    }
}