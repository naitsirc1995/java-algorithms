package cristian.study.algorithms.Stack;
import cristian.study.algorithms.linkedLists.SinglyLinkedList;

public class LinkedListStack {
    SinglyLinkedList linkedList;

    public LinkedListStack()
    {
        linkedList = new SinglyLinkedList();
        System.out.println("New LinkedList Stack Created");
    }

    public void push(int value)
    {
        linkedList.insertInLinkedList(value,0);
        System.out.println("Inserted " + value + " in the stack");
    }

    public boolean isEmpty()
    {
        if (linkedList.head == null)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public int pop()
    {
        int result = -1;
        if (isEmpty())
        {
            System.out.println("Stack is empty");
        } else
        {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }

        return result;
    }

    public int peek()
    {
        if (isEmpty())
        {
            return -1;
        } else
        {
            return linkedList.head.value;
        }
    }

    public void deleteStack()
    {
        linkedList.head = null;
        System.out.println("The stack is deleted");
    }

}
