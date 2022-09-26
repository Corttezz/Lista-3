import java.util.Scanner;

// Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas
// e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
public class Ex027 {
    public static void main(String[] args) throws Exception {
        int turmas, qtdAlunos, soma, media;
        qtdAlunos = 0;
        soma = 0;
        media = 1;
        try (Scanner tc = new Scanner(System.in)) {
            System.out.println("Quantas turmas?");
            turmas = tc.nextInt();
            for(int i = 1; i <= turmas; i++){
                System.out.println("Quantos alunos tem na turma "+i+"?");
                qtdAlunos = tc.nextInt();
                while(qtdAlunos > 40){
                    System.out.println("Digite uma turma com menos de 40 alunos:");
                    qtdAlunos = tc.nextInt();
                }
                soma = soma + qtdAlunos;
                if(i == turmas){
                    media = soma / turmas;
                }
            }
        }
        System.out.println("A média de alunos das turmas é de "+media+" alunos.");
    }
}
