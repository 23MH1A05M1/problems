class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder str = new StringBuilder();
        // for(int i=0;i<num.length();i++){
        //     str.append(num.charAt(i));
        // }
    //   int j=str.length()-1;
    //   while(str.length()>0 && str.charAt(j)=='0' ){
    //     str.deleteCharAt(j);
    //   }
    //   String res=toString();
        int count=-1;
        for(int i=num.length()-1;i>=0;i--){
           while(count!=0){
            if(num.charAt(i)=='0'){
                i--;
            }
            else{
                count=0;
            }
           } 
           str.append(num.charAt(i));
        }
        String res=str.reverse().toString();
       return res;

    }
}