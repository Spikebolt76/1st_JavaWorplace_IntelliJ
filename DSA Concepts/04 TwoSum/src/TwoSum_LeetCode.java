import java.util.HashMap;
import java.util.Map;

// Linear Time Complexity : O(n)

public class TwoSum_LeetCode
{
    public static int[] twoSum(int[] arr, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < arr.length; i++)
        {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++)
        {
            int comp = target - arr[i];
            if (map.containsKey(comp) && map.get(comp) != i)
            {
                res[0] = i;
                res[1] = map.get(comp);
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 7, 11, 12, 4, 34};

        int target = 15;

        int[] result = twoSum(arr, target);
        System.out.println(result[0] +" and "+ result[1]);
    }
}
