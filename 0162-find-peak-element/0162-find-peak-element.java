class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1){
            return 0;
        }

        int low = 1; int high = nums.length-2;

        while (low <= high){
            int mid = (low+high)/2;

            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if (nums[mid] > nums[mid+1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        int peak = (nums[0] > nums[nums.length-1]) ? 0 : nums.length-1; 
        return peak;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna