import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salario:");
        double salario = Double.valueOf(entrada.nextDouble());

        double imposto = 0.10 * salario;

        System.out.println("Salario = " +salario);
        System.out.println("Imposto = " +imposto);

        entrada.close();
    }
}
