class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int pro=1;
        while(num>0){
            int digit = num%10;
              sum+=digit;
             pro *= digit;
            num=num/10;
        }
        int div = sum+pro;
        if(n%div == 0){
            return true;
        }
        return false;
    }
}