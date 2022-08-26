package LinkedList;

public class Node
{
    public int value;
    public Node prev;
    public Node next;

    public Node(int value)
    {
        this.value = value;
    }
}
// TC: O(1) (1+1+1) = 3 = 3*n^0 = n^0 = 1 = O(1)