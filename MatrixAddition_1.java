import java.util.Scanner;
public class MatrixAddition_1
{
public static void main(String[]args)
{
int N=Integer.parseInt(args[0]);
int[][]matrix1=new int[N][N];
int[][]matrix2=new int[N][N];
Scanner Scanner=new Scanner(System.in);
System.out.println("enter the element of the first matrix:");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
matrix1[i][j]=Scanner.nextInt();
}
}
System.out.println("enter the element of the second matrix:");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
matrix2[i][j]=Scanner.nextInt();
}
}
int[][]sumMatrix=new int[N][N];
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
System.out.println("the sum of the two matrix:");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
System.out.print(sumMatrix[i][j]+" ");
}
System.out.println();
}
}
}
 