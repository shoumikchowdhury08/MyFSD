package LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();

        ll.addEnd(0);
        ll.display();

        ll.addBegin(1);
        ll.display();

        ll.addBegin(2);
        ll.display();

        ll.addBegin(3);
        ll.display();

        ll.addEnd(4);
        ll.display();

        ll.addEnd(5);
        ll.display();

        ll.deleteBegin();
        ll.display();

        ll.deleteEnd();
        ll.display();

        ll.findMid();

        ll.searchElement(0);

        ll.reverse();
        ll.display();

        ll.addPosition(3,6);
        ll.display();

        ll.isCyclic();
    }
}
