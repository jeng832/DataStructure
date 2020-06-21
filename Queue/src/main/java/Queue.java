public interface Queue {
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public Object front();
    public void enqueue(Object elem);
    public Object dequeue();
    public String printQueue();
}
