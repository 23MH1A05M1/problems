class Solution {
    public int secondHighest(String s) {
        // s = s.replaceAll("[a-z]", "");
        // int[] arr = new int[(s.length())];

        // for (int i = 0; i < s.length(); i++) {
        //     arr[i] = s.charAt(i) - '0';
        // }
        // if(arr.length == 0){
        //     return -1;
        // }
        // int large = arr[0];
        // int slarge = -1;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > large) {
        //         slarge = large;
        //         large = arr[i];
        //     } else if (arr[i] < large && arr[i] > slarge) {
        //         slarge = arr[i];
        //     }
        // }

        // return slarge;
            int large=-1;
            int slarge=-1;
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if(Character.isDigit(ch)){
            int digit=ch-'0';
            if(digit>large){
                slarge=large;
                large=digit;
            }
            else if(digit<large && digit>slarge){
                slarge=digit;
            }

           }
        }
        return slarge;
    }
}
