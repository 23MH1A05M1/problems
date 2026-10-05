class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        for(char ch:mp.keySet()){
            pq.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char letter=pq.poll();
            int freq=mp.get(letter);
            for(int i=0;i<freq;i++){
            sb.append(letter);
            }
        }
        return sb.toString();
        }
}