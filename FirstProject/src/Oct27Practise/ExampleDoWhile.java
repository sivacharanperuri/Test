package Oct27Practise;

import java.io.IOException;

public class ExampleDoWhile {

	public static void main(String[] args) throws IOException 
	{
		//Practising do while to process a menu section
		char choice;
		do 
		{	//System.out.flush();
			System.out.println("help on:");
			System.out.println("1.if");
			System.out.println("2.swith\n3.while\n4.do-while\n5.for\n");
			choice=(char) System.in.read();
			
		 switch(choice)
		 {
		  case '1':
			System.out.println("if(condition)\nstatement;\nelse statement");
			break;
		  case '2':
			System.out.println("switch(expression)\n case: (constant)\nstatement sequence\nbreak");
			break;
		  case '3':
			System.out.println("while(conditon)\n statements");
			break;
		  case '4':
			System.out.println("do\nstatements\nwhile(condition)");
			break;
		  case '5':
			System.out.println("for(initialization;condition;increment/decrement;)\nstatements");
			break;
		 }
	}while(choice>='1'&&choice<='5');
	
 }

}
