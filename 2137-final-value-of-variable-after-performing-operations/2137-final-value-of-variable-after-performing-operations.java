class Solution {
    public int finalValueAfterOperations(String[] operations) {
      
        int sum=0;
       for(int i=0;i<operations.length;i++)
       {
        //  for(int j=0;j<operations[i].length();j++){
            if(operations[i].charAt(1)=='+')
            {
                sum+=1;
            }
            else if(operations[i].charAt(1)=='-')
            {
                sum-=1;
               }
       }
         return sum; 
    //             int c =0;
    //   for(int i=0;i<operations.length;i++)
    //   {
    //     if(operations[i].charAt(1)=='+')
    //     {
    //         c++;
    //     }
    //     else
    //     {
    //         c--;
    //     }
    //   }
    //   return c;
        
     
    
    }
}