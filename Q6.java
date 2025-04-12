import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salario:");
        double salario = Double.valueOf(entrada.nextDouble());

        double imposto = (0.10 * salario);
        double salario_final = (salario - imposto);

        System.out.println("Salario = " +salario);
        System.out.println("Imposto = " +imposto);
        System.out.println("Salario Final = " +salario_final);

        entrada.close();

    }
}
