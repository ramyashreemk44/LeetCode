class Solution {
    public boolean areOccurrencesEqual(String s) {
        if (s.length() == 0) return false;

        Map<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        int target = -1;
        for (int freq : hm.values()) {
            if (target == -1) target = freq;
            else if (freq != target) return false;
        }

        return true;
    }
}
