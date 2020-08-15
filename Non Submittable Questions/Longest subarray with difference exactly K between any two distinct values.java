// PLEASE TAKE A LOOK AT THE QUESTION HERE:
// https://www.geeksforgeeks.org/longest-subarray-with-difference-exactly-k-between-any-two-distinct-values/?ref=rp
// AS THE QUESTION DOES NOT HAVE A SUBMISSION OPTION HENCE THE CODE HAS BEEN WRITTEN AND STORED HERE

class Solution
{
  	public static void main(String[] args)
    {
        int nums[] = { 5, 7, 1, 1, 2, 4, 4, 4, 5, 5, 4, 5, 8, 9 };
        int k = 1;
        System.out.println(subarrayWithDifferenceExactlyK(nums, k));
    }
    
    public static int subarrayWithDifferenceExactlyK(int[] nums, int k)
    {
        int n = nums.length;
        if(n <= 1)
        {
            return 0;
        }
        // HashMap tp store the count of values in the sliding window
        HashMap<Integer, Integer> patternMap = new HashMap<Integer, Integer>();
        // Staet is the starting index of our sliding window
        // End is the ending index of our sliding window
        int end = 0;
        int start = 0;
        int ans = 0;
        while(end < n)
        {
            // The last value in our window
            int c = nums[end];
            // Increase count of value
            patternMap.put(c, patternMap.getOrDefault(c,0) + 1);
            // Increment end
            end++;
            
            // As we need the difference between any two distinct values to be k
            // we know that the sliding window should not contain more than 2
            // distinct elements. This is because lets say if there are 3 distinct
            // elements say a,b and c, we can never have the conditon:
            // Math.abs(a - b) = Math.abs(a - c) = Math.abs(b - c)
            // For example if array is {1, 1, 2, 2, 3, 3, 4, 4} and k is 1
            // If we consider {1, 1, 2, 2, 3, 3}, eventhough (1,2) and (2,3)
            // satisfy the condition, (3,1) does not.
            // Hencec if more than two elements in window we need to reduce window size
            while(patternMap.size() > 2)
            {
                // The starting element of window
                int cTemp = nums[start];
                // Reduce count of element
                patternMap.put(cTemp, patternMap.getOrDefault(cTemp,0) - 1);
                // If count becomes 0 then remove element
                if(patternMap.get(cTemp) == 0)
                {
                    patternMap.remove(cTemp);
                }
                // Increment start
                start++;
            }
            // If size is 2 that is we only have two distcint elements so check if
            // difference condition satisfies
            if(patternMap.size() == 2)
            {
                // Get list of elements
                ArrayList<Integer> arr = new ArrayList<Integer>(patternMap.keySet());
                // Check absolute difference
                if(Math.abs(arr.get(0)-arr.get(1)) == k)
                {
                    // Update length
                    ans = Math.max(ans, end-start);
                }
            }
        }
        return ans;
    }
}
