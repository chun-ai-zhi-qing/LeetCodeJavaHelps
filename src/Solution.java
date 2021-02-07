import java.util.Deque;
import java.util.PriorityQueue;

public class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int res = 0;
        int min = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min >= 0) min = nums[i];
            else min += nums[i];
            if (max <= 0) max = nums[i];
            else max += nums[i];
            res = Math.max(res, Math.abs(min));
            res = Math.max(res, Math.abs(max));
        }
        return res;
    }
}

