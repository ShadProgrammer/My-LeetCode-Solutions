class Solution {
    public int findMin(int[] nums) {
        int low = 0; int high = nums.length-1;
        int min = 9999;
        while (low <= high){
            int mid = (high + low)/2;

            if (nums[low] <= nums[mid]){
                min = Math.min(nums[low], min);
                low = mid+1;
            }
            else{
                min = Math.min(nums[mid+1], min);
                high = mid;
            }
        }
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna