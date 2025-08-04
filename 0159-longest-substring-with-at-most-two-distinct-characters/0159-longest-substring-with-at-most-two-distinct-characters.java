class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        char[] sarray=s.toCharArray();
        int i=0,j=0,result=0,n=s.length();
        HashMap<Character,Integer> hmap=new HashMap<>();
        while(j<n){
            
            hmap.put(sarray[j],hmap.getOrDefault(sarray[j],0)+1);

            if(hmap.size()<=2) result=Math.max(j-i+1, result);

            while(i<=j && hmap.size()>2){
                hmap.put(sarray[i], hmap.get(sarray[i])-1);
                if(hmap.get(sarray[i])==0)hmap.remove(sarray[i]);
                i++;
            }

            if(hmap.size()<=2) result=Math.max(j-i+1, result);

            j++;
        }
        return result;
    }
}