import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura:");
        double altura = Double.valueOf(entrada.nextDouble());

        System.out.println("Digite a largura:");
        double largura = Double.valueOf(entrada.nextDouble());

        double area = (altura * largura);
        double perimetro = (2 * altura + 2 * largura);

        System.out.println("Area =" +area);
        System.out.println("perimetro =" +perimetro);

        entrada.close();
    }
}
