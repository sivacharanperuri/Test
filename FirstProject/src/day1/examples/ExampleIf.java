package day1.examples;

public class ExampleIf {

	public static void main(String[] args) {
		/*
		 * my second program
		 */
		int x=20;
		int y=20;
	/*	if(x<y)
		{
			System.out.println("X is less than y");
		}
		if(x==y)
		{
			System.out.println("x is equal to y");
		}
		if(x>y)
		{
			System.out.println("x is greater than y");
		}*/
		
		//minimizing the number of conditions and also saving execution time 
		if(x<y)
		{
			System.out.println("X is less than y");
		}
		else if(x==y)
		{
			System.out.println("X is equal to y");
		}
		else
		{
			System.out.println("X is greater than y");
		}
		
	}

}
