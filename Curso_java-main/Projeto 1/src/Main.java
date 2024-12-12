import java.util.Scanner;


public class Main {
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        Menu();

    }

    public static void Menu() {

        int escolha = 10;
        while (escolha != 0) {
            System.out.println("------MENU------");
            System.out.println("0 - Encerrar o programa");
            System.out.println("1 - Operar com números decimais");
            System.out.println("2 - Operar com números inteiros");
            escolha = ent.nextInt();
            if (escolha == 0) {
                System.out.println("Encerrando o programa");
                break;
            } else if (escolha == 1) {
                while (escolha != 0) {
                    System.out.println("------MENU------");
                    System.out.println("0 - Voltar ao menu");
                    System.out.println("1 - Fazer uma operação");
                    escolha = ent.nextInt();
                    if (escolha == 0) {
                        Menu();
                    } else if (escolha == 1) {
                        operacao_deci();
                    }
                }
            } else if (escolha == 2) {
                while (escolha != 0) {
                    System.out.println("------MENU------");
                    System.out.println("0 - Voltar ao menu");
                    System.out.println("1 - Fazer uma operação");
                    escolha = ent.nextInt();
                    if (escolha == 0) {
                        Menu();
                    } else if (escolha == 1) {
                        operacao_int();
                    }
                }
            } else {
                System.out.println("Opção incorreta!");
            }
        }
    }

    public static void operacao_deci() {
        System.out.println("Operações Disponíveis:");
        System.out.println("Adição (+)");
        System.out.println("Subtração (-)");
        System.out.println("Multiplicação (*)");
        System.out.println("Divisão (/)");
        System.out.println("Resto da divisão (%)");
        
        System.out.println("Digite o primeiro número: ");
        double num1 = ent.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = ent.nextDouble();
        ent.nextLine();
        System.out.println("Digite a operação que deseja: ");
        char operacao = ent.nextLine().charAt(0);
        while (true) {
            switch (operacao) {
                case '+':
                    double resultado = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, resultado);
                    return;
                case '-':
                    double resultado2 = num1 - num2;
                    System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, resultado2);
                    return;
                case '*':
                    double resultado3 = num1 * num2;
                    System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, resultado3);
                    return;
                case '/':
                    double resultado4 = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, resultado4);
                    return;

                case '%':
                    double resultado5 = num1 % num2;
                    System.out.printf("%.2f % %.2f = %.2f\n", num1, num2, resultado5);
                    return;

                default:
                    System.out.println("Valor Incorreto!. Tente Novamente!");
                    return;
            }

        }
    }
    public static void operacao_int() {
        System.out.println("Operações Disponíveis:");
        System.out.println("Adição (+)");
        System.out.println("Subtração (-)");
        System.out.println("Multiplicação (*)");
        System.out.println("Divisão (/)");
        System.out.println("Resto da divisão (%)");
        System.out.println("Potenciação (^)");


        System.out.println("Digite o primeiro número: ");
        int num1_int = ent.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2_int = ent.nextInt();
        ent.nextLine();
        System.out.println("Digite a operação que deseja: ");
        char operacao1 = ent.nextLine().charAt(0);
        while (true) {
            switch (operacao1) {
                case '+':
                    int resultado = num1_int + num2_int;
                    System.out.printf("%d + %d = %d\n", num1_int, num2_int, resultado);
                    return;
                case '-':
                    int resultado2 = num1_int - num2_int;
                    System.out.printf("%d - %d = %d\n", num1_int, num2_int, resultado2);
                    return;
                case '*':
                    int resultado3 = num1_int * num2_int;
                    System.out.printf("%d * %d = %d\n", num1_int, num2_int, resultado3);
                    return;
                case '/':
                    int resultado4 = num1_int / num2_int;
                    System.out.printf("%d / %d = %d\n", num1_int, num2_int, resultado4);
                    return;

                case '%':
                    int resultado5 = num1_int % num2_int;
                    System.out.printf("%d % %d = %d\n", num1_int, num2_int, resultado5);
                    return;
                case '^':
                    int resultado6 = (int) Math.pow(num1_int, num2_int);
                    System.out.printf("%d ^ %d = %d\n", num1_int, num2_int, resultado6);
                    return;

                default:
                    System.out.println("Valor Incorreto!. Tente Novamente!");
                    return;
                }

            }
        }
}
