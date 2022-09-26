import java.util.Scanner;

// Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média
// de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, 
// adulta ou idosa, conforme a média calculada.
public class Ex025 {
    public static void main(String[] args) throws Exception {
        int quantidade, idade, media, soma;
        media = 1;
        soma = 0;
        try (Scanner tc = new Scanner(System.in)) {
            System.out.println("Quantas pessoas tem na turma? ");
            quantidade = tc.nextInt();
            for(int i = 1; i <= quantidade; i++){
                System.out.println("Digite a idade da pessoa "+i+":");
                idade = tc.nextInt();
                soma = soma + idade;
                if(i == quantidade){
                    media = soma/quantidade;
                }
            }
            if(media <= 25 && media > 0){
                System.out.println("Turma jovem. Com média de "+media);
            }else if(media > 25 && media <= 60){
                System.out.println("Turma adulta. Com média de "+media);
            }else{
                System.out.println("Turma idosa. Com média de "+media);
            } 
        }
    }
}
