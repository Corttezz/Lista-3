// A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que
// gere a série até que o valor seja maior que 500.
 public class Ex016 {
    public static void main(String[] args) throws Exception {
        int fibo, a, b;
        a = 0;
        b = 1;
        fibo = 1;
        if(fibo == 1){
         System.out.println("0");
         System.out.println("1");
        }
            while(fibo < 500){
            fibo = a +b;
            a = b;
            b = fibo;
            if(fibo<500 && fibo >= 0){
            System.out.println(fibo);
            };
        }
    }
}
