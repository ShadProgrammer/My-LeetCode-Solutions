class Solution {
    public int mySqrt(int x) {
        long low = 1; long high = x;

        while (low <= high){
            long mid = (low + high)/2;

            if (mid*mid == x){
                return (int)mid;
            }
            else if (mid*mid < x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return (int)high;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna