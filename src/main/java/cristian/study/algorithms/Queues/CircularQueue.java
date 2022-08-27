package cristian.study.algorithms.Queues;

public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size)
    {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
        System.out.println("The circular queue has been created");
    }

    public boolean isFull()
    {
        if (topOfQueue+1 == beginningOfQueue)
        {
            return true;
        } else if (beginningOfQueue == 0 && topOfQueue+1 == size)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        return (topOfQueue==-1);
    }

    public void enQueue(int value)
    {
        if(isFull())
        {
            System.out.println("The circular queue is full");
        } else
        {
            if (topOfQueue+1 == size)
            {
                topOfQueue = 0;
            } else if (isEmpty())
            {
                beginningOfQueue = 0;
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("Successfully inserted the value "+ value);
            } else
            {
                topOfQueue++;
            }

            arr[topOfQueue] = value;
            System.out.println("The value "+ value + " has been inserted into the queue");
        }
    }

    public int deQueue()
    {
        if (isEmpty())
        {
            System.out.println("The queue is empty");
            return -1;
        } else
        {
            int result = arr[beginningOfQueue];
            if (beginningOfQueue == topOfQueue)
            {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size)
            {
                beginningOfQueue = 0;
            } else
            {
                beginningOfQueue++;
            }
            System.out.println("The value " + result + " has been dequeued");
            return result;
        }
    }

}
