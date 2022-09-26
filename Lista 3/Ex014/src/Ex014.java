import java.util.Scanner;

// Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares
// e a quantidade de números impares.
public class Ex014 {
    public static void main(String[] args) throws Exception {
        int num, par, impar, i;       
        try (Scanner tc = new Scanner(System.in)) {
            par = 0;
            impar = 0;
            for(i = 1; i <= 10; i++){
                System.out.print("Numero "+ i +": ");
                num = tc.nextInt();
                if(num %2 ==0){
                    par++;
                }else{
                    impar++;
                }
            }
        }
        System.out.println(par+" números pares e "+impar+" números impares.");
    }
}
