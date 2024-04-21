import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int or=x;
        int sum=0;
        while(x>0){
            int rem = x%10;
            x=x/10;
            sum = sum*10 + rem;
        }
        // system.out.println(sum);
        if(sum==or)
        {
            return true;
        }
        else{
            return false;
        }
    }
}