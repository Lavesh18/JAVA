package linkedList;

public class intro {
    Node head;
    private int size;

    intro()
    {
        this.size = 0;
    }
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    //add - first,last

    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data)
    {
        //we will use head and move forward if we get null that is last node we will add there 
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next !=null)
        {
            currNode = currNode.next;  // moving forward 
        }

        currNode.next = newNode;

    }

    //print list

    public void printList()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode !=null)
        {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;  // moving forward 
        }

        System.out.println("Null");
    }
    //delete first

    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("Lits is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("Lits is empty");
            return;
        }

        size--;

        //now suppose lastNode is null then
        if(head.next == null)
        {
            head=null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize()
    {
        return size;
    }

    //reverse LL
    public void reverseLL()
    {
        if(head == null || head.next == null)
        {
            return ;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode !=null)
        {
            Node nextNode = currNode.next;

            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //using recursion 
    public Node recursiveReverse(Node head)
    {
        if(head == null||head.next == null)
        {
            return head;
        }
        Node newNode = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

public static void main(String[] args) {
    intro list = new intro();
    list.addFirst("a");
    list.addFirst("hi");
    list.addLast("List");

    list.printList();
    list.deleteLast();
    list.printList();

    list.printList();
    list.addFirst("hi");
    list.printList();
    System.out.println(list.getSize()); 
    list.reverseLL();
    list.printList();
    list.head = list.recursiveReverse(list.head);
    list.printList();
    
}
}
