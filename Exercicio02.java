import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = sc.nextLine();
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Senha não pode ser igual ao usuário. Tente novamente.");
            }
        } while (senha.equals(usuario));

        System.out.println("Cadastro realizado com sucesso!");
        sc.close();
    }
}
