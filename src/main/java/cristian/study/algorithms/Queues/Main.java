package cristian.study.algorithms.Queues;

public class Main {
    public static void main(String[] args)
    {
        Queue myQueue = new Queue(3);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.isEmpty());
        myQueue.enQueue(2);
        myQueue.deleteQueue();
        try {
            System.out.println(myQueue.isEmpty());
        } catch (NullPointerException n)
        {
            System.out.println("The null pointer exception " + n + " was cached ");
        }

        CircularQueue cq = new CircularQueue(5);

        cq.enQueue(0);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);

        System.out.println("We are going to get started with the queues");
        System.out.println(cq.deQueue());
        System.out.println(cq.deQueue());
        System.out.println("Up until now I would expect tq=4="+cq.topOfQueue+" bq=2="+cq.beginningOfQueue);
        cq.enQueue(2);
        System.out.println("Up until now I would expect tq=0="+cq.topOfQueue +" bq=2="+cq.beginningOfQueue);
        cq.deQueue();
        cq.deQueue();
        System.out.println("Up until now I would expect tq=0="+cq.topOfQueue+ " bq=4="+cq.beginningOfQueue);
        cq.deQueue();
        System.out.println("Up until now I would expect tq=0="+cq.topOfQueue+"=cq=0="+cq.beginningOfQueue);
    }
}
