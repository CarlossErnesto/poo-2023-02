public class Main {
    public static void main(String[] args) {

    FormaGeometrica[] figuras = new FormaGeometrica[3];

    figuras [0] = new Circulo(9.0);
    figuras [1] = new Triangulo(4, 6.0);
    figuras [2] = new Retangulo(8.0,6.0);


     double areaTotal = CalculadorArea.calcularAreaTotal(figuras);
        System.out.println("A aréa total é ; " +areaTotal + "jardas ao quadrado.");


    }
}