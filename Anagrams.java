package hackerrank;

import java.util.*;
public class Anagrams {
    public static int numberNeeded(String first, String second) {
      
        char[] c1=first.toCharArray();
        char[] c2=second.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        int p1=0,p2=0;
        int count=0;
        boolean end=false;
        while(!end)
            {
                
            if(c1[p1]<c2[p2])
                {
                p1++;
              
                }
            else
                {
                p2++;
                
              }
          
            if(p1==c1.length||p2==c2.length)
                {
                count=count+Math.abs((c1.length-p1+c2.length-p2));
               end=true;
            }
            else
            {
              
                  if(c1[p1]!=c2[p2])
                  {
                       count++;
                        System.out.println(count+","+c1[p1]+","+c2[p2]);
                  }
             
            }
               
            }
        
        return count;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
