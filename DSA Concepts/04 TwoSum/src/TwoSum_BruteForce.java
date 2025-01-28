public class TwoSum_BruteForce
{
    public static int[] twoSum(int[] arr, int target)
    {
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == target)
                {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
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
