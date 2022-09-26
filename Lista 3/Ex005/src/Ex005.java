import java.util.Scanner;

// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento 
// iniciais. Valide a entrada e permita repetir a operação.
public class Ex005 {
    public static void main(String[] args) throws Exception {
        int populaçãoA, populaçãoB, ano;
        double taxaA, taxaB;
        ano = 0;
        Scanner tc = new Scanner(System.in);
        System.out.println("Informe população da cidade A:");
        populaçãoA = tc.nextInt();
        while (populaçãoA < 0) {
            System.out.println("População tem que ser maior que 0. Digite novamente:");
            populaçãoA = tc.nextInt();
        }
        System.out.println("Informe a taxa de crescimento:");
        taxaA = tc.nextDouble();

        System.out.println("Infome a população da cidade B:");
        populaçãoB = tc.nextInt();
        while (populaçãoB < 0) {
            System.out.println("População tem que ser maior que 0. Digite novamente:");
            populaçãoA = tc.nextInt();
        }
        System.out.println("Informe a taxa de crescimento:");
        taxaB = tc.nextDouble();
        tc.close();

        if (populaçãoA < populaçãoB) {
            while (populaçãoA < populaçãoB) {
                populaçãoA = (int) (populaçãoA * (1 + (taxaA/100)));
                populaçãoB = (int) (populaçãoB * (1 + (taxaB/100)));
                ano++;
            }
            System.out.println("População da cidade A irá ultrapassar da B em: " + ano + " anos.");
        } else {
            System.out.println("População da cidade A já é maior.");
        }
    }
}
