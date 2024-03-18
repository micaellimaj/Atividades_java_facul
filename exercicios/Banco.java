
public class Banco {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.mumero = 2024001;
        conta1.titular = "José";
        conta1.saldo = 500;

        Conta conta2 = new Conta();
        conta2.numero = 2004002;


        System.out.pritln("Número da conta: " + conta1.numero);
        System.out.pritln("Número da conta: " + conta2.numero);
    }
}
