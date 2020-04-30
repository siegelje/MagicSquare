import java.util.ArrayList;
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    private int dimension;
    private int[][] datarray;
    public Square(int order)
    {
        
        
    }
    public Square(String bits)
    {
        bits = bits.substring(2,bits.length());
        int counter = 0; 
        //should I be trying to count the dimension???
        int[] holder = new int[9];
        //maybe make this an arrayList so I can make it whatever length
        for (int i = 0; i<bits.length()-2; i++)
        {
            if (bits.substring(i,i+1).equals(","))
            {
                bits = bits.substring(i+1,bits.length());
            }
            else if (bits.substring(i,i+1).equals("{"))
            {
                bits = bits.substring(i,bits.length());
            }
            else if (bits.substring(i,i+1).equals("}"))
            {
                bits = bits.substring(i,bits.length());
            }
            else
            {
                int val = Integer.parseInt(bits.substring(i,i+1));
                holder[counter] = val;
                counter++;
            }
        }
        int count = 0;
        for (int r = 0; r<dimension; r++)
        {
            for (int c = 0; c<dimension; c++)
            {
                datarray[r][c] = holder[count];
                count++;
            }
        }
    }
    public String toString()
    {
        for (int r = 0; r<dimension; r++)
        {
            for (int c = 0; c<dimension; c++)
            {
                System.out.print(datarray[r][c]+"   ");
            }
            System.out.println();
        }
        return "x";
        //how to return with multiple lines? I know I can print, but 
        //I can't override toString with void instead of string
    }
}
