import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura:");
        double altura = Integer.valueOf(entrada.nextLine());

        System.out.println("Digite a base:");
        double base = Integer.valueOf(entrada.nextLine());

        double area = (base * altura)/2;
        System.out.println(area);

        entrada.close();
    }
}
