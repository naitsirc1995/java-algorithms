package cristian.study.algorithms.Queues;

import cristian.study.algorithms.linkedLists.SinglyLinkedList;

public class QueueLinkedList {
    SinglyLinkedList list;

    public QueueLinkedList()
    {
        list = new SinglyLinkedList();
    }

    public boolean isEmpty()
    {
        return (list.head == null);
    }

    public void enQueue(int value)
    {
        list.insertInLinkedList(value,list.size);
    }

    public int deQueue()
    {
        int value = -1;
        if (isEmpty())
        {
            System.out.println("The queue is empty");
        } else
        {
            value = list.head.value;
            list.deletionOfNode(0);
        }

        return value;
    }

    public int peek()
    {
        int value = -1;
        if (isEmpty())
        {
            System.out.println("The queue is empty");
        } else
        {
            value = list.head.value;
        }

        return value;
    }

    public void deleteQueue()
    {
        list.head = null;
    }
}
