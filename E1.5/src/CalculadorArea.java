public class CalculadorArea {
    public static double calcularAreaTotal (FormaGeometrica[] figuras){
        double areaTotal = 0;
        for (FormaGeometrica figura : figuras) {
            areaTotal += figura.calcularArea ();
        }
        return areaTotal;



}
}
