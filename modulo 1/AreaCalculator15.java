public class AreaCalculator15 {

    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularArea(double raio, boolean isCirculo) {
        return 3.14 * raio * raio;
    }

    public static void main(String[] args) {
        double ladoQuadrado = 4.0;
        double areaQuadrado = calcularArea(ladoQuadrado);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double raioCirculo = 3.0;
        double areaCirculo = calcularArea(raioCirculo, true);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}

