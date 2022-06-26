import java.util.ArrayList;

public class Solution {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        int fact=1;//fact allways be initailized as factorial of n-1
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i=1;i<n;i++){
            
            fact=fact*i;
            num.add(i);
        }num.add(n);
        String answer="";
        k=k-1;
        while(true){
    answer=answer+num.get(k/fact);        //k tell which element and fact tells the section count;
            num.remove(k/fact);
            
            if(num.size()==0)
                break;
            
            k=k%fact;//16%6=4
            fact=fact/num.size();//fact=factorial of num-1
            
        }
        
        return answer;
    }
}