import java.util.Scanner;
public class operacao_aritme6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int num1 = ent.nextInt();
        int num2 = ent.nextInt();
        int num3 = ent.nextInt();
        int soma = num1 + num2+num3;

        if (soma <50){
            System.out.println(true);;
        }
        else{
            System.out.println(false);
        }


    }
}
