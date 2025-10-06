import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();
            soma += numero;
        }

        media = soma / 5.0;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}
