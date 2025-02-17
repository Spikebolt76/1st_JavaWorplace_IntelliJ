import java.util.*;
import java.lang.Number;
class Solution {

    static public int lengthOfLongestSubstring(String str) {
        int maxLen = 0;
        ArrayList<String> subStr = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++)
        {
            for (int j = i; j <= str.length(); j++)
            {
                subStr.add(str.substring(i, j));
            }
        }

        for (String s : subStr) {
            boolean isUnique = true;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }
                if (!isUnique) break;
            }

            if (isUnique && s.length() > maxLen) {
                maxLen = s.length();
            }
        }
        return maxLen;
    }
}

public class LongestSubStringNonDuplicateChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println("The Length of the longest Substring of the given String tha does not have repeating characters is = "
        + Solution.lengthOfLongestSubstring(str));
    }
}
