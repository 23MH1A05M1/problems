class Solution {
    public long removeZeros(long n) {
        String convert=String.valueOf(n).replace("0","");
       Long res=Long.parseLong(convert);
        return res;
    }
}