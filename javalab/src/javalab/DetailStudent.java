package javalab;

import java.util.Scanner;
class Students{
    String name;
    int roll;
    double CGPA;
    public Students(String name,int roll,double CGPA)
    {
        this.name = name;
        this.roll = roll;
        this.CGPA =CGPA;
    }
    public void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Roll = "+ roll );
        System.out.println("CGPA = "+CGPA);
    }
    
}
class DetailsStudent {
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the number of students.");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        Students arr[]= new Students[n];
        String name;
        double cgpa;
        int roll;
      
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of the student"+i);
            name = sc.next();
            roll = sc.nextInt();
            cgpa = sc.nextDouble();
            arr[i] = new Students(name,roll,cgpa);
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Details of the student "+i);
            arr[i].display();

        }
        double lcgpa =10.0;
        for(int i=0;i<n;i++)
        {
            if(arr[i].CGPA<lcgpa)
            lcgpa = arr[i].CGPA;
        }

        for(int i=0;i<n;i++)
        {
            if(lcgpa == arr[i].CGPA)
            {
                System.out.println("\nDetails of the student with minimum CGPA is:");
                System.out.println("Name is :"+ arr[i].name);
                System.out.println("Roll = "+arr[i].roll);
                System.out.println("CGPA = "+arr[i].CGPA);
            }
        }

      sc.close();

    }
    
}
