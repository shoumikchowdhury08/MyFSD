package DoublyLinkedList;

import LinkedList.Node;

public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public DoublyLinkedList()
    {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    public void addBeginDLL(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }

    public void display()
    {
        Node curr = head.next;
        while(curr != tail)
        {
            System.out.print(curr.value);
            curr = curr.next;
        }
        System.out.println();
    }
}
