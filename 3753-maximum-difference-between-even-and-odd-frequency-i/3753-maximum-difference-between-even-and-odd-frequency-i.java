class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int odd=Integer.MIN_VALUE;
        int even=Integer.MAX_VALUE;

       for(Map.Entry<Character,Integer>entry:map.entrySet()){
           if(entry.getValue()%2==1){
             odd=Math.max(odd,entry.getValue());
           }
           else{
             even=Math.min(even,entry.getValue());
           }
       }
       int res=odd-even;
       return res;
    }
}