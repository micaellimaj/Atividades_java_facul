import java.util.Scanner;

public class CalculadoraFatorial {

    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro para calcular o fatorial
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Fecha o Scanner após a leitura
        scanner.close();

        // Calcula o fatorial do número fornecido
        long fatorial = calcularFatorial(numero);

        // Exibe o resultado do fatorial
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    // Função para calcular o fatorial de um número
    private static long calcularFatorial(int numero) {
        if (numero < 0) {
            // Fatorial não é definido para números negativos
            return -1;
        } else if (numero == 0 || numero == 1) {
            // O fatorial de 0 e 1 é 1
            return 1;
        } else {
            // Calcula o fatorial para números maiores que 1
            long resultado = 1;
            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
