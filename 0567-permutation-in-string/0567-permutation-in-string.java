class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>map = new HashMap<>();
        int k=s1.length();
        // int i=0;
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int j=0;
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)-1);
           
          if((i+1-j)==k){
            boolean valid = true;
            for(char key:map.keySet()){
                
                if(map.get(key)!=0){
                   valid=false;
                   break;
                }
                
            }
            if(valid){
                return true;
            }
           
           char left = s2.charAt(j);
           map.put(left,map.getOrDefault(left,0)+1);
           j++;
          }
        }
          return false;
    }
}