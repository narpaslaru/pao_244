package exceptions.custom;

public class StackArray implements Stack {
    private Object[] stiva;
    private int varf;

    public StackArray(int nrMaximElemente) {
        stiva = new Object[nrMaximElemente];
        varf = -1;
    }

    @Override
    public void push(Object x) throws StackException {
        if (isFull())
            throw new StackException("Nu pot să adaug un element într-o stivă plină!");
        stiva[++varf] = x;
    }

    @Override
    public Object pop() throws StackException {
        if (isEmpty())
            throw new StackException("Nu pot să extrag un element dintr-o stivă vidă!");
        Object aux = stiva[varf];
        stiva[varf--] = null;
        return aux;
    }

    @Override
    public Object peek() throws StackException {
        if (isEmpty())
            throw new StackException("Nu pot să accesez elementul din vârful unei stive vide!");
        return stiva[varf];
    }

    @Override
    public boolean isEmpty() {
        return varf == -1;
    }

    @Override
    public boolean isFull() {
        return varf == stiva.length - 1;
    }

    @Override
    public void print() throws StackException {
        if (isEmpty())
            throw new StackException("Nu pot să afișez o stivă vidă!");
        System.out.println("Stiva: ");
        for (int i = varf; i >= 0; i--)
            System.out.print(stiva[i] + " ");
        System.out.println();
    }
}