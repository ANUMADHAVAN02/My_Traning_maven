package SampleSuperKeyword;

public class Superchild extends SuperParent
{
	public void display()
	{
		super.colour();
		System.out.println("colour=red");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Superchild obj=new Superchild();
		obj.display();

	}

}
