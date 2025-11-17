import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("||--- MATEMATICA DISCRETA ---");
        System.out.println("||--- Nada feito (ainda)");
        System.out.println("||--------- CALCULO ---------");
        System.out.println("||--- Nada feito (ainda)");
        System.out.println("||------- ESTATISTICA -------");
        System.out.println("|| -- [1] -> MMQ\n");

        System.out.print("O que você precisa calcular? ");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.print("Qual o valor de n? ");
                MMQ mmq = new MMQ(sc.nextInt());
                break;
                default:
                    System.out.println("[ERROR] --- Input Inválido");
        }

    }
}