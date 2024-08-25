import java.util.HashMap;
import java.util.Map;

public class twoSum {
        public int[] twoSum (int[] nums, int target) {

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i<= nums.length-1; i++) {

                int num2 = target - nums[i];

                if(map.containsKey(num2)) {
                    return new int[] {map.get(num2), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("Can't find sum of the numbers");
        }
    }