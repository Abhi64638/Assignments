import java.util.*;
class Student
{
	Scanner sc=new Scanner(System.in);
    String name;
    int Total;
    int marks[];
    Student()
    {
      System.out.print("Enter Student Name: ");
      name=sc.next();;
      getMarks();
    }
    public void getMarks()
    	{

    		marks=new int[4];
    		System.out.print("Enter marks of Subject1: ");
    		marks[0]=sc.nextInt();
    		System.out.print("Enter marks of Subject2: ");
    		marks[1]=sc.nextInt();
    		System.out.print("Enter marks of Subject3: ");
    		marks[2]=sc.nextInt();
    		System.out.print("Enter marks of Subject4: ");
    		marks[3]=sc.nextInt();
    		for(int i=0;i<4;i++)
    			{
    				Total+=marks[i];
    			}
    		System.out.println("Total Marks of "+name+": " +Total);
    	}
}

class Marks
{
	public static void main(String args[])
		{
			Scanner sc2 = new Scanner(System.in);
    		System.out.println("Enter the number of students you want to enter their marks");
    		int b = sc2.nextInt();
    		Student s[]=new Student[b];
			for(int i=0;i<4;i++)
			{
				s[i]=new Student();
			}
		}
}
       