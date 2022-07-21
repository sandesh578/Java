package collectionFramework;

import java.util.TreeSet;

class Point implements Comparable{
	int x;
	int y;
	public Point(int a,int b) {
		this.x=a;
		this.y=b;
	}
	
	@Override
	public int compareTo(Object o) {
		Point p=(Point)o;
		if(x>p.x) {
			return 1;
		}
		else if(x<p.x) {
			return -1;
		}else {
			if(this.y<p.y) {
				return -1;
			}else if(this.y>p.y) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	public String toString() {
		return "x = "+this.x+" y = "+this.y;
	}
}

public class Comparablesimplementation {

	public static void main(String[] args) {
		TreeSet<Point> ts=new TreeSet<>();
		ts.add(new Point(1,1));	
		ts.add(new Point(5,5));	
		ts.add(new Point(5,2));	
		
		System.out.println(ts);
		
		System.out.println();
		ts.forEach((obj)->{
			System.out.println("x = "+obj.x+" y = "+obj.y);
		});
		

	}

}
