import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor = teclado.nextInt();

        //&& -> E logico
        // || -> OU logico

        //valor % 3 == 0 && valor % 5 == 0
        if(valor % 3 == 0 && !(valor % 5 == 0)){
            System.out.println("numero divisivel por 3 e não por 5");
        }else if(valor % 5 == 0 && !(valor % 3 == 0)){
            System.out.println("número divisivel por 5 e não por 3");
        }else{
            System.out.println("valor não é divisivel por 3 ou por 5");
        }
    }
}
