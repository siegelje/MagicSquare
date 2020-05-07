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
        int[] holder = new int[order*order];
        dimension = order;
        for(int i = 0; i<order*order; i++)
        {
            holder[i]=i+1;
        }
        //shuffle here - can I reuse old shuffle method??
        int[][] datarray = new int[order][order]; //works for any size!
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
    public Square(String bits)
    {
        int[][] datarray = new int[3][3];
        //I know I'll have to move this down
        bits = bits.substring(2,bits.length());
        int counter = 0; 
        //should I be trying to count the dimension???
        int[] holder = new int[9];
        //maybe make this an arrayList so I can make it whatever length
        for (int i = 0; i<bits.length()-3; i++)
        {
            if (bits.substring(i,i+1).equals(","))
            {
                bits = bits.substring(i+1,bits.length());
            }
            else if (bits.substring(i,i+1).equals("{"))
            {
                bits = bits.substring(i+1,bits.length());
            }
            else if (bits.substring(i,i+1).equals(" "))
            {
                bits = bits.substring(i+1,bits.length());
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
        dimension = 3;
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
        String all = " ";
        for (int r = 0; r<dimension; r++)
        {
            for (int c = 0; c<dimension; c++)
            {
                all += datarray[r][c] + " ";
            }
            all += " /n";
        }
        return all;
        //still buggy for some reason. Don't know why
    }
    
    public boolean isMagic()
    {
        //similar to tictactoe check for win... 
        //just a couple different circumstances
        return false;
    }
}
