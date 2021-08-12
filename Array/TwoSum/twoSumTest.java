import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname twoSumTest
 * @Description 测试
 * @Date 2021/8/11 11:43
 * @Created by tiga
 */
public class twoSumTest {

    public static void main(String[] args) {

        //预期输出集
        Map<int[],Map<int[],Integer>> outputMap = new HashMap(16);

        //输入集
        Map<int[],Integer> inputMap = new HashMap(16),
        inputMap1 = new HashMap(16),
        inputMap2  = new HashMap(16),
        inputMap3 = new HashMap(16),
        inputMap4 = new HashMap(16);

        inputMap.put(new int[]{3, 2, 4},6);
        inputMap1.put(new int[]{3, 2, 4},5);
        inputMap2.put(new int[]{0, 8, 7, 3, 3, 4, 2}, 11);
        inputMap3.put(new int[]{0, 1}, 1);
        inputMap4.put(new int[]{0, 3}, 5);

        outputMap.put(new int[]{1, 2}, inputMap);
        outputMap.put(new int[]{0, 1}, inputMap1);
        outputMap.put(new int[]{1, 3}, inputMap2);
        outputMap.put(new int[]{0, 1}, inputMap3);
        outputMap.put(new int[]{}, inputMap4);

        /**
         * 特殊情况
         */
        Map<int[],Integer> inputMapTEST = new HashMap(16);
        inputMapTEST.put(new int[]{2,5,5,11}, 10);
        outputMap.put(new int[]{1,2}, inputMapTEST);

        for (Map.Entry<int[], Map<int[], Integer>> Entry : outputMap.entrySet()) {
            for (Map.Entry<int[], Integer> entry : Entry.getValue().entrySet()) {
                int[] temp = twoSum.twoSum(entry.getKey(), entry.getValue());

                //官方优解
                // int[] temp = twoSumOfOfficial.twoSumByEnum(entry.getKey(), entry.getValue());
                // int[] temp = twoSumOfOfficial.twoSumByHash(entry.getKey(), entry.getValue());
                //官方优解

                System.out.println("java output: "+Arrays.toString(temp)+",target: "+entry.getValue());
                System.out.println("预期 output: "+Arrays.toString(Entry.getKey())+"=>"+Arrays.equals(Entry.getKey(),temp)+"\n");
            }
        }

    }


}
