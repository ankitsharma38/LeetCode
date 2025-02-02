class Solution {
    public int findPeakElement(int[] nums) {
        int left =0;
        int right = nums.length -1;

        //binary search loop
        while(left < right){
            int mid = left + (right- left)/2;

            //comparing mid with right
            if(nums[mid] > nums[mid+1]){
                //peaked is on left side(include wid)
                right=mid;
            }else{
                //peaked is on right
                left=mid+1;
            }
        }
        return left;
    }
}