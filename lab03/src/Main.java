public class Main {
    public static void main(String[] args) {
        Double d = 4.5;
        double dd = d / 2;

//        System.out.println("Jumatatea : " + dd);

//        Double jumi = Double.valueOf(dd);

//        System.out.println("Jumatatea :" + jumi.doubleValue());

//        myDoubleMethod(d);
//        System.out.println("My primitive now is:" + d);

        myDoubleWrapperMethod(d);
        System.out.println("My wrapper now is:" + d);

    }

    static void myDoubleMethod(double d) {
        System.out.println("Got my primitive :" + d);
        d = d*2;
        System.out.println("My primitive now is:" + d);
    }

    static void myDoubleWrapperMethod(Double d) {
        System.out.println("Got my wrapper :" + d);
        d = d * 2;
        System.out.println("My wrapper now is:" + d);
    }
}