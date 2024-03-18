import java.util.Scanner;

public class TabuadaMultiplicacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();

        scanner.close();

        exibirTabuadaMultiplicacao(numero);
    }

    private static void exibirTabuadaMultiplicacao(int numero) {
        System.out.println("Tabuada de multiplicação para " + numero + ":");

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}