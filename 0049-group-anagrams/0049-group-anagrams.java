class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> Anagrams = new ArrayList<>();
        HashMap<String,List<String>>map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(s);
        }
        for(Map.Entry<String,List<String>>entry:map.entrySet()){
            Anagrams.add(entry.getValue());
        }
        return Anagrams;
    }
}