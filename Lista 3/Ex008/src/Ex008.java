import java.util.Scanner;
//Faça um programa que leia 5 números e informe a soma e a média dos números.
public class Ex008 {
    public static void main(String[] args) throws Exception {
        int i, num, soma, media;
        i = 1;
        try (Scanner tc = new Scanner(System.in)) {
            System.out.print("Número "+i+":");
            num = tc.nextInt();
            soma = num;
            media = 0;
            for(i = 2;  i <=5 ; i++){
                System.out.print("Número "+i+":");
                num = tc.nextInt();
                soma = soma + num;
                media = soma / 5;  
            }
        }
        System.out.println("A soma dos números é de: "+soma+", a média é de "+media+".");
    }
}
