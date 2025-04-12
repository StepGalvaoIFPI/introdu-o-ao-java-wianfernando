import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio:");
        double raio = Double.valueOf(entrada.nextDouble());
        double pi = 3.14;

        double area = (pi * raio * raio);
        double comprimento = (2 * pi * raio);

        System.out.println("Area = " +area);
        System.out.println("Comprimento = " +comprimento);

        entrada.close();
    }
}
