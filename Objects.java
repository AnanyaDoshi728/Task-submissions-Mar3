class Employee
{
    String name,joiningYear,address;
    import java.util.Scanner;
    Employee(String name,String joiningYear,String address)
    {
        this.name = name;
        this.joiningYear = joiningYear;
        this.address = address;
    }
    void displayEmployeeData()
    {
        System.out.println("Name: "+name+"\nYear of joining: "+joiningYear+"\nAddress: "+address);
    }
}

public class Objects
{
    public static void main(String[] args)
    {  
      Employee objectArray[] = new Employee[3];
      objectArray[0] = new Employee("Robert","1994","64C Wall Street");
      objectArray[1] = new Employee("Sam","2000","68D Wall Street");
      objectArray[2] = new Employee("John","1999","26B Wall Street");
      
      for(int i=0;i<objectArray.length;i++)
      {   
          System.out.print("Employee"+(i+1)+" :");
          objectArray[i].displayEmployeeData();
      }
    }
  // with user input
  
  /*import java.util.Scanner;
class Employee{
    
    String name;
    String joiningYear;
    String address;
    
    void inputEmployeeData()
    {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = input.nextLine();
        System.out.print("Enter the year of joining: ");
        joiningYear = input.nextLine();
        System.out.print("Enter the address: ");
        address = input.nextLine();
    }
    void displayEmployeeData()
    {
        System.out.println("Name: "+name+"\nYear of joining: "+joiningYear+"\nAddress: "+address);
    }
}



public class Objects
{
	public static void main(String[] args) {
	    
	    Employee objectArray[] = new Employee[3];
	    
	    for(int i=0;i<objectArray.length;i++)
	    {   
	        objectArray[i] = new Employee();
	        System.out.println("Enter data for employee: "+(i+1));
	        objectArray[i].inputEmployeeData();
	    }
	    System.out.println();
	    for(int i=0;i<objectArray.length;i++)
	    {   
	        System.out.println("Employee "+(i+1));
	        objectArray[i].displayEmployeeData();
	    }
	}
}*/

  
