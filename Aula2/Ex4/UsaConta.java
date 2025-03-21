package Aula2.Ex4;

import java.util.*;

public class UsaConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta1 = new Conta(1000.00);
        Conta conta2 = new Conta(150.00);

        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());

        System.out.print("Digite o valor de retirada da conta1: ");
        double qtdeRetirada1 = scanner.nextDouble();
        System.out.printf("Subtraindo %.2f do saldo da conta1\n\n", qtdeRetirada1);
        conta1.debitar(qtdeRetirada1);

        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());

        System.out.print("Digite o valor de retirada da conta2: ");
        double qtdeRetirada2 = scanner.nextDouble();
        System.out.printf("Subtraindo %.2f do saldo da conta2\n\n", qtdeRetirada2);
        conta2.debitar(qtdeRetirada2);

        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());

        scanner.close();
    }
}