import java.util.Scanner;

public class CalculoDeArea {

    public static void main(String[] args){
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o raio do círculo ao usuário
        System.out.print("Digite o raio do círculo: ");

        // Lê o raio inserido pelo usuário
        double raio = scanner.nextDouble();

        // Fecha o Scanner após a leitura
        scanner.close();

        // Calcula a área do círculo usando a fórmula: área = pi * raio^2
        double area = Math.PI * Math.pow(raio, 2);

        // Exibe o resultado
        System.out.println("A área do círculo com raio" + raio + " é: " + area);
    }


}