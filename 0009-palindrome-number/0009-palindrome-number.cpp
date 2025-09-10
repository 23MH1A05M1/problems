class Solution {
public:
long rev = 0;
int r =0;
   
    bool isPalindrome(int x) {
       if(x<0)
       {
         return false;
       }
        long n = x;
       while(n!=0)
       {
            r = n%10;
            rev = rev*10+r;
            n = n/10;
       }
        if(rev==x)
        {
            return true;
        }

        else{
           return false;
        }
       
    }
};