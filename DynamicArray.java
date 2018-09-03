import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DynamicArray 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
      
  
        //Sequence List
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();    
     
        int seq=0,N,Q;
        int Last_Answer=0;
        
        //Number of Sub Sequences
        N=input.nextInt();
        
        //initializing sub-sequences
        for(int i=0;i<N;i++)
        {
            matrix.add(new ArrayList<Integer>());
        }
        
        //Number of Queries
        Q=input.nextInt();
        
        int value=0;
        
        //Initializing Queries
        String[] query = new String[Q];
        
        //Entering Queries in the from 0xy
        for(int i=0;i<Q;i++)
        {
            query[i]=input.next();
        }
        
        for(int j=0;j<Q;j++)
        {
            if(query[j].charAt(0)=='1')
            {
               seq=((((int)query[j].charAt(1) ^ Last_Answer))%N);
               matrix.get(seq).add(Character.getNumericValue(query[j].charAt(2)));  
            }
            else
            {
                seq=((((int)query[j].charAt(1) ^ Last_Answer))%N);
                value=((int)query[j].charAt(2)%(matrix.get(seq).size()));
                Last_Answer=(matrix.get(seq).get(value));
                System.out.println(Last_Answer);            
            }
       }
    }   
}
