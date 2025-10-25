class Solution {
    public int totalMoney(int n) {
       
        int sum=0;
        int start=1;
        while(n>0){
            for(int i=0;i<7&&n>0;i++){
                sum+=i+start;
                n--;
            }
            start++;
        }
         return sum;     
    }
}
