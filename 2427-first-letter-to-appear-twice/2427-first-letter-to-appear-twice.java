class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==2){
                return ch;
            }
        }
        // for(Map.Entry<Character,Integer>entry:map.entrySet()){
        //     if(entry.getValue()==2){
        //         return entry.getKey();
        //         // char res=entry.getKey();
        //         // return res;
        //         // // break;
        //     }
        // }
        return ' ';
    }
}