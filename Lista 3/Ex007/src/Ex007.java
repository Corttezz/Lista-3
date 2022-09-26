import java.util.Scanner;
//Faça um programa que leia 5 números e informe o maior número.
public class Ex007 {
    public static void main(String[] args) throws Exception {
        int num, maior;
        int i = 1;
        System.out.println("Número "+i+":");
        try (Scanner tc = new Scanner(System.in)) {
            num = tc.nextInt();
            maior = num;
            for(i = 2; i <= 5; i++){
                System.out.println("Número "+i+":");
                num = tc.nextInt();
                if(num > maior){
                    maior = num;
                }
            }
            System.out.println("O maior número é: "+maior+".");
        }
    }
}
