class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //create a set for thr first array
        Set<Integer> set1 =new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }

        //create a set to store the intersection result
        Set<Integer> resultSet = new HashSet<>();
        for(int num :nums2){
            if(set1.contains(num)){
                resultSet.add(num);
            }
        }
        //convert the result result set to an int array
        int[] result =new int [resultSet.size()];
        int index =0;
        for(int num : resultSet){
            result[index++] = num;
        }
        return result;
    }
}