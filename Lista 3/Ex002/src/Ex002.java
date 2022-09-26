import java.util.Scanner;
//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
//mostrando uma mensagem de erro e voltando a pedir as informações.
public class Ex002 {
    public static void main(String[] args) throws Exception {
        String nome, senha;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome do usário: ");
        nome = tc.next();
        System.out.println("Digite a sua senha: ");
        senha = tc.next();

        while(nome.equals(senha)){
        System.out.println("ERRO: o nome de usuário não pode ser igual a senha, tente novamente");
        System.out.println("Digite o nome do usário: ");
        nome = tc.next();
        System.out.println("Digite a sua senha: ");
        senha = tc.next();
        }
        tc.close();
    }
}
