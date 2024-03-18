import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Gera um número aleatório de 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;

        // Define o número máximo de tentativas
        int tentativasMaximas = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        // Loop para as tentativas
        for (int tentativa = 1; tentativa <= tentativasMaximas; tentativa++) {
            System.out.println("Tentativa " + tentativa + ": Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente novamente. Seu palpite é muito baixo.");
            } else {
                System.out.println("Tente novamente. Seu palpite é muito alto.");
            }

            if (tentativa == tentativasMaximas) {
                System.out.println("Você atingiu o número máximo de tentativas. O número correto era: " + numeroAleatorio);
            }
        }

        scanner.close();
    }
}