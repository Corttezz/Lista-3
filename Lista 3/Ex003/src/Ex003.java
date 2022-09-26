import java.util.Scanner;
// Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres;
// Idade: entre 0 e 150;
// Salário: maior que zero;
// Sexo: 'f' ou 'm';
// Estado Civil: 's', 'c', 'v', 'd';
public class Ex003 {
    public static void main(String[] args) throws Exception {
        String nome, sexo, estadoCivil;
        int idade, salario;
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        nome = tc.next();
        while(nome.length() < 3){
            System.out.println("Nome inválido. Digite outro nome: ");
            nome = tc.next();
        }

        System.out.println("Qual sua idade? ");
        idade = tc.nextInt();
        while(idade <0 || idade >150){
            System.out.println("Idade inválida. Digite outra idade.");
            idade = tc.nextInt();
        }

        System.out.println("Qual seu salário? ");
        salario = tc.nextInt();
        while(salario < 0){
        System.out.println("Salário inválido. Digite outro salário:");
        salario = tc.nextInt();
    }

        System.out.println("Qual seu sexo? Responda com: M ou F. ");
        sexo = tc.next();
        while(! sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo inválido. Digite outro sexo.");
            sexo = tc.next();
        }
        System.out.println("Qual seu estado civil? Responda com: s, c, v ou d.");
        estadoCivil = tc.next();
        while( !estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")){
            System.out.println("Estado civil inválido. Digite novamente: ");
            estadoCivil = tc.next();
        }
        tc.close();
        System.out.println("Tudo validado com sucesso!");
    }
}
