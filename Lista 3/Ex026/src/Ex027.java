import java.util.Scanner;

// Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. 
// Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
public class Ex027 {
    public static void main(String[] args) throws Exception {
        int candidato1, candidato2, candidato3, eleitores;
        String candidato;
        candidato1 = 0;
        candidato2 = 0;
        candidato3 = 0;
        System.out.println("Quantos eleitores vão votar? ");
        try (Scanner tc = new Scanner(System.in)) {
            eleitores = tc.nextInt();
            for(int i = 1; i <= eleitores; i++){
                System.out.println("Eleitor número "+i+", em quem você vai votar? Responda com: 1, 2 ou 3");
                candidato = tc.next();
                if("1".equalsIgnoreCase(candidato)){
                    candidato1 = candidato1 + 1;
                }
                if("2".equalsIgnoreCase(candidato)){
                    candidato2 = candidato2 + 1;
                }
                if("3".equalsIgnoreCase(candidato)){
                    candidato3 = candidato3 + 1;
                }else{
                    System.out.println("Candidato inválido.");
                }
            }
        }
        System.out.println("O canditado 1 teve "+candidato1+" votos.");
        System.out.println("O canditado 2 teve "+candidato2+" votos.");
        System.out.println("O canditado 3 teve "+candidato3+" votos.");
    }
}
