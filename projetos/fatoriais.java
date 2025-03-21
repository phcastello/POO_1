package projetos;
import java.util.Scanner;

class fatorial{
    public static long calculate(int n){
        long fatorial = 1;
        for(int i=1; i <= n; i++){
            fatorial *= i;
        }
        return fatorial;
    }
    public static long calculateRecursive(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * calculateRecursive(n-1);
    }
}

public class fatoriais{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite um número inteiro: ");
            int n = scanner.nextInt();
            if(n < 0){
                System.out.println("Número inválido");
            }
            else{
                System.out.println("Fatorial de " + n + " (iterativo): " + fatorial.calculate(n));
                System.out.println("Fatorial de " + n + " (recursivo): " + fatorial.calculateRecursive(n));
            }
        }
    }
}