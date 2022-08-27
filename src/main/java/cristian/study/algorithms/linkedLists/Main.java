package cristian.study.algorithms.linkedLists;

public class Main {

    public static void main(String[] args)
    {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.createSinglyLinkedList(5);

        System.out.println(sll.head.value);
        System.out.println(sll.tail.value);
        System.out.println(sll.tail.next);

        System.out.println("");
        System.out.println("Now, let's talk about using the insertion method");
        sll.insertInLinkedList(5,1);
        sll.insertInLinkedList(2,2);

        System.out.println(sll.head.value);
        System.out.println(sll.head.next.value);
        System.out.println(sll.head.next.next.value);


        System.out.println("");
        System.out.println("Now, let's talk about traversal");
        sll.traverseSinglyLinkedList();
    }
}
