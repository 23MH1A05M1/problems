class Solution {
    public long sumAndMultiply(int n) {
        String x = "";
        int sum=0;
         if(n==0){
            return 0;
        }
        while(n>0){
           int res = n%10;
           if(res!=0){
            sum+=res;
            x=(res+x);
           }
            n=n/10;
        }
       
        long num = Long.parseLong(x);
        long mul=(long)sum*num;

        return mul;
    }
}