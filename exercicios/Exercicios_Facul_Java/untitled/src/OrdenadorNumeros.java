import java.util.Scanner;

public class OrdenadorNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1ª número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o 2ª número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o 3ª número: ");
        int numero3 = scanner.nextInt();

        scanner.close();

        OrdemCrescente(numero1, numero2, numero3);

    }

private static void OrdemCrescente(int a, int b, int c) {
        if (a <= b && b <= c) {
            System.out.println("Os números em ordem crescente são: " + a + ", " + b + ", " + c);
        } else if (a <= c && c <= b) {
            System.out.println("Os números em ordem crescente são: " + a + ", " + c + ", " + b);
        } else if (b <= a && a <= c) {
            System.out.println("Os números em ordem crescente são: " + b + ", " + a + ", " + c);
        } else if (b <= c && c <= a) {
            System.out.println("Os números em ordem crescente são: " + b + ", " + c + ", " + a);
        } else if (c <= a && a <= b) {
            System.out.println("Os números em ordem crescente são: " + c + ", " + b + ", " + a);
        } else {
            System.out.println("Os números em ordem crescente são: " + c + ", " + b + ", " + a);
        }
}
}