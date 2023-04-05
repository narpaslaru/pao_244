package enums;

public class Test {
    public static void main(String[] args) {
        for (ZileleSaptamanii zi : ZileleSaptamanii.values()) {
            System.out.println("Ziua "+zi.name()+" are indexul "+zi.ordinal());
            System.out.println("Ziua "+zi.getSimbol()+" cu id-ul "+zi.getIndex());
        }
    }
}
