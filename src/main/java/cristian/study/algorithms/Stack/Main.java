package cristian.study.algorithms.Stack;


public class Main {

    public static void main(String[] args)
    {
        Stack myStack = new Stack(4);
        myStack.push(2);
        System.out.println(myStack.topOfStack);
        System.out.println(myStack.arr[myStack.topOfStack]);

        LinkedListStack myLinkedListStack = new LinkedListStack();
        myLinkedListStack.push(2);
        myLinkedListStack.push(3);
        myLinkedListStack.push(1);

        System.out.println(myLinkedListStack.peek());
        System.out.println(myLinkedListStack.pop());
        myLinkedListStack.deleteStack();
        System.out.println(myLinkedListStack.isEmpty());

    }
}
