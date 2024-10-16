import java.util.Scanner;

public class cod_idade9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = ent.nextInt();

        boolean inclusivc = idade>=16 && idade<=18;
        boolean maior_65 = idade>65;

        System.out.println(inclusivc);
        System.out.println(maior_65);
    }
}
