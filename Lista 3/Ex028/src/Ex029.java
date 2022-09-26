import java.util.Scanner;

// Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o
// valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.
public class App {
    public static void main(String[] args) throws Exception {
        int qtdCd, valorCD, soma, media;
        soma = 0;
        media = 1;
        try (Scanner tc = new Scanner(System.in)) {
            System.out.println("Quantos CDs tem na sua coleção? ");
            qtdCd = tc.nextInt();
            for (int i = 1; i <= qtdCd; i++) {
                System.out.println("Qual o valor do CD número " + i + "?");
                valorCD = tc.nextInt();
                soma = soma + valorCD;
                if(i == qtdCd){
                    media = soma / qtdCd;
                }
            }
        }
        System.out.println("O valor total da coleção é de "+soma+", com uma média de "+media+" reais.");
    }
}