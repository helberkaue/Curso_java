import java.util.Scanner;
public class leia_nome7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = ent.nextLine();

        System.out.printf("BOAS-VINDAS! %s",nome);

    }
}
