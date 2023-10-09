package inheritance;

public class Child extends Parent
{
	public void sub()
	{
		System.out.println(a-b);
	}
	

	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.add();
		obj.sub();

	}

}
