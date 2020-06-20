import java.util.Arrays;

public class ArrayStack implements Stack {

    private Object[] array;
    private int top;

    public ArrayStack(int size) {
        array = new Object[size];
        top = -1;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public Object top() {
        return array[top];
    }

    @Override
    public void push(Object element) {
        array[++top] = element;
    }

    @Override
    public Object pop() {
        return array[top--];
    }

    @Override
    public String printStack() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayStack[");
        for (int i = 0; i <= top; i++) {
            sb.append(array[i]);
            if (i != top) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
