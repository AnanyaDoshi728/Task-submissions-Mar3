import java.util.Scanner;
public class switchCase
{
	public static void main(String[] args) {
	    int choice;
		do{
	     Scanner input = new Scanner(System.in);
	    System.out.println("\nPick one\n1.Hi\n2.Hey\n3.Hello\n4.Exit");
	    System.out.print("Enter the choice: ");
	    choice = input.nextInt();
	    switch(choice)
	    {
	        case 1:
	            System.out.println("\nYou said Hi");
	            break;
	       case 2:
	           System.out.println("\nYou said Hey");
	           break;
	       case 3:
	           System.out.println("\nYou said Hello");
	           break;
	       case 4:
	           System.exit(0);
	           break;
	       default:
	           System.out.println("\nInvalid input");
	           break;
	            
	    }
	    }while(choice != 4);
	}
}
