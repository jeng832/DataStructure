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
}
