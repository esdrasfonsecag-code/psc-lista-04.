import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        // Nome
        do {
            System.out.print("Digite seu nome (mais de 3 caracteres): ");
            nome = sc.nextLine();
        } while (nome.length() <= 3);

        // Idade
        do {
            System.out.print("Digite sua idade (0 a 150): ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 150);

        // Salário
        do {
            System.out.print("Digite seu salário (maior que 0): ");
            salario = sc.nextDouble();
        } while (salario <= 0);

        sc.nextLine(); // limpar buffer

        // Sexo
        do {
            System.out.print("Digite seu sexo (f/m): ");
            sexo = sc.nextLine().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        // Estado civil
        do {
            System.out.print("Digite seu estado civil (s/c/v/d): ");
            estadoCivil = sc.nextLine().toLowerCase();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("\nDados validados com sucesso!");
        sc.close();
    }
}
