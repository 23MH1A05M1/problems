class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length-1;
        int boat=0;
        Arrays.sort(people);
        while(i<=j){

             if(people[i]+people[j]<=limit){
                // boat++;
                i++;
                j--;
            }
            else{
                j--;
            }
            boat++;
            // if(people[i]+people[j]>limit){
            //     if(people[i]==limit){
            //         boat++;
            //         i++;
            //     }
            //     else{
            //      boat++;
            //      j--;
            //     }
            // }
            // else if(people[i]+people[j]==limit || people[i]+people[j]<limit){
            //     boat++;
            //     i++;
            //     j--;
            // }
            // if(i==j ){
            //     // count++;
            //     boat++;
            //     break;
            // }


        }
        return boat;
    }
  
}
