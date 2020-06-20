# Stack
- LIFO (Last In First Out) 구조를 가지는 자료 구조
## Interface
```java
public interface Stack {
    public int size();

    public boolean isEmpty();

    public Object top();

    public void push(Object element);

    public Object pop();

    public String printStack();

    public boolean isFull();
}
```
Link: [interface]

[interface]: https://github.com/jeng832/DataStructure/blob/master/Stack/src/main/java/Stack.java
## Implement
- 배열을 이용하여 구현
```java
    private Object[] array;
```
- Constructor를 이용하여 size를 지정
- push(), pop() 등 array size와 index 규칙이 위배될 경우 null 을 return 하도록 구현

Link: [ArrayStack]

[ArrayStack]: https://github.com/jeng832/DataStructure/blob/master/Stack/src/main/java/ArrayStack.java