class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || t.length() > s.length()) return "";

        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray())
            target.put(c, target.getOrDefault(c, 0) + 1);

        Map<Character, Integer> window = new HashMap<>();
        int required = target.size();  
        int formed = 0;

        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (target.containsKey(c) && window.get(c).intValue() == target.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIdx = l;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (target.containsKey(leftChar) && window.get(leftChar).intValue() < target.get(leftChar).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
}
