class Solution {
    public int balancedStringSplit(String s) {
        int lc=0,rc=0,count=0;
        for(char c:s.toCharArray()){
            if(c=='L') {
                lc++;
            }
            if(c=='R') {
                rc++;
            }
            if(lc==rc) {
                count++;
                lc=0;rc=0;
            }
        }
        return count;
    }
}