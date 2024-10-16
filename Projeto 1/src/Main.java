import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ent.nextLine();


        System.out.printf("\nOlá, %s, bem vindo(a) a minha calculadora!\n", nome);
        System.out.print("Digite o primeiro número: ");
        double num1 = ent.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = ent.nextDouble();


        System.out.println("\nCalculando com valores decimais:");
        System.out.printf("Resultado da operação: %.2f + %.2f = %.2f\n",num1,num2,conversao_soma(num1,num2));
        System.out.printf("Resultado da operação: %.2f - %.2f = %.2f\n",num1,num2,conversao_subtracao(num1,num2));
        System.out.printf("Resultado da operação: %.2f * %.2f = %.2f\n",num1,num2,conversao_multi(num1,num2));
        System.out.printf("Resultado da operação: %.2f / %.2f = %.2f\n",num1,num2,conversao_divi(num1,num2));

        System.out.println("\nCalculando com valores inteiros:");
        System.out.printf("Resultado da operação: %d + %d = %d\n",conversao_inteiro(num1),conversao_inteiro(num2),conversao_inteiro(conversao_soma(num1,num2)));
        System.out.printf("Resultado da operação: %d - %d = %d\n",conversao_inteiro(num1),conversao_inteiro(num2),conversao_inteiro(conversao_subtracao(num1,num2)));
        System.out.printf("Resultado da operação: %d * %d = %d\n",conversao_inteiro(num1),conversao_inteiro(num2),conversao_inteiro(conversao_multi(num1,num2)));
        System.out.printf("Resultado da operação: %d / %d = %d\n",conversao_inteiro(num1),conversao_inteiro(num2),conversao_inteiro(conversao_divi(num1,num2)));


    }

    public static double conversao_soma(double num1,double num2) {
        return num1 + num2;
    }
    public static double conversao_subtracao(double num1,double num2) {
        return num1 - num2;
    }
    public static double conversao_multi(double num1,double num2) {
        return num1 * num2;
    }

    public static double conversao_divi(double num1, double num2) {
        double resultado = (num1 == 0 || num2 == 0) ? -1: num1 / num2;
        return resultado;

    }

    public static int conversao_inteiro(double num) {
        return (int) num;
    }
}