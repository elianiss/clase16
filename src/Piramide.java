public class Piramide extends Figura implements Figurageo{
    private double lado;
    private double altura;

    public Piramide(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public Piramide(double x, double y, double lado, double altura) {
        super(x, y);
        this.lado = lado;
        this.altura = altura;
    }

    // Cálculo aproximado del área superficial de una pirámide cuadrada

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double area() {
        double areaBase = lado * lado;
        double areaLateral = 2 * lado * Math.sqrt((lado / 2) * (lado / 2) + altura * altura); // Área lateral
        return areaBase + areaLateral;
    }
}
