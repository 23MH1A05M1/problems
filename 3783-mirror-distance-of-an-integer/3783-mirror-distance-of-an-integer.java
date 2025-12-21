class Solution {
    public int mirrorDistance(int n) {
        int number=n;
        int rev=0;
        while(n>0){
           int r=n%10;
            n=n/10;
           rev=rev*10+r;
        }
        int ans = Math.abs(number-rev);
        return ans;
    }
}