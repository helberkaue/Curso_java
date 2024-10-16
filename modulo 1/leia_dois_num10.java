import java.util.Scanner;

public class leia_dois_num10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = ent.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = ent.nextDouble();

        double soma = num1 + num2;

        System.out.println(soma);
    }
}
