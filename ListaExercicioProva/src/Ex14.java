import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("De acordo com a equação de 2 grau");
        System.out.println("a*(x^2) + bx + c = 0");
        System.out.println("Digite o valor de a: ");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = teclado.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = teclado.nextInt();

        int delta = (b*b)-4*a*c;

        if(delta < 0){
            System.out.println("Não existe raizes reais.");
        }else if (delta == 0){
            double raiz = Math.sqrt(delta);
            double resultado = (-b + raiz)/(2*a);
            System.out.println("Raizes são iguais");
            System.out.println("x1 é " + resultado);
            System.out.println("x2 é " + resultado);
        }else{
            double raiz = Math.sqrt(delta);
            double resultado1 = (-b + raiz)/(2*a);
            double resultado2 = (-b - raiz)/(2*a);
            System.out.println("Raizes são Diferentes");
            System.out.println("x1 é " + resultado1);
            System.out.println("x2 é " + resultado2);
        }



    }
}
