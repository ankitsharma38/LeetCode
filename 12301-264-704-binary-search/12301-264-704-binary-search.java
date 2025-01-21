class Solution {
    public int search(int[] nums, int target) {
        int left =0; 
        int rigt=nums.length-1;
        while(left <= rigt){
            int mid = left +(rigt - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }else{
                rigt=mid-1;
            }
        }
        return -1;
    }
}