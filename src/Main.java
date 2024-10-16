import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Eliana Camila Guevara

        Scanner entrada = new Scanner(System.in);
        int op;

        do {
            System.out.println("1. Circulo");
            System.out.println("2. Piramide");
            op = entrada.nextInt();

            switch (op) {
                case 1:

                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = entrada.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("El área del círculo es: " + circulo.area());
                    break;

                case 2:
                    System.out.print("Ingrese el lado de la base de la pirámide: ");
                    double lado = entrada.nextDouble();
                    System.out.print("Ingrese la altura de la pirámide: ");
                    double altura = entrada.nextDouble();
                    Piramide piramide = new Piramide(lado, altura);
                    System.out.println("El área de la pirámide es: " + piramide.area());
                    break;

            }
        } while (op != 3);


    }
}