package LinkedList;

public class LinkedList {
    public Node head;

    public void addBegin(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // TC: O(n)
    public void deleteBegin() {
        if (head != null) {
            head = head.next;
        }
    }

    // TC: O(1)
    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    // TC: O(n) = 1*n^1 + (-1)*n^0 = 1*n^1 = n^1 = n
    public void findMid() {
        if (head == null) {
            System.out.println("List is Empty");
        }

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle Element is : " + slow.value);
    }
    // TC: O(n) = n/2 = (1/2)*n^1 = O(n)

    public void searchElement(int target) {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            if (curr.value == target) {
                System.out.println("Target element found at position :" + count);
                ;
            }
            curr = curr.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
    }

    public void addPosition(int pos, int value) {
        Node curr = head;
        Node toAdd = new Node(value);
        if (pos == 0) {
            toAdd.next = head;
            head = toAdd;
        }
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        toAdd.next = curr.next;
        curr.next = toAdd;
    }

    public void display() {
        System.out.print("Linked List: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value);
            curr = curr.next;
        }
        System.out.println();
    }

    // TC : O(2n+1) = 2*n^1+1*n^0 = 2*n^1 = n^1 = n O(n)

    public boolean isCyclic()
    {
        if (head == null)
        {
            return false;
        }

        Node fast = head.next;
        Node slow = head;

        while (fast != null && slow != null && fast.next != null)
        {
            if (fast == slow)
            {
                return true;
            }
                fast = fast.next.next;
                slow = slow.next;
        }
        return false;
    }
}