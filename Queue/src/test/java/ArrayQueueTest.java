import org.junit.Assert;
import org.junit.Test;

public class ArrayQueueTest {
    @Test
    public void testArrayQueue() {
        Queue que = new ArrayQueue(3);
        Assert.assertEquals(0, que.size());
        Assert.assertTrue(que.isEmpty());
        que.enqueue(1);
        Assert.assertFalse(que.isFull());
        Assert.assertEquals(1, que.size());
        Assert.assertFalse(que.isEmpty());
        Assert.assertFalse(que.isFull());
        que.enqueue(2);
        Assert.assertEquals(2, que.size());
        Assert.assertFalse(que.isEmpty());
        Assert.assertFalse(que.isFull());
        que.enqueue(3);
        Assert.assertEquals(3, que.size());
        Assert.assertFalse(que.isEmpty());
        Assert.assertTrue(que.isFull());
    }
}
