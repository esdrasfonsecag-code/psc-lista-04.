import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}
