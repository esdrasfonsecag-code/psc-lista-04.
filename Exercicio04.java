public class Exercicio04 {
    public static void main(String[] args) {
        double popA = 80000;
        double popB = 200000;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int anos = 0;

        while (popA < popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++;
        }

        System.out.println("Número de anos necessários: " + anos);
        System.out.printf("População A: %.0f\nPopulação B: %.0f\n", popA, popB);
    }
}
