import java.util.HashMap;
import java.util.Map;

/**
 * @Classname twoSumOfOfficial
 * @Description Array=》twoSum 官方优解
 * https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
 * @Date 2021/8/12 14:14
 * @Created by tiga
 */
public class twoSumOfOfficial {

    /**
     * @param nums：
     * @param target：
     * @return int[]
     * @Description 方法一：暴力枚举 时间复杂度O(n^2) 空间复杂度：O(1)
     * @Created by tiga
     * @date 2021-8-12 14:33
     */
    public static int[] twoSumByEnum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * @param nums：
     * @param target：
     * @return int[]
     * @Description 方法二：哈希表 时间复杂度O(n) 空间复杂度：O(N)
     * @Created by tiga
     * @date 2021-8-12 14:36
     */
    public static int[] twoSumByHash(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

}
