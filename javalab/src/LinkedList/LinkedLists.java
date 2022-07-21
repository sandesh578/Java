package LinkedList;
class Node {

	  public String data;
	  private Node next;

	  public Node(String data) {
	    this.data = data;
	    this.next = null;
	  }

	  public void setNextNode(Node node) {
	    this.next = node;
	  }

	  public Node getNextNode() {
	    return this.next;
	  }

}
public class LinkedLists {

		  public static void main(String []args) {   
		  LinkedLists seasons=new LinkedLists();
		  seasons.printList();
		  seasons.addToHead("summer");
		  seasons.addToHead("spring");
		  seasons.printList();
		  seasons.addToTail("fall");
		  seasons.addToTail("winter");
		  seasons.printList();
		  seasons.removeHead();
		  seasons.printList();
		  }

			public Node head;

			public LinkedLists() {
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

		  public String printList() {
		    String output = "<head> ";
		    Node currentNode = this.head;
		    while (currentNode != null) {
		      output += currentNode.data + " ";
		      currentNode = currentNode.getNextNode();
		    }
		    output += "<tail>";
		    System.out.println(output);
		    return output;
		  }  

		}
/*
 //find maximum value of linked list
public int findMax(LinkedList list) {
Node current = list.head;
int max = current.data;
while (current.getNextNode() != null) {
  current = current.getNextNode();
  int val = current.data;
  if (val > max) {
    max = val;
  }
}
return max;
}
//sort the linked list
  function sortLinkedList(list) {
  let newList = new LinkedList();
  while (list.head !== null) {
    let currentMax = findMax(list);
    list.remove(currentMax);
    newList.addToHead(currentMax);
  }
  return newList;
}

*/