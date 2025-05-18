class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int i=0,j=0,res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.size()>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                i++;
            }
        if(map.size()<=k){
            res=Math.max(res,j-i+1);
        }
        j++;
    }
    return res;
}
}