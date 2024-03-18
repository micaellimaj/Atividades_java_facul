import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        double nota4 = scanner.nextDouble();

        scanner.close();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.println("A média do aluno é: " + media);

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}