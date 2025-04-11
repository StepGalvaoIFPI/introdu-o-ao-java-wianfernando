import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura:");
        double altura = Double.valueOf(entrada.nextDouble());

        System.out.println("Digite a base:");
        double base = Double.valueOf(entrada.nextDouble());

        double area = (base * altura)/2;
        System.out.println("Area = "+area+"");

        entrada.close();
    }
}
