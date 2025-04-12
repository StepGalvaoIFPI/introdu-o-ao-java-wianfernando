import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a distancia:");
        double distancia = Double.valueOf(entrada.nextDouble());

        System.out.println("Digite  a velocidade:");
        double velocidade = Double.valueOf(entrada.nextDouble());

        double tempo = (distancia / velocidade);

        System.out.println("Tempo = " +tempo);

        entrada.close();
    }
}
