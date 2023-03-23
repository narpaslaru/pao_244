package test;

import java.util.Objects;

public class Main {
    private String nume = "Test";
    public static void main(String[] args) {
        Main main = new Main();
        main.nume = null;
        Main main2 = new Main();
        main2.nume = null;

//        System.out.println(main == main2);
//        System.out.println(main.equals(main2));

//        System.out.println(main.nume == main2.nume);

        Class<? extends Main> aClass = main.getClass();
//        System.out.println("Main: " + aClass);
//        System.out.println("Args: " + args.getClass());
//
//        System.out.println(aClass.getCanonicalName());

//        System.out.println("" + main);
//        System.out.println("" + main.toString());
        System.out.println("" + main.getClass().getName() + "@" + Integer.toHexString(main.hashCode()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return Objects.equals(this.nume, main.nume);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nume);
//    }

    @Override
    public String toString() {
        return "Main{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
