package queueUsingArray;

import java.util.Scanner;

public class QueueUsingArray {
	public int MAX;
	public int queue[];
	public int front,rear;
	public QueueUsingArray(int n)
	{
		front=rear=0;
		MAX=n;
		queue=new int[MAX];
	}
    public void enqueue(int data) throws Exception
    {
    	if(rear==MAX)
    	{
    		throw new Exception("Stack OverFlow");
    	}
    	else
    	{
    		queue[rear]=data;
    		rear=rear+1;
    	}
    }
    public int dequeue() throws Exception
    {
    	int item;
    	if(front==rear)
    	{
    		throw new Exception("Stack UnderFlow");
    	}
    	else
    	{
    		item=queue[rear];
    		rear=rear-1;
    	}
    	return item;
    }
    public void display()
    {
    	for(int i=front;i<rear;i++)
    	{
    		System.out.println(queue[i]);
    	}
    }
    public boolean isEmpty()
    {
    	if(front==0)
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
    	if(rear==MAX)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    public int peek()
    {
    	return queue[front];
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the number of data you want to insert:");
			int n=scan.nextInt();
			QueueUsingArray obj=new QueueUsingArray(n);
			System.out.println("Enter a option:");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Peek");
			System.out.println("5.isEmpty");
			System.out.println("6.isFull");
			System.out.println("7.Exit");
			int op=scan.nextInt();
			while(op!=6)
			{
			switch(op)
			{
			 case 1:
				System.out.println("Enter "+n+" data to an queue:");
				for(int i=0;i<n;i++)
				{
					int data=scan.nextInt();
					obj.enqueue(data);
				}
				break;
			 case 2:
				 int item=obj.dequeue();
				 System.out.println(item+" is dequed");
				 break;
			 case 3:
				 System.out.println("Elements in queue are:");
				 obj.display();
				 break;
			 case 4:
				 System.out.println("Front element of Queue is:"+obj.peek());
				 break;
			 case 5:
				 boolean res=obj.isEmpty();
				 if(res)
				 {
				   System.out.println("Queue is Empty");
				 }
				 else
				 {
					 System.out.println("Queue is not Empty");
				 }
				 break;
			 case 6:
				 boolean full=obj.isEmpty();
				 if(full)
				 {
				   System.out.println("Queue is Full");
				 }
				 else
				 {
					 System.out.println("Queue is not Full");
				 }
				 break;
			 case 7:
				 System.exit(0);
				 break;
			 default:
				 System.out.println("Invalid Input");
			}
			
		}
			System.out.println("Enter the option:");
			op=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
       scan.close();
	}

}
