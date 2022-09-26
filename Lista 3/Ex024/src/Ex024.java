import java.util.Scanner;
//Faça um programa que calcule o mostre a média aritmética de N notas.
public class Ex024 {
    public static void main(String[] args) throws Exception {
        int nota, soma, media, quantidade;
        soma = 0;
        media = 1;
        try (Scanner tc = new Scanner(System.in)) {
            System.out.println("Quantas notas? ");
            quantidade = tc.nextInt();
            int i = 1;
            for(i = 1; i <= quantidade; i++){
                System.out.println("Digite a "+ i +" nota: ");
                nota = tc.nextInt();
                soma = soma + nota;
                if(i == quantidade){
                    media = soma / quantidade;
                }
            }
        }
        System.out.println("A média das notas é de: "+media);
    }
}
