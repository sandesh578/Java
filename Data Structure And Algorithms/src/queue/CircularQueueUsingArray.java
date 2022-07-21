package queue;

import java.util.Scanner;

class CircularQ{
	int front=0,rear=0,MAX=6;
	int queue[];
	public CircularQ() {
		queue=new int[MAX];
	}
	
	public void enqueue(int data)
	{
	   if((rear+1)%MAX==front)
	   {
		 System.out.println("Queue is full");
	   }
	   else
	   {
		   rear=(rear+1)%MAX;
		   queue[rear]=data;
	   }
	}
	public int dequeue()
	{
		int item;
		if(front==rear)
		{
			System.out.println("No element available to dequeue");
			return 0;
		}else {
			item=queue[(front+1)%MAX];
			front=(front+1)%MAX;
		}
		return item;
	}
	public int peek()
	{
		if(front==rear)
		{
			System.out.println("Linked list is Empty");
			return 0;
		}
		return queue[(front+1)%MAX];
	}
	public boolean isEmpty()
	{
		if(front==rear)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if((rear+1)%MAX==front)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		if(front==rear) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("Elements in the queue are:");
			int i=front+1;
			do {
				System.out.println(i+" ");
				i=(i+1)%MAX;
			}while(i!=((rear+1)%MAX));
		}
	}
}

public class CircularQueueUsingArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CircularQ ob=new CircularQ();
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.isEmpty");
			System.out.println("5.Peek");
			System.out.println("6.Exit");
			System.out.println("Enter a option:");
			int op=scan.nextInt();
			switch(op)
			{
			 case 1:
				 System.out.println("Enter the number of items to enqueue:");
				 int n=scan.nextInt();
				 System.out.println("Enter "+n+" data to a queue:");
				 for(int i=0;i<n;i++)
				 {
					int data=scan.nextInt();
				    ob.enqueue(data);
				 }
				 break;
			 case 2:
				 int item=ob.dequeue();
				 System.out.println(item+" is dequed successfully");
				 break;
			 case 3:
				 System.out.println("Elements in the queues are:");
				 ob.display();
				 break;
			 case 4:
				 if(ob.isEmpty())
				 {
				   System.out.println("Queue is empty");
				 }
				 else
				 {
					 System.out.println("Queue is not empty");
				 }
				 break;
			 case 5:
				 System.out.println("First element of queue is:"+ob.peek());
				 break;
			 case 6:
				 System.exit(0);
			 default:
				 System.out.println("Invalid Input");
			}
		}
        //scan.close();
	}

}
