class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    int[] arr = new int[friends.length];
    ArrayList<Integer>list=new ArrayList<>();
   for(int i:friends){
    list.add(i);
   }
   int index=0;
   for(int j:order){
    if(list.contains(j)){
        arr[index]=j;
        index++;
    }
   }
   return arr;
    }
}