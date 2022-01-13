
public class Stack<E> {
    E stck[];
    int top;
    final int size = 10;

    @SuppressWarnings("unchecked")
    Stack() {
        stck = (E[]) new Object[size];
        top = -1;
    }

    void push(E item) {
        if (top == size - 1)
            System.out.println("Stack is Full");
        else
            stck[++top] = item;

    }

    E pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return stck[top--];

    }
}