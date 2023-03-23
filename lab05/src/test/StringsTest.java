package test;

public class StringsTest {
    public static void main(String[] args) {
//        String exemplu = "exemplu";
//        String exemplu2 = "exe"+"mplu";
//
////        System.out.println(exemplu == exemplu2);
////        System.out.println(exemplu.equals(exemplu2));
//
//        System.out.println(exemplu2.toUpperCase());
//
//        StringBuilder sb = new StringBuilder("val initiala");
//
//        sb.append(" plus").append("test").append(1).append(3);
//
//        System.out.println(sb);

        Grupa grupa = new Grupa(244);
        Student student = new Student("Boboc Cristina", 20, grupa);
        Student student2 = new Student("Boboc Cristina", 20, grupa);
        System.out.println(student);
        System.out.println(student == student2);
        System.out.println(student.equals(student2));
    }
}

record Student(String nume, int varsta, Grupa grupa){}

class Grupa{
    public int nume;

    public Grupa(int nume) {
        this.nume = nume;
    }
}
