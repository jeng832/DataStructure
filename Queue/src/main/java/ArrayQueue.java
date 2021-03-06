public class ArrayQueue implements Queue {
    private Object[] array;
    private int front;
    private int rear;

    public ArrayQueue(int size) {
        this.array = new Object[size + 1];
        this.front = 0;
        this.rear = 0;
    }

    @Override
    public int size() {
        return (array.length - front + rear) % array.length;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return size() == array.length - 1;
    }

    @Override
    public Object front() {
        if (isEmpty()) return null;
        return array[front];
    }

    @Override
    public void enqueue(Object elem) {
        if (!isFull()) {
            array[rear] = elem;
            rear = (rear + 1) % array.length;
        }
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
