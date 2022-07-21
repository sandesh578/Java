package javaDSA;

class Nodes {

	  public String data;
	  private Nodes next;	

	  public Nodes(String data) {
	    this.data = data;
	    this.next = null;
	  }

	  public void setNextNode(Nodes node) {
	    this.next = node;
	  }

	  public Nodes getNextNode() {
	    return this.next;
	  }
}
public class LinkedList{
	  public static void main(String[] args) {
	    Nodes strawberry=new Nodes("Berry Tasty");
	    Nodes banana=new Nodes("Banana-rama");
	    Nodes coconut=new Nodes("Nuts for Coconut");
	    strawberry.setNextNode(banana);
	    banana.setNextNode(coconut);
	   
	  }

}
