package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a, b;
        Scanner f = null;
        try {
            f = new Scanner(new File("numere.txt"));
            a = f.nextInt();
            b = f.nextInt();
            double r;
            r = a / b;
            System.out.println(r);
        } catch (FileNotFoundException e) {
            System.out.println("Fisier inexistent");
        } catch (InputMismatchException e) {
            System.out.println("Format incorect al unui numar");
        } catch (ArithmeticException e) {
            System.out.println("Impartire la 0");
        } finally {
            f.close();
            System.out.println("Bloc finally");
        }

        // try-with-resources
        try (Scanner sc = new Scanner(new File("numere.txt"))) {

        } catch (FileNotFoundException e) {
            System.out.println("Fisier inexistent");
        } catch (InputMismatchException e) {
            System.out.println("Format incorect al unui numar");
        } catch (ArithmeticException e) {
            System.out.println("Impartire la 0");
        } finally {
            // no need to explicitly call sc.close()
            System.out.println("Bloc finally");
        }
    }
}