class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int i = 0;
        int j = 0;

        int n = nums.length;

        int[] ans = new int[n - k + 1];
        int idx = 0;

        Deque<Integer> dq = new LinkedList<>();

        while (j < n) {

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) {
                dq.pollLast();
            }

            dq.offerLast(j);   // index store karo

            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {

                ans[idx++] = nums[dq.peekFirst()];

                if (dq.peekFirst() == i) {
                    dq.pollFirst();
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}