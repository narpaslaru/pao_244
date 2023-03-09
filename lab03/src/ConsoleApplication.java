import java.util.Scanner;

/**
 * Aceasta clasa este interfata aplicatiei
 * De aici se citesc de la consola operatiunile aplicatiei
 */
public class ConsoleApplication {
    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println("***** My Pet Shop App *****");
        System.out.println("***************************");

        System.out.println();
        System.out.println("Comenzile disponibile:");
        System.out.println("1. Login");
        System.out.println("2. Logout");
        System.out.println("Astept comanda inaltimea voastra!");

        Scanner sc = new Scanner(System.in);
        Integer comanda = sc.nextInt();
        switch (comanda) {
            case 1:
                System.out.println("Inteleg ca vreti sa va logati in system. Cum indrazniti?");
                break;
            case 2:
                System.out.println("Bye! Bye!");
                break;
            default:
                System.out.println("Comanda gresita! E asa greu sa alegi 1 sau 2?");
        }
        System.out.println("Game over!");
    }
}
