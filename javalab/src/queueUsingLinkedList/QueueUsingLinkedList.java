package queueUsingLinkedList;
class Node{
	int data;
	private Node next;
	private Node previous;
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
	public void setNextNode(Node node)
	{
		this.next=node;
	}
	public void setPreviousNode(Node node)
	{
		this.previous=node;
	}
	public Node getNextNode()
	{
		return this.next;
	}
	public Node getPreviousNode()
	{
		return this.previous;
	}
}
class LinkedList{
	public Node head;
	public Node tail;
	public LinkedList()
	{
		this.head=null;
	}
	public void addToHead(int data)
	{
		Node newHead=new Node(data);
		Node currentHead=this.head;
		this.head=newHead;
		while(currentHead!=null)
		{
			this.head.setNextNode(currentHead);
		}
	}
	public void addToTail(int data)
	{
		this.tail=null;
		if(tail==null)
		{
			this.head=new Node(data);
		}
		else
		{
			while(tail.getNextNode()!=null)
			{
				tail=tail.getNextNode();
			}
			tail.setNextNode(new Node(data));
		}
	}
	public int RemoveHead()
	{
		Node removedHead=this.head;
		if(removedHead==null)
		{
			return 0;
		}
		this.head=removedHead.getNextNode();
		return this.removedHead.data;
	}	
		
	}
}
class Queue{
	public LinkedList queue;
	int size;
	public static final int DEFAULT_MAX_SIZE=Integer.MAX_VALUE;
	int maxSize;
	public Queue()
	{
		this(DEFAULT_MAX_SIZE);
	}
	public Queue(int maxSize)
	{
		queue=new LinkedList();
		this.maxSize=maxSize;
	}
	public void enqueue(int data)
	{
	  queue.addToTail(data);
	  this.size++;
	}
	public int dequeue()
	{
		
	}
}
public class QueueUsingLinkedList {

	public static void main(String[] args) {
		

	}

}
