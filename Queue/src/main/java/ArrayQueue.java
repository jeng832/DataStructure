public class ArrayQueue implements Queue {
    private Object[] array;
    private int front;
    private int rear;

    public ArrayQueue(int size) {
        this.array = new Object[size];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public int size() {
        if (front == -1) return 0;
        int len = array.length - front + rear + 1;
        if (len % array.length == 0) return array.length;
        return len % array.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean isFull() {
        return size() == array.length;
    }

    @Override
    public Object front() {
        return array[front];
    }

    @Override
    public void enqueue(Object elem) {
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (!isFull()) {
            rear = (rear + 1) % array.length;
        }
        array[rear] = elem;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) return null;
        Object value = array[front];
        front = (front + 1) % array.length;
        return value;
    }

    @Override
    public String printQueue() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayQueue[");
        for (int i = 0; i < size(); i++) {
            sb.append(array[i]);
            if (i < size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
