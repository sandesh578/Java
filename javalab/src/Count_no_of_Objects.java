class Count_no_of_Objects {

	static int count=0;
	Count_no_of_Objects()
	{
		count++;
	}
	public static void main(String[] args) {
		
		Count_no_of_Objects ob1=new Count_no_of_Objects();
		Count_no_of_Objects ob2=new Count_no_of_Objects();
		Count_no_of_Objects ob3=new Count_no_of_Objects();
		Count_no_of_Objects ob4=new Count_no_of_Objects();
		Count_no_of_Objects ob5=new Count_no_of_Objects();
		System.out.println("No of objects created is:"+count);
	}

}
