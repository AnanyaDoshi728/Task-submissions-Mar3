import java.util.Scanner;
class Matrix{
    int rows;
    int columns;
    
    Matrix(int rows,int columns)
    {
        this.rows = rows;
        this.columns = columns;
    }
    void matrixMultiply(Matrix object1)
    {
        if(this.columns != object1.rows)
        {
            System.out.println("Multiplication not possible as number of columns in matrix A is not equal to number of rows in matrix B");
        }
        else
        {   
            int i,j,k;
            int matrixA[][],matrixB[][],result[][];
            Scanner input = new Scanner(System.in);
            matrixA = new int[rows][columns];
            matrixB = new int[object1.rows][object1.columns];
            result = new int[rows][columns];
            
            System.out.println("Enter matrix A: ");
            for(i=0;i<rows;i++)
            {
                for(j=0;j<columns;j++)
                {
                    System.out.print("Enter element ["+i+"]"+"["+j+"]: ");
                    matrixA[i][j] = input.nextInt();
                    
                }
                 System.out.println();
            }
            System.out.println("Enter matrix B: ");
            for(i=0;i<object1.rows;i++)
            {
                for(j=0;j<object1.columns;j++)
                {
                    System.out.print("Enter element ["+i+"]"+"["+j+"]: ");
                    matrixB[i][j] = input.nextInt();
                    
                }
                 System.out.println();
            }
            for(i=0;i<rows;i++)
            {
                for(j=0;j<columns;j++)
                {
                    result[i][j] = 0;
                    
                    for(k=0;k<columns;k++)
                    {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
            
            System.out.println("Result: ");
            {
                for(i=0;i<rows;i++)
                {
                    for(j=0;j<columns;j++)
                    {
                        System.out.print(result[i][j]+"\t");
                        
                    }
                    System.out.println();
                }
            }
            
        }
    }
    
    void matrixAdd(Matrix object1)
    {   
        int i,j;
        if((this.rows != object1.rows)||(this.columns != object1.columns))
        {
           System.out.println("Addition not possible as number of rows and columns in matrix A are not equal to number of rows and columns in matrix B");
        }
        else
        {   
            Scanner input = new Scanner(System.in);
            
            int matrixA[][] = new int[rows][columns];
            int matrixB[][] = new int[rows][columns];
            int result[][] = new int[rows][columns];
            
            System.out.println("Enter matrix A: ");
            for(i=0;i<rows;i++)
            {
                for(j=0;j<columns;j++)
                {   
                    System.out.print("Enter element ["+i+"]"+"["+j+"]: ");
                    matrixA[i][j] = input.nextInt();
                }
            }
            
            System.out.println("Enter matrix B: ");
            for(i=0;i<rows;i++)
            {
                for(j=0;j<columns;j++)
                {   
                    System.out.print("Enter element ["+i+"]"+"["+j+"]: ");
                    matrixB[i][j] = input.nextInt();
                }
            }
            
            for(i=0;i<rows;i++)
            {
                for(j=0;j<columns;j++)
                {
                    result[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            
            System.out.println("Result: ");
            for(i=0;i<rows;i++)
            {
                for(j=0;j<columns;j++)
                {   
                    System.out.print(result[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
    
}
public class matrixOperations
{
	public static void main(String[] args) {
	    
		Matrix m1 = new Matrix(2,3);
		Matrix m2 = new Matrix(3,3);
		m1.matrixMultiply(m2);
		
		Matrix m3 = new Matrix(2,2);
		Matrix m4 = new Matrix(2,2);
        m3.matrixAdd(m4);
	}
}
