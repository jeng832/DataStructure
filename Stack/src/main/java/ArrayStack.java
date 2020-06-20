public class ArrayStack implements Stack {

    private Object[] array;
    private int top;

    public ArrayStack(int size) {
        array = new Object[size];
        top = -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public Object top() {
        if (isEmpty()) return null;
        return array[top];
    }

    @Override
    public void push(Object element) {
        if (top < array.length - 1) {
            array[++top] = element;
        }
    }

    @Override
    public Object pop() {
        if (isEmpty()) return null;
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

    @Override
    public boolean isFull() {
        return array.length == size();
    }
}
