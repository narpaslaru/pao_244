package exceptions.custom;

public interface Stack {
    void push(Object item) throws StackException;

    Object pop() throws StackException;

    Object peek() throws StackException;

    boolean isEmpty();

    boolean isFull();

    void print() throws StackException;
}