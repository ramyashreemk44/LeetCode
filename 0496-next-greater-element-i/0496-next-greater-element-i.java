class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store the next greater element for each number in nums2
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 and build the mapping using a monotonic decreasing stack
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                int smaller = stack.pop();
                nextGreater.put(smaller, num);
            }
            stack.push(num);
        }

        // Build the result array for nums1 using the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}
