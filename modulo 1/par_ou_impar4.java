import java.util.Scanner;

public class par_ou_impar4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = ent.nextInt();

        if (num %2 ==0){
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é ímpar!");
        }
    }
}
