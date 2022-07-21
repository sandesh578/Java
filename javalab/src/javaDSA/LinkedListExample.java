package javaDSA;

class Nod {

	  public String data;
	  private Nod next;	
	  public Nod(String data) {
	    this.data = data;
	    this.next = null;
	  }

	  public void setNextNode(Nod node) {
	    this.next = node;
	  }

	  public Nod getNextNode() {
	    return this.next;
	  }
}
public class LinkedListExample{
	  public static void main(String[] args) {
	    Nod strawberry = new Nod("Berry Tasty");
	    Nod banana = new Nod("Banana-rama");
	    Nod coconut = new Nod("Nuts for Coconut");

	    strawberry.setNextNode(banana);
	    banana.setNextNode(coconut);

	    Nod currentNode = strawberry;
	    while (currentNode != null) {
	      System.out.println(currentNode.data);
	      currentNode = currentNode.getNextNode();
	    }
	  }

	}
