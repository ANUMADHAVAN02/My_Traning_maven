package ExerciseAbstraction;

public class Engine extends Car { 
	
public void start()//by defining abstract class, abstract class mthd name should be same as normal class mthd name)
{
	System.out.println("The car is start only if the engine is working properly");
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Engine e=new Engine();
       e.start();
       e.display();
	}

}
