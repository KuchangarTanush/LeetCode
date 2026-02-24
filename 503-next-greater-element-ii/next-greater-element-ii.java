class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        int []ans = new int[n];

        // logically 2 sized array
        for(int i=2 * n-1; i>=0; i--) {
            // circular
            int current = nums[i % n];

            // current's value >= stack top , we want stack to have greater elements
            while(!stk.isEmpty() && current >= stk.peek()) {
                stk.pop();
            }

            // we we are in logical array (0 -> n -1)
            if(i < n) {
                ans[i] = stk.isEmpty() ? -1 : stk.peek();
            }
    
            stk.push(current);
        }
        return ans;
    }
}