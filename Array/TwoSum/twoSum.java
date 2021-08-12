import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname twoSum
 * @Description Array=》twoSum
 * @Date 2021/8/11 11:42
 * @Created by tiga
 */
public class twoSum {

    public static void main(String[] args) {

        // while (true){
        //     int[] twoSum = twoSum(new int[]{2, 7, 11, 15}, 18);
        //     int[] twoSum = twoSum(new int[]{2,5,5,11}, 10);
        //     System.out.println("java output = " + Arrays.toString(twoSum));
        // }
        // System.out.printf("%s", Arrays.binarySearch(new int[]{2, 5, 5, 11},2,4,5));

        System.out.printf("%s \n", Arrays.binarySearch(new int[]{3, 2, 4},5));
        System.out.printf("%s", Arrays.binarySearch(new int[]{1, 2, 4},1));
    }

    /**
     * @param nums：
     * @param target：
     * @return java.lang.int[]
     * @Description 在数组中找到 2 个数之和等于给定值的数字，结果返回 2 个数字在数组中的下标。
     * @Created by tiga
     * @date 2021-8-11 17:08
     */
    public static int[] twoSum(int[] nums, int target ) {
        Map input = new HashMap(16);
        array2Map(nums, input);
        int[] output = new int[2];
        System.out.println("input = " + input);

        Arrays.sort(nums);
        for (int i : nums) {
            if (input.get(target - i)!=null) {
                output[0]=Arrays.binarySearch(nums, (Integer) input.get(target - i));
                output[1]=Arrays.binarySearch(nums,i==target - i?Arrays.binarySearch(nums,i):0,nums.length,i);
            }
        }
        return output;
    }

    /**
     * @param arr：
     * @param map：
     * @return java.util.Map
     * @Description 数组转map 此处不计入复杂度计算内
     * @Created by tiga
     * @date 2021-8-11 16:14
     */
    public static Map array2Map(int[] arr,Map map) {
        for (int i : arr) {
            map.put(i,i);
        }
        return map;
    }
    
    /**
     * @param arr：
     * @param index：
     * @return java.lang.String
     * @Description 数组元素下标 此处不计入复杂度计算内
     * @Created by tiga
     * @date 2021-8-11 16:12
     */
    public static int arrayEleOfIndex(int[] arr,int index) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : arr) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString().lastIndexOf(String.valueOf(index));
    }

}
