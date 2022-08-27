package cristian.study.algorithms.Stack;



public class Stack {

    int[] arr;
    int topOfStack;

    public Stack(int size)
    {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack has been created with the size of " + size);
    }

    public boolean isEmpty()
    {
        if (this.topOfStack == -1)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isFull()
    {
        if (this.topOfStack == arr.length -1)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public void push(int value)
    {
        if (isFull())
        {
            System.out.println("The Stack is full!");
        } else
        {
            arr[this.topOfStack +1] = value;
            this.topOfStack++;
        }
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("The stack is empty");
            return -1;
        } else
        {
            int topStack = this.arr[this.topOfStack];
            this.topOfStack--;
            return topStack;
        }
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("The stack is empty");
            return -1;
        } else
        {
            return this.arr[this.topOfStack];
        }
    }

    public void deleteStack()
    {
        arr = null;
        System.out.println("The stack is successfully deleted");
    }
}
