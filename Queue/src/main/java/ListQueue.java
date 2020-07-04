import java.util.LinkedList;
import java.util.List;

public class ListQueue implements Queue {

    private int front;
    private int rear;
    private List<Object> list;

    public ListQueue() {
        list = new LinkedList<>();
        front = 0;
        rear = 0;
    }


    @Override
    public int size() {
        return rear - front;
    }

    @Override
    public boolean isEmpty() {
        return rear == front;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object front() {
        return list.get(front);
    }

    @Override
    public void enqueue(Object elem) {
        list.add(rear++, elem);
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) return null;
        return list.get(front++);
    }

    @Override
    public String printQueue() {
        return null;
    }
}
