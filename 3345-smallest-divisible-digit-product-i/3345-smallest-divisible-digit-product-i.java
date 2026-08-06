class Solution {
    public int smallestNumber(int n, int t) {
        int flag=0;
        int res=0;
        while(flag!=1){
           int num=n;
            int pro=1;
            int digit=1;
            
            while(num>0){
                digit=num%10;
               pro*=digit;
               num=num/10;
            }
            if(pro%t==0){
                res=n;
                flag=1;
            }
            else{
                n++;
            }
        }
       return res;
    }
}