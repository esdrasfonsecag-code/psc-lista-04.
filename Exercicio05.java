import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double popA, popB, taxaA, taxaB;
        int anos;

        String repetir;
        do {
            // Entradas
            do {
                System.out.print("População do país A (>0): ");
                popA = sc.nextDouble();
            } while (popA <= 0);

            do {
                System.out.print("População do país B (>0): ");
                popB = sc.nextDouble();
            } while (popB <= 0);

            do {
                System.out.print("Taxa de crescimento do país A (em %): ");
                taxaA = sc.nextDouble() / 100;
            } while (taxaA <= 0);

            do {
                System.out.print("Taxa de crescimento do país B (em %): ");
                taxaB = sc.nextDouble() / 100;
            } while (taxaB <= 0);

            anos = 0;
            double popACalc = popA;
            double popBCalc = popB;

            while (popACalc < popBCalc) {
                popACalc += popACalc * taxaA;
                popBCalc += popBCalc * taxaB;
                anos++;
            }

            System.out.println("\nNúmero de anos necessários: " + anos);
            System.out.printf("População A: %.0f | População B: %.0f\n", popACalc, popBCalc);

            System.out.print("Deseja repetir a operação? (s/n): ");
            repetir = sc.next();
        } while (repetir.equalsIgnoreCase("s"));

        sc.close();
    }
}
