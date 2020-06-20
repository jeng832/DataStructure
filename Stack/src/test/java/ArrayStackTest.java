import org.junit.Assert;
import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void testArrayStack() {
        Stack stack = new ArrayStack(10);
        Assert.assertTrue(stack.isEmpty());
        stack.push(5);
        System.out.println(stack.printStack());
        stack.push(3);
        System.out.println(stack.printStack());
        Object elem = stack.pop();
        System.out.println(elem + " is poped!");
        System.out.println(stack.printStack());
        stack.push(7);
        System.out.println(stack.printStack());
    }

    @Test
    public void testEmptyStack() {
        Stack stack = new ArrayStack(10);
        Assert.assertTrue(stack.isEmpty());
        Object elem = stack.pop();
        Assert.assertNull(elem);
    }

    @Test
    public void testFullStack() {
        Stack stack = new ArrayStack(1);
        stack.push(1);
        Assert.assertTrue(stack.isFull());
        stack.push(2);
        Assert.assertTrue(stack.isFull());

    }

    @Test
    public void testStackSize() {
        Stack stack = new ArrayStack(2);
        Assert.assertEquals(0, stack.size());
        stack.push(2);
        Assert.assertEquals(1, stack.size());
        stack.push(1);
        Assert.assertEquals(2, stack.size());
        stack.push(100);
        Assert.assertEquals(2, stack.size());
    }

    @Test
    public void testTop() {
        Stack stack = new ArrayStack(2);

        stack.push(2);
        Assert.assertEquals(1, stack.size());
        stack.push(1);
        Assert.assertEquals(2, stack.size());
        stack.push(100);
        Assert.assertEquals(2, stack.size());
    }


}
