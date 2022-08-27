package cristian.study.algorithms.Queues;

public class Queue
{
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public Queue(int size)
    {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
    }

    public boolean isFull()
    {
        return (this.topOfQueue == arr.length -1);
    }

    public boolean isEmpty()
    {
        return (this.beginningOfQueue == -1 || this.beginningOfQueue == arr.length);
    }

    public void enQueue(int value) {
        if (this.isFull()) {
            System.out.println("The Queue is Full");
        } else if (this.isEmpty()) {
            this.beginningOfQueue = 0;
            this.topOfQueue = 0;
            this.arr[topOfQueue] = value;
            System.out.println("The value " + value + " has been inserted into the queue");
        } else {
            this.topOfQueue++;
            this.arr[this.topOfQueue] = value;
            System.out.println("The value " + value + " has been inserted into the queue");
        }
    }


    public int deQueue()
    {
        if (this.isEmpty())
        {
            System.out.println("The queue is empty");
            return -1;
        } else
        {
            int result = this.arr[this.beginningOfQueue];
            this.beginningOfQueue++;
            if (this.beginningOfQueue > this.topOfQueue)
            {
                this.beginningOfQueue = -1;
                this.topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek()
    {
        if (this.isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        } else
        {
            return this.arr[this.beginningOfQueue];
        }
    }

    public void deleteQueue()
    {
        this.arr = null;
        System.out.println("Queue has been deleted");
    }
}
