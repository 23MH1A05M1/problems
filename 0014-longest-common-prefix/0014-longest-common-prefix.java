class Solution {
    public String longestCommonPrefix(String[] strs) {
    //     if(strs.length==0 || strs==null){
    //         return "";
    //     }
    //    String first=strs[0];
    //    for(int i=0;i<first.length();i++){
    //     char ch = first.charAt(i);
    //     for(int j=1;j<strs.length;j++){
    //         if(i>=strs[j].length()){
    //             return first.substring(0,i);
    //         }
    //         if(ch!=strs[j].charAt(i)){
    //             return first.substring(0,i);
    //         }
    //     }

    //    }
    //    return first;

     String result="";
     Arrays.sort(strs);
       char[] first = strs[0].toCharArray();
       char[] last = strs[strs.length-1].toCharArray();
       for(int i=0;i<first.length;i++){
        if(first[i]==last[i]){
            result+=first[i];
        }
        else{
            break;
        }
       }
       return result.toString();
    }
}