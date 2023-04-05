package exceptions.custom;

import java.util.Random;

public class Test_StackArray {
    public static void main(String[] args) {
        StackArray st = new StackArray(3);
        Random rnd = new Random();
        for (int i = 0; i < 20; i++)
            try {
                int aux = rnd.nextInt();
                if (aux % 2 == 0)
                    st.push(1 + rnd.nextInt(100));
                else
                    st.pop();
                st.print();
            } catch (StackException ex) {
                System.out.println(ex.getMessage());
            }
    }
}