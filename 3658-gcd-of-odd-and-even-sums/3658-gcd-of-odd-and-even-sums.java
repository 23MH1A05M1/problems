class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
        }
    //    int min= Math.min(odd,even);
    //    int res=0;
    //     for(int i=min;i>=0;i--){
    //         if(even%i==0 && odd%i==0){
    //              res=i;
    //              break;
    //         }
    //     }
    //     return res;
    // while(even!=odd){
    //     if(even>odd){
    //         even=even-odd;
    //     }
    //     else{
    //         odd=odd-even;
    //     }
    // }
     while(even!=0 && odd!=0){
        if(even>odd){
            even=even%odd;
        }
        else{
            odd=odd%even;
        }
    }
    if(even!=0){
        return even;
    }
    return odd;
    }
}