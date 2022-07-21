package queues;

class Node {

    public String data;
    private Node next;
    private Node previous;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public void setPreviousNode(Node node) {
        this.previous = node;
    }

    public Node getNextNode() {
        return this.next;
    }

    public Node getPreviousNode() {
        return this.previous;
    }

}
class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String toString() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        return output;
    }

}
class Queue {
    
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    
    public Queue() {
      this(DEFAULT_MAX_SIZE);
    }
    
    public Queue(int maxSize) {
      this.queue = new LinkedList();
      this.maxSize = maxSize;
    }
    
    public void enqueue(String data) {
      this.queue.addToTail(data);
      this.size++;
      System.out.println("Added " + data + "! Queue size is now " + this.size);
    }


    public String dequeue() {
      String data = this.queue.removeHead();
      this.size--;
      System.out.println("Removed " + data + "! Queue size is now " + this.size);
      return data;
    }
/*
        // Define hasSpace() below
    public boolean hasSpace()
    {
      if(size<maxSize)
      {
        return true;
      }
      else
      {
        return false;
      }
    }

    // Define isEmpty() below
    public boolean isEmpty()
    {
      if(size==0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
 */
  
    public String peek() {
      return this.queue.head.data;
    }
}
public class QueueImplementation{
    public static void main(String[] args) {
      Queue smoothieOrders = new Queue();
      smoothieOrders.enqueue("strawberry banana");
      smoothieOrders.enqueue("chocolate peanut butter");
      System.out.println("Blending the smoothies...");
      smoothieOrders.dequeue();
      smoothieOrders.dequeue();
      System.out.println("All orders are complete!");
    }
}
