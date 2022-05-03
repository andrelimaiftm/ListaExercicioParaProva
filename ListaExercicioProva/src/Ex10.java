import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        float resultado = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primerio valor inteiro: ");
        int x = entrada.nextInt();
        System.out.println("Digite o segundo valor inteiro: ");
        int y = entrada.nextInt();
        System.out.println("Digite o terceiro valor inteiro: ");
        int z = entrada.nextInt();

        System.out.println("Escolha a formula da média:");
        System.out.println("1 - Média Geometrica");
        System.out.println("2 - Média Ponderada");
        System.out.println("3 - Média Aritmética");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:  resultado = x*y*z;
                break;
            case 2:
                resultado = (x+2*y+3*z)/6;
                break;
            case 3:
                resultado = (x+y+z)/3;
                break;
            default:
                System.out.println("Opção inválida!!!");

        }
       /* if(opcao == 1){
            resultado = x*y*z;
        }else if(opcao == 2){
            resultado = (x+2*y+3*z)/6;
        }else if(opcao == 3){
            resultado = (x+y+z)/3;
        }*/

        System.out.println("O valor da média é: " + resultado);

    }
}
