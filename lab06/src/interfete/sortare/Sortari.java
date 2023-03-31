package interfete.sortare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Vom aplica sortari in functie de anumite criterii
 */
public class Sortari {
    public static void main(String[] args) {
        Student[] grupa244 = new Student[7];
        grupa244[0] = new Student("Aciu Malina-Andreea", 20, 160, 9.5f);
        grupa244[5] = new Student("Aldea Alexia", 21, 179, 8.7f);
        grupa244[3] = new Student("Balescu Alexandru", 20, 185, 8.5f);
        grupa244[4] = new Student("Boboc Oana", 22, 165, 7.5f);
        grupa244[2] = new Student("Brustur Erwin", 24, 175, 6.5f);
        grupa244[1] = new Student("Bucur Denisa", 23, 171, 8.5f);
        grupa244[6] = new Student("Clinciu Diana", 19, 181, 9.5f);

        System.out.println("Lista initiala");
        listeazaStudenti(grupa244);
        System.out.println("End");

        // sortare naturala - se foloseste compareTo din interfata Comparable
        Arrays.sort(grupa244);

        System.out.println("Lista sortata alfabetic");
        listeazaStudenti(grupa244);
        System.out.println("End");

        // sortare dupa varste, folosindu-se un obiect comparator
        Arrays.sort(grupa244, new ComparatorVarste());

        System.out.println("Lista sortata dupa varsta");
        listeazaStudenti(grupa244);
        System.out.println("End");

        // sortare dupa medii, clasa anonima
        Arrays.sort(grupa244, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMedie() == o2.getMedie()) return 0;
                return (o1.getMedie() > o2.getMedie()) ? 1 : -1;
            }
        });

        System.out.println("Lista sortata dupa medii");
        listeazaStudenti(grupa244);
        System.out.println("End");

        // EXTRA: interfata cu o singura metoda => lambda expression
        // sortare dupa inaltime
        Arrays.sort(grupa244, (o1, o2) -> {
            if (o1.getInaltimeInCm() == o2.getInaltimeInCm()) return 0;
            return (o1.getInaltimeInCm() > o2.getInaltimeInCm()) ? 1 : -1;
        });

        System.out.println("Lista sortata dupa inaltime");
        listeazaStudenti(grupa244);
        System.out.println("End");
    }

    private static void listeazaStudenti(Student[] grupa244) {
        for (int i = 0; i < grupa244.length; i++) {
            System.out.println(grupa244[i]);
        }
    }
}
