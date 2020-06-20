public interface Stack {
    public int size();

    public boolean isEmpty();

    public Object top();

    public void push(Object element);

    public Object pop();

    public String printStack();

    public boolean isFull();
}
