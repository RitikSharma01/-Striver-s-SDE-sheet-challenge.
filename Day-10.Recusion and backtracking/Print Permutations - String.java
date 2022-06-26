import java.util.*;
public class Solution {
    
    public static List<String> findPermutations(String s) {
        // Write your code here.
        List<String> ans=new ArrayList<String>();
        
        permute(s,0,ans);
        return ans;
    }
    
    public static void permute(String str,int ind,List<String> ans)
    {
        if(ind==str.length())
        {
            ans.add(str);
            return;
        }//base case 
        
        for(int i=ind;i<str.length();i++)
        {
            str=swap(str,ind,i);
            permute(str,ind+1,ans);
            str=swap(str,ind,i);
        }
        
        
    }
    
    public static String swap(String str,int i,int j)
    {
        char x=str.charAt(i);
        char y=str.charAt(j);
        String new_str="";
        
        for(int k=0;k<str.length();k++)
        {
            char ch=str.charAt(k);
            if(k==i)
            {
                ch=y;
            }
            else if(k==j)
            {
                ch=x;
            }
            new_str=new_str+ch;
        }
        return new_str;
    }
}