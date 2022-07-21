package treeSet;

import java.util.TreeSet;
//tree set is a sorted set
@SuppressWarnings("rawtypes")
class Point implements Comparable{
	int x,y;
    public Point(int x,int y)
    {
    	this.x=x;
    	this.y=y;
    }
    public String toString()
    {
    	return "x="+x+",y="+y+"\n";
    }
	@Override
	public int compareTo(Object o) {
		Point p=(Point)o;
		if(this.x<p.x)
		{
			return -1;
		}
		else if(this.x>p.x)
		{
			return 1;
		}
		else
		{
			if(this.y<p.y)
			{
				return -1;
			}
			else if(this.y>p.y)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
}
public class PointTreeSetDemo {

	public static void main(String[] args) {
		//can use reference of SortedSet,Collection
		TreeSet<Point> hs=new TreeSet<>();
        hs.add(new Point(1,1));
        hs.add(new Point(2,3));
        hs.add(new Point(5,2));
        hs.forEach((n)->System.out.print(n+" "));
	}

}
