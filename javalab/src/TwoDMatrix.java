import java.util.Scanner;
public class TwoDMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int mat[][]=new int[n][n];
        /*int start=0;
        boolean firstZero = false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            	if(j==0)
        		{
        			mat[i][j]=start;
        			start++;
        		}
            	else if (j >= 1 && i >= 1)
                {
                    //If previous element isn't 0 and firstZero boolean is false, decrease current element by 1.
                    if (mat[i][j - 1] != 0 && !firstZero)
                    {
                        mat[i][j] = mat[i][j - 1] - 1;
                    }
                    //If previous element is zero, increase current element by one and set firstZero boolean to true.
                    if (mat[i][j - 1] == 0)
                    {
                        mat[i][j] = mat[i][j - 1] + 1;
                        firstZero = true;
                    }
                    //If an element in the row was zero, increase the remaining elements by one.
                    else if (firstZero)
                    {
                        mat[i][j] = mat[i][j - 1] + 1;
                    }
                    //Set the firstZero boolean to false once the row is complete.
                    if (j == mat.length - 1)
                    {
                        firstZero = false;
                    }

                }
                //Assigns ascending values of j to first row.
                else
                {
                    mat[i][j] = j;
                }
            }
        }*/
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int diff = Math.abs(i - j);
                mat[i][j] = diff;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}