import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        double Celsius = Double.valueOf(entrada.nextDouble());

        double Fahrenheit = (Celsius * 1.8 + 32);
        double Kelvin = (Fahrenheit + 459.67)/1.8;

        System.out.println("Celsius = " +Celsius);
        System.out.println("Fahrenheit = " +Fahrenheit);
        System.out.println("Kelvin = " +Kelvin);

        entrada.close();
    }
}
